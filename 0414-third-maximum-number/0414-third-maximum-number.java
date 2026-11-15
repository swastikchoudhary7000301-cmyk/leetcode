
import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!ans.contains(nums[i])) {
                ans.add(nums[i]);
            }
        }

        Integer[] ar = ans.toArray(new Integer[0]);

        Arrays.sort(ar);

        if (ar.length < 3) {
            return ar[ar.length - 1];
        } else {
            return ar[ar.length - 3];
        }
    }
}
