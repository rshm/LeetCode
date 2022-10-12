class Solution {
    public boolean isSubsequence(String s, String t) {
       
       if(s.length() == 0 && t.length() == 0)
            return true;
       else if(t.length() ==0)
            return false;
             int j = -1;
        
       for(int i = 0 ;i <s.length();i++){
           j = t.indexOf(s.charAt(i) , j+1);
           if(j == -1)
               return false;
       } 
        return true;
         
    }
    
  
}