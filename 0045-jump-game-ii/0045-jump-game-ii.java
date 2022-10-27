class Solution {
    public int jump(int[] nums) {
        int jump =0;
        int furthest=0;
        int l=0 , r=0; 
       
       while(r < nums.length-1){
           for(int i=l;i<=r;i++){
               furthest= Math.max(furthest, nums[i]+i);
           }
           l = r+1;
           r = furthest;
           jump++;
          
        }
        
        return jump;
    }
}
