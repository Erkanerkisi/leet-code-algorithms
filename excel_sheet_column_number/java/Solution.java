class Solution {
    public int titleToNumber(String columnTitle) {
        int columnNumber = 0;
        int columnFactor = 1;
        for (int i = columnTitle.length() - 1; i > -1; i--) {
            columnNumber += (columnTitle.charAt(i) - '@') * columnFactor;   // ASCII character before 'A' is '@'
            columnFactor *= 26;
        }
        return columnNumber;
    }
}
