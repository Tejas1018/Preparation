package com.prep.dsa.DynamicProgramming;

public class CuttingRod {
}

//Recursion
/*public class Solution {
    public int solve(int[] A) {
        int rod = A.length;
        return recursion(1,A,rod);
    }

    int recursion(int index,int price[],int rod){
        if(rod == 0){
            return 0;
        }
        if(rod < 0){
            return Integer.MIN_VALUE;
        }
        if(index >= price.length+1){
            return Integer.MIN_VALUE;
        }
        int notPick = recursion(index+1,price,rod);

        int pick = price[index-1] + recursion(index,price,rod-index);
        return Math.max(pick,notPick);
    }
}*/

//Memoization
/*
public class Solution {
    public int solve(int[] A) {
        int rod = A.length;
        int index = A.length;
        int dp[][] = new int[index+1][rod+1];       // (1-based index) -> [index+1][rod]

        for(int i = 0 ; i < dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return recursion(1,A,rod,dp);
    }

    int recursion(int index,int price[],int rod,int dp[][]){
        if(rod == 0){
            return 0;
        }
        if(rod < 0){
            return Integer.MIN_VALUE;
        }
        if(index >= price.length+1){
            return Integer.MIN_VALUE;
        }
        if(dp[index][rod] != -1){
            return dp[index][rod];
        }
        if(dp[index][rod] == -1){
            int notPick = recursion(index+1,price,rod,dp);
            int pick = price[index-1] + recursion(index,price,rod-index,dp);
            dp[index][rod] = Math.max(pick,notPick);
        }
        return dp[index][rod];
    }
}*/

