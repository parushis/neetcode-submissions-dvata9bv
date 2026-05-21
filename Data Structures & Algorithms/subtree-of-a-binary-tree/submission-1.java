/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // if root is null we can't compare 
        if (root == null) { return false; }

        // if subRoot is null, it is a valid substree automatically 
        if (subRoot == null) {return true; }

        // check if subRoot values are the same as root values
        if (isSameTree(root,subRoot)) { return true; }

        // otherwise keep moving recursively 
        return isSubtree(root.left,subRoot) || isSubtree(root.right, subRoot); 

    }

    // implement a helper function to check values
    public boolean isSameTree(TreeNode root, TreeNode subRoot) {
        // again, if values are null it's valid 
        if (root == null && subRoot == null) { return true; }

        // recursively check the values
        if (root != null && subRoot != null && root.val == subRoot.val) {
            return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right); 
        }

        return false; 
    }
}
