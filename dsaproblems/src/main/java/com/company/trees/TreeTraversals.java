package com.company.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TreeTraversals {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();

        queue.addLast(A);
        TreeNode last = A;
        ArrayList<Integer> level = new ArrayList<>();

        while(!queue.isEmpty()){
            TreeNode front = queue.removeFirst();
            level.add(front.val);

            if(front.left != null){
                queue.addLast(front.left);
            }
            if(front.right != null){
                queue.addLast(front.right);
            }
            if(front == last){
                ans.add(level);
                last = queue.peekLast();
                level = new ArrayList<>();
            }
        }

        return ans;
    }
}
