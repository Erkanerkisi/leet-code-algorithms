class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0){
            return "";
        }
        for(int i = s.length(); i >0; i--){
            for(int j = 0; j+i <= s.length(); j++){
                if(isPalindrom(j,j+i, s)){
                    return s.substring(j, j+i);
                
                }
            }
        }
        return "";
    }
    
    
    private boolean isPalindrom(int indexFirst, int indexLast,String s){
        if(s.length() == 0){
            return false;
        }
        String subStr = s.substring(indexFirst, indexLast);
        int j = subStr.length()-1;
        for(int i = 0; i < subStr.length(); i++){
            if(subStr.charAt(i) != subStr.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
