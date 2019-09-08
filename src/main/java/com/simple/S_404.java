package com.simple;

import com.utils.TreeNode;

public class S_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root == null){
            return sum;
        }
        return dfs(root,sum,false);
    }

    private int dfs(TreeNode root,int result,boolean left){
        if (root.left == null && root.right == null && left){
            result += root.val;
            return result;
        }
        int leftResult = 0;
        if (root.left != null){
            left = true;
            leftResult = dfs(root.left,result,left);
        }
        int rightResult = 0;
        if (root.right != null){
            left = false;
            rightResult = dfs(root.right,result,left);
        }
        return  leftResult + rightResult;
    }
}
