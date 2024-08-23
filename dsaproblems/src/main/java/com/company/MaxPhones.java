package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxPhones {
    public ArrayList<Integer> solve(ArrayList<Integer> A,ArrayList<Integer> B) {
        ArrayList<Integer> solution = new ArrayList<>();

        if (!A.isEmpty() && !B.isEmpty()) {
            Collections.sort(A);
            for (var b : B) {
                int total = 0;
                int index = 0;
                if(b > A.get(index)) {
                    while (b > 0 && index < A.size()) {
                        b -= A.get(index++);
                        total = b >=0 ? total+ 1 : total;
                    }
                }
                solution.add(total);
            }
        }
        return solution;
    }

    public int maxOperation(ArrayList<Integer>  A,int B){
        int nop = -1;
        Collections.sort(A);
        Integer[] array = new Integer[A.size()];
        array = A.toArray(array);
        int index = Arrays.binarySearch(array,B);
        if(index > -1) {
            for(int i = index;i < array.length -1; i++,index++)
                if(array[i] == array[i+1]) continue;
                else break;
            return A.size() - index -1;
        }
        return nop;
    }
 }
