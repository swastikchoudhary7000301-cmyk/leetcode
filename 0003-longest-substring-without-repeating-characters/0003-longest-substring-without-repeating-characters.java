class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;
        int lo =0;
        for(int i=0;i<s.length();i++){
            
            if(map.containsKey(s.charAt(i))){
                 max = Math.max(count,max);
                while(s.charAt(lo)!=s.charAt(i)){
                    map.remove(s.charAt(lo));
                    lo++;
                    count--;
                }
                map.remove(s.charAt(lo));
                count--;
                lo++;
                map.put(s.charAt(i),i);
                count++;
               
                
            }
            else{
                map.put(s.charAt(i),i);
                count++;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}