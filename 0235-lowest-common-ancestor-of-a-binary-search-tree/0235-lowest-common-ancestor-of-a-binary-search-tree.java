
class Solution {
    public TreeNode temp(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        int x = root.val;
        int y=p.val;
        int z=q.val;
       if ((x >= y && x <= z) || (x <= y && x >= z)){
            return root;
        }
      
        else if(x>y && x>z){
           return temp(root.left,p,q);
        }
        else{
           return temp(root.right,p,q);
        }

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       return temp(root,p,q);
        
    }
}