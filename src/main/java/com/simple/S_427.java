package com.simple;

import com.utils.NewTreeNode;

public class S_427 {
    public NewTreeNode construct(int[][] grid) {
        return fun(grid,0,grid[0].length,0,grid.length);
    }
    public NewTreeNode fun(int[][] grid, int left, int right, int top, int bottom){
        NewTreeNode root = null;
        int key = grid[top][left];
        for(int i=top;i<bottom;i++){
            for(int j=left;j<right;j++){
                if(grid[i][j]!=key){
                    NewTreeNode topLeft = fun(grid,left,(left+right)/2,top,(top+bottom)/2);
                    NewTreeNode topRight = fun(grid,(left+right)/2,right,top,(top+bottom)/2);
                    NewTreeNode bottomLeft = fun(grid,left,(left+right)/2,(top+bottom)/2,bottom);
                    NewTreeNode bottomRight = fun(grid,(left+right)/2,right,(top+bottom)/2,bottom);
                    root = new NewTreeNode(false,false,topLeft,topRight,bottomLeft,bottomRight);
                    return root;
                }
            }
        }
        root = new NewTreeNode();
        root.val = key==1?true:false;
        root.isLeaf = true;
        return root;
    }
}
