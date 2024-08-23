package com.company.Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class AthLargestElement {
    public ArrayList<Integer> solve(int A, ArrayList<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int N = B.size();
        for (int i = 0; i < N; i++) {
            int current = B.get(i);
            if(i < A-1){
                ans.add(-1);
                minHeap.add(current);
            }
            else{
                if(minHeap.size() >= A){
                    if(current > minHeap.peek()){
                        minHeap.poll();//remove root
                        minHeap.add(current);// add to heap
                        ans.add(minHeap.peek());// add peek to ans
                    }
                    else {//current < peek. then don't do anything to heap
                        ans.add(minHeap.peek());
                    }
                }
                else {// to handle A == 1
                    ans.add(current);
                    minHeap.add(current);
                }

            }
        }
        return  ans;
    }
}
