package com.utils;

public class NewTreeNode {
    public boolean val;
    public boolean isLeaf;
    public NewTreeNode topLeft;
    public NewTreeNode topRight;
    public NewTreeNode bottomLeft;
    public NewTreeNode bottomRight;

    public NewTreeNode() {}

    public NewTreeNode(boolean _val, boolean _isLeaf, NewTreeNode _topLeft, NewTreeNode _topRight, NewTreeNode _bottomLeft, NewTreeNode _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};