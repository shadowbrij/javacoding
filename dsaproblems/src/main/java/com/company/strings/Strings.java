package com.company.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Strings {
    public String addBinaryNumbers(String A, String B){
        StringBuilder sb = new StringBuilder();
        int N = A.length();
        int M = B.length();
        boolean carry = false;
        while(N > 0 || M > 0){
            char a = N>0? A.charAt(N-1): '0';
            char b = M> 0? B.charAt(M-1): '0';
            if(a == '1' && b == '1')
            {
                if(carry)
                    sb.append('1');
                else sb.append('0');
                carry = true;
            }
            else if( a == '0' && b == '0' )
            {
                if(carry)
                    sb.append('1');
                else sb.append('0');
                carry= false;
            }
            else
            {
                if (carry)
                {
                    sb.append('0');
                    carry = true;
                }
                else {
                    sb.append('1');
                }
            }

            N--;M--;
        }
        return  sb.toString();
    }
    public int numberOfSubsWithEqZeroAndOne(String str){
        int count = 0;
        if(str.isEmpty()) return 0;
        char[] ch = str.toCharArray();
        int zc  = 0;
        int oc = 0;
        int index = 0;
        for(char c : ch){
            if(c == '0') zc++;
            if(c == '1') oc++;
            if(zc == oc){
                count ++;
                zc = oc = 0;
            }
        }
        
        return count;
    }

    //TODO: Wow - Below solution worked after trying so many times
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;

        int length =0,maxlength = 0,index=0;
        int lastIndex=0;
        Map<Character,Integer> map= new HashMap<>();

        for(char c: s.toCharArray()){
            if(!map.containsKey(c)){
              map.put(c,index);
              length++;
            }
            else {
                lastIndex = Math.max(lastIndex,map.get(c));
                maxlength = Math.max(maxlength,length);
                length = index-lastIndex;
                map.replace(c,index);
            }
            index++;
        }
        maxlength = Math.max(maxlength,length);

        return maxlength;
    }

}
