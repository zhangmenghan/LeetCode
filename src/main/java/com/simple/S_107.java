package com.simple;

import com.util.TreeNode;

import java.util.*;

public class S_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null)
            return result;

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while (!q.isEmpty()){
            List<Integer> thisLevel = new ArrayList<Integer>();
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                TreeNode curr = q.poll();
                thisLevel.add(curr.val);
                if(curr.left != null)
                    q.offer(curr.left);
                if(curr.right != null)
                    q.offer(curr.right);
            }
            result.add(thisLevel);
        }
        Collections.reverse(result);
        return result;
    }

}
