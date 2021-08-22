import java.util.*;

public class SolveSudoku {

    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        solveSudoku(board);
    }

    public static void solveSudoku(char[][] board) {
        Map<String, List<String>> possibleValueMap = initalizeMap(board);
        String[][] stringBoard = createStringBoard(board);
        int count = 0;
        while (!possibleValueMap.isEmpty()) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (stringBoard[i][j].equals(".")) {
                        continue;
                    } else {
                        eliminetePossibleValueAndFindValue(i, j, stringBoard[i][j], possibleValueMap, stringBoard);
                    }
                    count++;
                }
            }

        }
        printBoard(stringBoard);
        transferBoard(stringBoard, board);
    }

    private static void transferBoard(String[][] stringBoard, char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = stringBoard[i][j].charAt(0);
            }
        }
    }

    private static void printBoard(String[][] stringBoard) {
        String[] printRow = new String[9];
        for (int i = 0; i < 9; i++) {
            printRow[i] = "\"" + String.join("\",\"", stringBoard[i]) + "\"";
        }
        System.out.print("[[" + String.join("],[", printRow) + "]]");
    }

    private static String[][] createStringBoard(char[][] board) {
        String[][] stringBoard = new String[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                stringBoard[i][j] = String.valueOf(board[i][j]);
            }
        }
        return stringBoard;

    }

    private static void eliminetePossibleValueAndFindValue(int x, int y, String value, Map<String, List<String>> possibleValueMap, String[][] board) {
        int gruopNum = ((x - (x % 3))) + ((y - (y % 3)) / 3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String coordinate = (i + (gruopNum - (gruopNum % 3))) + "," + (j + ((gruopNum % 3) * 3));
                if (possibleValueMap.get(coordinate) != null) {
                    if (possibleValueMap.get(coordinate).size() == 1) {
                        String findingValue = possibleValueMap.get(coordinate).get(0);
                        board[(i + (gruopNum - (gruopNum % 3)))][(j + ((gruopNum % 3) * 3))] = findingValue;
                        possibleValueMap.remove(coordinate);
                    } else {
                        removePossibleValue(value, possibleValueMap, coordinate);
                        if (possibleValueMap.get(coordinate).size() == 1) {
                            String findingValue = possibleValueMap.get(coordinate).get(0);
                            board[(i + (gruopNum - (gruopNum % 3)))][(j + ((gruopNum % 3) * 3))] = findingValue;
                            possibleValueMap.remove(coordinate);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            String coordinate = x + "," + i;
            if (possibleValueMap.get(coordinate) != null) {
                if (possibleValueMap.get(coordinate).size() == 1) {
                    String findingValue = possibleValueMap.get(coordinate).get(0);
                    board[x][i] = findingValue;
                    possibleValueMap.remove(coordinate);
                } else {
                    removePossibleValue(value, possibleValueMap, coordinate);
                    if (possibleValueMap.get(coordinate).size() == 1) {
                        String findingValue = possibleValueMap.get(coordinate).get(0);
                        board[x][i] = findingValue;
                        possibleValueMap.remove(coordinate);
                    }
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            String coordinate = i + "," + y;
            if (possibleValueMap.get(coordinate) != null) {
                if (possibleValueMap.get(coordinate).size() == 1) {
                    String findingValue = possibleValueMap.get(coordinate).get(0);
                    board[i][y] = findingValue;
                    possibleValueMap.remove(coordinate);
                } else {
                    removePossibleValue(value, possibleValueMap, coordinate);
                    if (possibleValueMap.get(coordinate).size() == 1) {
                        String findingValue = possibleValueMap.get(coordinate).get(0);
                        board[i][y] = findingValue;
                        possibleValueMap.remove(coordinate);
                    }
                }
            }
        }
    }

    private static void removePossibleValue(String value, Map<String, List<String>> possibleValueMap, String coordinate) {
        List<String> possibleValues = new ArrayList<>();
        possibleValues.addAll(possibleValueMap.get(coordinate));
        int idx = possibleValues.indexOf(value);
        if (idx != -1) {
            possibleValues.remove(idx);
            possibleValueMap.remove(coordinate);
            possibleValueMap.put(coordinate, possibleValues);
        }
    }

    private static Map<String, List<String>> initalizeMap(char[][] board) {
        String[] possibleValues = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Map<String, List<String>> possibleValueMap = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    possibleValueMap.put(i + "," + j, Arrays.asList(possibleValues));
                }
            }
        }
        return possibleValueMap;
    }
}
