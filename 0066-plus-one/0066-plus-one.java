class Solution {
    public int[] plusOne(int[] num) {
        int n = num.length;
        if(num[n-1]<9){
            num[n-1]=num[n-1]+1;
        }
        else{
            int i = n-1;
            while(i>=0 && num[i]==9){
                num[i]=0;
                i--;
            }
           if(i>=0){
            num[i]=num[i]+1;
           }
           else {
            int[] ans = new int[n+1];
            ans[0]=1;
            return ans;
           }
        }
      return num;
    }
  
}