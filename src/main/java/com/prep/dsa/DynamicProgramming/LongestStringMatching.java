package com.prep.dsa.DynamicProgramming;

import java.util.Arrays;

public class LongestStringMatching {
    public int longestStrChain(String[] words) {
        int len = words.length;
        Arrays.sort(words,(a,b)->a.length()-b.length());

        int dp[] = new int[len];
        Arrays.fill(dp,1);
        int maxi = 0;
        for(int ind = 0; ind < len; ind++){
            for(int prev = 0; prev<ind; prev++){
                if(compare(words[ind],words[prev]) && dp[prev]+1 > dp[ind]){
                    dp[ind] = dp[prev] + 1;
                }
            }
            maxi = Math.max(maxi,dp[ind]);
        }
        return maxi;
    }

    boolean compare(String s,String t){
        if(s.length() != t.length()+1) return false;
        int first = 0;
        int second = 0;
        while(first < s.length()){
            if(second < t.length() && s.charAt(first) == t.charAt(second)){
                first++;
                second++;
            }
            else{
                first++;
            }
        }
        if(first == s.length() && second == t.length()) return true;
        return false;
    }

    public static void main(String[] args) {
        LongestStringMatching lsm = new LongestStringMatching();
        String[] words = {"a","b","ba","bca","bda","bdca"};
        int result = lsm.longestStrChain(words);
        System.out.println("Length of longest string chain: " + result); // Output: 4
    }
}
