package com.company;

import com.company.Heaps.NMaxPairComb;
import com.company.Heaps.SpecialMedian;
import com.company.arrays.Arrays;
import com.company.lists.ListProblems;
import com.company.strings.Strings;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Arrays ar = new Arrays();
//        int[] res = ar.commonElem(new int[]{1,2,2,1},new int[]{2,1,3,2});
        new SpecialMedian().solve(new ArrayList<>(List.of(2147483647, -2147483648, 0)));
        new NMaxPairComb().solve(new ArrayList<>(List.of(3, 2, 4, 2)),new ArrayList<>(List.of( 4, 3, 1, 2)));
/*
A : [ 36, 27, -35, 43, -15, 36, 42, -1, -29, 12, -23, 40, 9, 13, -24, -10, -24, 22, -14, -39, 18, 17, -21, 32, -20, 12, -27, 17, -15, -21, -48, -28, 8, 19, 17, 43, 6, -39, -8, -21, 23, -29, -31, 34, -13, 48, -26, -35, 20, -37, -24, 41, 30, 6, 23, 12, 20, 46, 31, -45, -25, 34, -23, -14, -45, -4, -21, -37, 7, -26, 45, 32, -5, -36, 17, -16, 14, -7, 0, 37, -42, 26, 28 ]
B : [ 38, 34, -47, 1, 4, 49, -18, 10, 26, 18, -11, -38, -24, 36, 44, -11, 45, 20, -16, 28, 17, -49, 47, -48, -33, 42, 2, 6, -49, 30, 36, -9, 15, 39, -6, -31, -10, -21, -19, -33, 47, 21, 31, 25, -41, -23, 17, 6, 47, 3, 36, 15, -44, 33, -31, -26, -22, 21, -18, -21, -47, -31, 20, 18, -42, -35, -10, -1, 46, -27, -32, -5, -4, 1, -29, 5, 29, 38, 14, -22, -9, 0, 43 ]

97 95 95 95 95 94 94 93 93 93 93 92 92 92 92 92 92 92 91 91 91 91 90 90 90 90 90 90 90 90 90 90 89 89 89 89 89 89 89 89 88 88 88 88 88 88 88 88 87 87 87 87 87 87 87 87 87 86 86 86 86 86 86 86 86 85 85 85 85 85 85 85 85 84 84 84 84 84 84 84 84 84 84
* */
//        Strings ob = new Strings();
//        //int res = ob.numberOfSubsWithEqZeroAndOne("10010100111100001011");
//        int res = ob.lengthOfLongestSubstring("anviaj");


//        var res = ar.threeSum (new int[]{-1,0,1,2,-1,-4});
//        System.out.println(java.util.Arrays.toString(res));
//        System.out.println(res.toString());
        //write your code here
//        ArrayList<Integer> A = new ArrayList<>(List.of(23, 36, 58, 59 ));
        ArrayList<Integer> B = new ArrayList<>(List.of(10, 3, 7  ));
//        List<Character> vol = new ArrayList<>(List.of('a','e'));
//        ArrayList<Integer> C= new ArrayList<>(List.of(24, 33, 13, 11, 30, 28, 19, 8, 30, 25, 42, 6, 30, 49, 3, 49, 24, 13, 3, 50));
//        MaxPhones mp = new MaxPhones();
//        //var res = mp.solve(A,B);
        var res = new ListProblems().elementRemoval(B);

    }
}
