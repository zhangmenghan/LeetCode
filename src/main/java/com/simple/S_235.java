package com.simple;

import com.utils.TreeNode;

public class S_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((p == root) || (q == root) || (p == q)){
            return root;
        }
        if (p.val < root.val && q.val > root.val){
            return root;
        }
        if (p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if (p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
