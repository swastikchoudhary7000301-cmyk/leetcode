class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
         
         HashMap<String,List<String>> map = new HashMap<>();
         for(int i=0;i<arr.length;i++){
            char[] ary = arr[i].toCharArray();
            Arrays.sort(ary);
            String key = new String(ary);
           
            if(map.containsKey(key)){
                map.get(key).add(arr[i]);
            }
            else {
                 List<String> temp = new ArrayList<>();
                 temp.add(arr[i]);
                map.put(key,temp);
            }
         }
         return new ArrayList<>(map.values());
    }
}