package com.company.Heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SpecialMedian{
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        if(N == 1) return 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });
        maxHeap.add(A.get(0));
        minHeap.add(A.get(0));

        for(int i=1;i<N;i++){
            if(A.get(i) == (minHeap.peek()+maxHeap.peek())/2.0) return 1;
            minHeap.add(A.get(i));
            maxHeap.add(A.get(i));
        }
        minHeap.clear();
        maxHeap.clear();

        maxHeap.add(A.get(N-1));
        minHeap.add(A.get(N-1));
        for(int i=N-2;i>=0;i--){
            if(A.get(i) == (minHeap.peek()+maxHeap.peek())/2.0) return 1;
            minHeap.add(A.get(i));
            maxHeap.add(A.get(i));
        }

        return 0;
    }
}
