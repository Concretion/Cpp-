package com.omlucy;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author lucy
 */
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
    }


}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameTreeHelper(p, q);
    }

    public boolean isSameTreeHelper(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            return isSameTreeHelper(p.left, q.left) && isSameTreeHelper(p.right, q.right);
        }
        return false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}