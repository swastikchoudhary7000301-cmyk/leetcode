
import java.util.*;

class Solution {
    public int hIndex(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i <= n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) {
                    count++;
                }
            }

            if (count >= i) {
                temp.add(i);
            }
        }

        Collections.sort(temp);

        return temp.get(temp.size() - 1);
    }
}
