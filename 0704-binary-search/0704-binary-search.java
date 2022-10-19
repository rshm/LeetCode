class Solution {
    public int search(int[] a, int target) {
        int start = 0;
        int end = a.length-1;
        int mid = (start+end)/2;
        
        while(start<=end){  //0, 5
            mid = (start+end)/2;   //2 
            if(a[mid]<target) //3<9
                start = mid+1;  //start= 2
            else if(a[mid]>target)
                end = mid-1;
            else
                return mid;
        }
        
        return -1;
    }
}