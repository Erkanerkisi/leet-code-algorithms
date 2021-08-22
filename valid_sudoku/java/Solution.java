import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '.', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.print(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
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
                char boardValue = board[(i + xCellNum * 3)][(j + yCellNum * 3)];
                if (boardValue == '.') {
                    continue;
                } else if (rowMap.get(String.valueOf(boardValue)) != null) {
                    res = false;
                    break;
                } else {
                    rowMap.put(String.valueOf(boardValue), true);
                }
            }
            if (!res) {
                break;
            }
        }
        return res;
    }
}
