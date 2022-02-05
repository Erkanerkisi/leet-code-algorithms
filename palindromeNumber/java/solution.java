public class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0) {
            return false;
        }

        int straight = x;
        int reverse = 0;
        while (straight > 0) {
            int lastDigit = straight % 10;
            reverse = reverse * 10 + lastDigit;
            straight /= 10;
        }

        if (x == reverse) {
            return true;
        } else {
            return false;
        }
    }
}