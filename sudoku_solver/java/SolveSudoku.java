import java.util.*;

public class SolveSudoku {

    public static void main(String[] args) {
        char[][] board = {{'.', '.', '9', '7', '4', '8', '.', '.', '.'}, {'7', '.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '2', '.', '1', '.', '9', '.', '.', '.'}, {'.', '.', '7', '.', '.', '.', '2', '4', '.'}, {'.', '6', '4', '.', '1', '.', '5', '9', '.'}, {'.', '9', '8', '.', '.', '.', '3', '.', '.'}, {'.', '.', '.', '8', '.', '3', '.', '2', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.', '6'}, {'.', '.', '.', '2', '7', '5', '9', '.', '.'}};
        solveSudoku(board);
    }

    public static void solveSudoku(char[][] board) {
        solveSudoku(0, 0, board);
        printBoard(board);
    }

    private static void printBoard(char[][] board) {
        String[][] strBoard = new String[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                strBoard[i][j] = String.valueOf(board[i][j]);
            }
        }
        String[] printRow = new String[9];
        for (int i = 0; i < 9; i++) {
            printRow[i] = "\"" + String.join("\",\"", strBoard[i]) + "\"";
        }
        System.out.print("[[" + String.join("],[", printRow) + "]]");
    }

    private static boolean solveSudoku(int x, int y, char[][] board) {
        int count = 0;
        boolean isSolving = false;

        if (board[x][y] == '.') {
            for (int k = 1; k < 10; k++) {
                board[x][y] = (char) (k + '0');
                if (isValidSudoku(board)) {
                    if (y + 1 <= 8) {
                        isSolving = solveSudoku(x, y + 1, board);
                    } else if (y + 1 > 8 && x + 1 <= 8) {
                        isSolving = solveSudoku(x + 1, 0, board);
                    } else {
                        isSolving = isValidSudoku(board);
                    }
                }
                if (isSolving) {
                    return isSolving;
                }
            }
            if (!isSolving) {
                board[x][y] = '.';
            }
        } else {
            if (y + 1 <= 8) {
                isSolving = solveSudoku(x, y + 1, board);
            } else if (y + 1 > 8 && x + 1 <= 8) {
                isSolving = solveSudoku(x + 1, 0, board);
            } else {
                isSolving = isValidSudoku(board);
            }
        }
        return isSolving;
    }

    private static boolean isValidSudoku(char[][] board) {
        if (!isRowsValid(board)) {
            return false;
        }
        if (!isColumnsValid(board)) {
            return false;
        }
        if (!isMiniCellsValid(board)) {
            return false;
        }
        return true;

    }

    private static boolean isRowsValid(char[][] board) {
        boolean res = true;
        Map<String, Boolean> rowMap = null;
        for (int i = 0; i < 9; i++) {
            rowMap = new HashMap<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                } else if (rowMap.get(String.valueOf(board[i][j])) != null) {
                    res = false;
                    break;
                } else {
                    rowMap.put(String.valueOf(board[i][j]), true);
                }
            }
            if (!res) {
                break;
            }
        }
        return res;
    }

    private static boolean isColumnsValid(char[][] board) {
        boolean res = true;
        Map<String, Boolean> rowMap = null;
        for (int i = 0; i < 9; i++) {
            rowMap = new HashMap<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') {
                    continue;
                } else if (rowMap.get(String.valueOf(board[j][i])) != null) {
                    res = false;
                    break;
                } else {
                    rowMap.put(String.valueOf(board[j][i]), true);
                }
            }
            if (!res) {
                break;
            }
        }
        return res;
    }

    private static boolean isMiniCellsValid(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!isMiniCellValid(i, j, board)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isMiniCellValid(int xCellNum, int yCellNum, char[][] board) {
        boolean res = true;
        Map<String, Boolean> rowMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String boardValue = String.valueOf(board[(i + xCellNum * 3)][(j + yCellNum * 3)]);
                if (boardValue.equals(".")) {
                    continue;
                } else if (rowMap.get(boardValue) != null) {
                    res = false;
                    break;
                } else {
                    rowMap.put(boardValue, true);
                }
            }
            if (!res) {
                break;
            }
        }
        return res;
    }
}
