public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (!haystack.contains(needle)) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            String sub = haystack.substring(i, i + needle.length());
            if (sub.equals(needle)) {
                return i;
            }
        }
        return 0;
    }
}