class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
       int i=1;

        while(i<nums.length){
           if(nums[i-1]!=nums[i]){
            return nums[i-1];
           }
           if(i==nums.length-2){
            return nums[nums.length-1];
           }
           else i=i+2;
        }
        return 0;
    }
}