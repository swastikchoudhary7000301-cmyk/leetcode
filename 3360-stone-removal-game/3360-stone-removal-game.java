class Solution {
    public boolean canAliceWin(int n) {
        int count = 10;
        while(n!=0){
             if(count>n){
                return false;
             }
             else{
                n = n-count;
                count--;
             }
              if(count>n){
                return true;
             }
             else{
                n = n-count;
                count--;
             }
        }
        return false;
    }
}