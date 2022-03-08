public class Solution {
    public static String generateTheString(int n) {
        char[] characters = new char[n];
        Arrays.fill(characters, 'a');
        if (n % 2 == 0) {
            characters[0] = 'b';
        }
        return new String(characters);
    }
}