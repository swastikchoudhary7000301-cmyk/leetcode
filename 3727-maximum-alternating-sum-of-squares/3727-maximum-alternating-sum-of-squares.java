class Solution {
    public long maxAlternatingSum(int[] nums) {
        
Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

Arrays.sort(arr, (a, b) ->
    Integer.compare(Math.abs(a), Math.abs(b))
);
        int[] ans = new int[nums.length];
        int lo =0;
        int hi=arr.length-1;
       int n = arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=arr[hi];
                hi--;
            }
            else {
                ans[i]=arr[lo];
                lo++;
            }
        }
        long score = 0;
        for(int i=0;i<n;i++){
            long s=0;
              s = (long)ans[i]*ans[i];
              if(i%2==0){
                score = score + s;
              }
              else score = score - s;
        }
        return score;
    }
}