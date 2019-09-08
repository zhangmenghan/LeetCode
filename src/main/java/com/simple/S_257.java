package com.simple;
import com.utils.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class S_257 {
    public List<String> binaryTreePaths_more_concise(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        if (root == null) {
            return paths;
        }
        dfs(root, paths, "");
        return paths;
    }

    private void dfs(TreeNode root, List<String> paths, String path) {
        if (root.left == null && root.right == null) {
            paths.add(path + root.val);
            return;
        }
        path += root.val + "->";
        if (root.left != null) {
            dfs(root.left, paths, path);
        }
        if (root.right != null) {
            dfs(root.right, paths, path);
        }
    }
}
