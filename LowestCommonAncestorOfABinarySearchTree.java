// Time Complexity : O(N) N is the number of TreeNodes in the given binary search tree
// Space Complexity : O(H) H is the height of the binary search tree
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null)    return null;
        
        //as this is a binary search tree search to the left subtree if p and q values are less than the root node's value.
        
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(p.val > root.val && q.val > root.val){     // search to the right subtree if p and q values are greater than the root node's value.
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;  //we have found our LCA in a BST.
    }
}
