public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String prefix = "";
        String result = "";

        for (int i = 0; i < strs[0].length(); i++) {
            prefix = strs[0].substring(0, i + 1);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].indexOf(prefix) != 0) {
                    return result;
                }
            }
            result = prefix;
        }
        return result;
    }
}