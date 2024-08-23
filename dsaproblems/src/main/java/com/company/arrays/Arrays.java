package com.company.arrays;

import java.util.*;


public class Arrays {
    //[-8,-7,-1,-1,0,1,1,3,4,4,4]
    //[[-1,0,1],[-7,3,4],[-8,4,4]]
    public int sumofAdjEvenAfterNremoval(ArrayList<Integer> A){
        int totaleven = 0;
        int totalodd = 0;
        for(int a : A){
            if(a%2 == 0){
                totaleven++;
            }
            else totalodd++;
        }

        return  Math.min(totaleven,totalodd);
    }
    public ArrayList<Integer> sumRows(ArrayList<ArrayList<Integer>> A){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int N = A.size();
        int M = A.get(0).size();

        for(int i=0;i<N;i++){
            int sum = A.get(0).stream().reduce(0,(a,b)->a+b);
            ans.add(sum);
        }
        return ans;
    }
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums.length == 0 ) return null;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int toFind = target-nums[i];
            if(map.containsKey(toFind)){
                int rs = map.get(toFind);
                result[0] = Math.min(i,rs);
                result[1] = Math.max(i,rs);
            }
            else map.put(nums[i],i);

        }
        return result;
        
    }
    public int[] commonElem(int[] A, int[] B) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        java.util.Arrays.sort(B);
        for (int i = 0; i < B.length; i++) {
            if(map.containsKey(B[i])) {
                int ov = map.get(B[i]);
                map.replace(B[i],ov,ov +1);
            }
            else map.put(B[i],1);
        }

        for(int i = 0; i < A.length;i++){
            if(java.util.Arrays.binarySearch(B,A[i]) >= 0);
            {
                if(map.containsKey(A[i]) && map.get(A[i]) > 0) {
                    result.add(A[i]);
                    map.replace(A[i],map.get(A[i])-1);
                }
            }
        }
        int [] arr = new int[result.size()];
        int index = 0;
        for(int a: result){
            arr[index] = a;
            index++;
        }
        return arr;
    }
    int maxMod(int[] A){
        int maxMod = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                maxMod = Math.max(A[i]%A[j],maxMod);
            }
        }
        return maxMod;
    }
   //TODO  Unfinished
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        java.util.Arrays.sort(nums);
//        int front =0,back =0;
        int n = nums.length;
        int i = 0,j = n-1;
        int sum = 0;
        while ( i < j) {
            if(nums[i] + nums[j] < 0){
                sum = nums[i] + nums [j] + nums [j-1];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[j], nums[j - 1]));
                }
                adjustPointers(sum,i,j);
            }
            else {
                sum = nums[i] + nums [i+1] + nums [j];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[i+1], nums[j]));
                }
                adjustPointers(sum,i,j);
            }
        }
        return result;
    }
    static void adjustPointers(int sum,int i,int j){
        if (sum == 0){
            i++;
            j--;
        }
        else if(sum < 0){
            i++;
        }
        else{
            j--;
        }
    }
}
