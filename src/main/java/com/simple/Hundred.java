package com.simple;

import com.util.TreeNode;

public class Hundred {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null)
            return p == q;
        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public static void main(String[] args) {
        Hundred hundred = new Hundred();

    }
}
