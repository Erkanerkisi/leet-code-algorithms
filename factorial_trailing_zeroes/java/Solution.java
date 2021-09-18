class Solution {
    /*
     * Uses the fact that for a zero at the end to be, 
     * there needs to be a 5 corresponding to a 2 in multiplication.
     */
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n; // Add the number of 5 occurences to the count
        }
        return count;
    }
}
