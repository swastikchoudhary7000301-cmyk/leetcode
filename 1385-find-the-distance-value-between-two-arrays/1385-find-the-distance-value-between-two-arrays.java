class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        int ans = 0;
        int dis=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                dis = arr1[i]-arr2[j];
                if(dis<0){
                    dis=dis*-1;
                }
                if(dis<=d){
                       count ++;
                }
            }
            if(count == 0){
                ans++;
            }
            count = 0;
        }
        return ans;
    }
}