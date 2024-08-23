package com.company.lists;

import java.util.ArrayList;
import java.util.Collections;

public class ListProblems {
    public int nobleInteger(ArrayList<Integer> A){
        Collections.sort(A);

        int N = A.size();
        int ans = 0;
        int count = 0;
        for (int i = N-2; i >=0; i++) {
            if(A.get(i) != A.get(i+1))
                ans++;
            if(A.get(i) == ans)
                count++;
        }
        return count;
    }
    public int elementRemoval(ArrayList<Integer> A) {
        Collections.sort(A);
        Collections.reverse(A);
        int N = A.size();
        int ans = 0;
        for(int i=0;i<N-1;i++){
            ans = ans + A.get(i)*(i+1);
        }
        return ans;
    }
}
