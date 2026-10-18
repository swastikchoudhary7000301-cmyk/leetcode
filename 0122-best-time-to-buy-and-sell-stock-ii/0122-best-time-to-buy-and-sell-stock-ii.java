class Solution {
    public int maxProfit(int[] arr) {
        int p=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]>0){
                 p = p + arr[i]-arr[i-1];
            }
        }
        return p;
    }
}