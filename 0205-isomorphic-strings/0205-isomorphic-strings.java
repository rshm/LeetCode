class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())
            return false;
      
        int map_st[] = new int[256];    
        int map_ts[] = new int[256];    
        Arrays.fill(map_st, -1);         
        Arrays.fill(map_ts, -1);       
        
        for(int i=0;i<s.length();i++){
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            
            if(map_st[sch] == -1 && map_ts[tch] == -1 ){
                map_st[sch] = tch;
                map_ts[tch] = sch;
            }
            
            else if(!(map_st[sch] == tch && map_ts[tch] == sch))
                return false;
            
        }
        
        return true;
        
    }
}