/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //latest v failed
        // version>>v bad
        //binary check
        int beg = 1;
        int end = n;
        int mid =0 ;
       
        
        while(beg<=end){
            mid = end+ (beg-end)/2;  
            if(isBadVersion(mid))  {
                end = mid-1;
            }
            else{
                beg = mid+1;
            }
        }
        
        return beg;
          
    }
}