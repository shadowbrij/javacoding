package com.company.Heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class NMaxPairComb {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int N = A.size();
        ArrayList<Integer> ans = new ArrayList<>();

        if(N == 1){
            ans.add(A.get(0)+B.get(0));
            return ans;
        }

        PriorityQueue<Integer> maxHeapA = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });
        PriorityQueue<Integer> maxHeapB = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });

        int maxA = maxHeapA.poll();
        int maxB = maxHeapB.poll();
        ans.add(maxA+maxB);

        while(!maxHeapA.isEmpty()){
            int peekA = maxHeapA.poll();
            int peekB = maxHeapB.poll();

            if(maxA > maxB){
                ans.add(maxA+peekB);
                ans.add(maxB+peekA);
            }
            else{
                ans.add(maxB+peekA);
                ans.add(maxA+peekB);
            }

            ans.add(peekA+peekB);
            maxA = peekA;
            maxB = peekB;
        }
        return ans;
    }
}
