class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (start < end) {
            if (isVowel(sb.charAt(start)) && isVowel(sb.charAt(end))) {
                sb.setCharAt(start, s.charAt(end));
                sb.setCharAt(end, s.charAt(start));
                start++;
                end--;
            }
            else if (isVowel(sb.charAt(start))) {
                end--;
            }
            else if (isVowel(sb.charAt(end))) {
                start++;
            }
            else {
                start++;
                end--;
            }
        }
        return sb.toString();
    }
    
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
