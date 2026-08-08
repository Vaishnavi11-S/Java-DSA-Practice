class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                minlen=Math.min(minlen,i-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(minlen==Integer.MAX_VALUE){
            return 0;
        }
        return minlen;
    }
}