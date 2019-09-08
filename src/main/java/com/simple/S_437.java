package com.simple;

import com.utils.TreeNode;

public class S_437 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null){
            return 0;
        }
        return pathSum(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }

    private int pathSumFrom(TreeNode root,int sum){
        if (root == null){
            return 0;
        }
        return (root.val == sum ? 1 : 0) + pathSumFrom(root.left,sum - root.val) + pathSumFrom(root.right,sum-root.val);
    }
}
