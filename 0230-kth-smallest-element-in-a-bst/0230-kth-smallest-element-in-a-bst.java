import java.util.*;

class Solution {
    public void check(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        arr.add(root.val);

        check(root.left, arr);
        check(root.right, arr);
    }

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        check(root, arr);

        Collections.sort(arr);

        return arr.get(k - 1);
    }
}