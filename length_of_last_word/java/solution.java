public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] worlds = s.split(" ");

        if (worlds.length == 0) {
            return 0;
        }

        int lastLenghtIndex = worlds[worlds.length - 1].length();
        return lastLenghtIndex;
    }
}