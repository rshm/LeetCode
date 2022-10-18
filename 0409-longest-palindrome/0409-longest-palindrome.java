class Solution {
    public int longestPalindrome(String s) {
        int length =0;
        if(s.length() == 1)
            return 1;
        else{
            int [] count = new int[128];
            for(char c: s.toCharArray()){
                count[c]++;
            }
            for(int i:count){
                length += i/2 *2;
                if(length%2 == 0 && i%2 ==1 )
                    length++;
            }
        }
        
        return length;
    }
}