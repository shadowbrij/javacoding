package com.company.Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KPlacesApart {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(B == 0) return A;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < B; i++) {
            minHeap.add(A.get(i));
        }

        while(!minHeap.isEmpty()){
            if(B < A.size()){
                minHeap.add(A.get(B++));
            }
            ans.add(minHeap.poll());
        }
        return ans;
    }
}
