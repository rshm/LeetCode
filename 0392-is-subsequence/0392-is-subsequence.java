class Solution {
    public boolean isSubsequence(String s, String t) {
       
        if(s.length() == 0 && t.length() == 0)
            return true;
         else if(t.length() ==0)
            return false;
                return isSub(s,t);
         
    }
    
    public boolean isSub(String small, String large){
        int j = -1;
       for(int i = 0 ;i <small.length();i++){
           j = large.indexOf(small.charAt(i) , j+1);
           
           if(j == -1)
               return false;
           
       } 
        return true;
    }
}