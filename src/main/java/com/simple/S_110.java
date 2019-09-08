package com.simple;

import com.utils.TreeNode;

public class S_110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        if(Math.abs(getH(root.left)-getH(root.right)) > 1)
            return false;
        else
            return isBalanced(root.left) && isBalanced(root.right);
    }

    public int getH(TreeNode root){
        if(root == null)
            return 0;
        int leftH = getH(root.left);
        int rightH = getH(root.right);
        return Math.max(leftH,rightH)+1;//树的节点长度要加上根节点的长度
    }
}
