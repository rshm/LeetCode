class Solution {
    public int pivotIndex(int[] nums) {
        int sum =0;
        for(int x:nums)
            sum+=x;
        if(sum-nums[0] == 0)
            return 0;
        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1];
            if(nums[i-1] == (sum - nums[i]))
                return i;
        }
        return -1;
    }

    
}