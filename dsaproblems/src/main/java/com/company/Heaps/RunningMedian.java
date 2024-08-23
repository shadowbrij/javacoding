package com.company.Heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RunningMedian {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 == 02) return  0;
                if(o1 > o2) return 1;
                return  -1;
            }
        });
        ans.add(A.get(0));
        maxHeap.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            if(A.get(i) < ans.get(ans.size()-1)){
                maxHeap.add(A.get(i));
                if(maxHeap.size()  - minHeap.size() > 1){
                    minHeap.add(maxHeap.poll());
                }
            }
            else {
                minHeap.add(A.get(i));
                if(minHeap.size() > maxHeap.size()){
                    maxHeap.add(minHeap.poll());
                }
            }
            ans.add(maxHeap.peek());
        }
        return ans;
    }
}
