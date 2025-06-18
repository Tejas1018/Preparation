package com.prep.dsa.DynamicProgramming;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int dp[][] = new int[len+1][len+1];
        for(int curr_ind = len-1; curr_ind >= 0 ; curr_ind--){
            for(int prev_ind = curr_ind-1; prev_ind >= -1; prev_ind--){
                int notPick = 0 + dp[curr_ind+1][prev_ind+1];
                int pick = 0;
                if(prev_ind == -1 || nums[prev_ind] < nums[curr_ind]){
                    pick = 1 + dp[curr_ind+1][curr_ind+1];
                }
                dp[curr_ind][prev_ind+1] =  Math.max(pick,notPick);
            }
        }
        return dp[0][-1+1];
    }
}


/*public int lengthOfLIS(int[] nums) {
    return longest(-1,0,nums);
}*/

/*  RECURSION
 *  Time: O(2^n)
 *  Space: O(n) for recursion stack
 */
/*
int longest(int prev,int ind,int arr[]){
    //Base cond
    if(ind == arr.length){
        return 0;
    }
    int notPick = 0 + longest(prev,ind+1,arr);
    int pick = 0;
    if(prev == -1 || arr[prev] < arr[ind]){        //strictly incr.
        //Update prev with curr

        pick = 1 + longest(ind,ind+1,arr);
    }
    return Math.max(pick,notPick);
}*/



/*  MEMOIZATION
 *  Time: O(n^2)
 *  Space: O(n) for recursion stack + O(n) for dp array
 */
/*
public int lengthOfLIS(int[] nums) {
    int len = nums.length;
    int dp[][] = new int[len+1][len];
    for(int i = 0 ; i < dp.length; i++){
        Arrays.fill(dp[i],-1);
    }
    return longest(0,0,nums,dp);
}


int longest(int prev,int ind,int arr[],int dp[][]){
    //Base cond
    if(ind == arr.length){
        return 0;
    }
    if(dp[prev][ind] != -1) return dp[prev][ind];
    int notPick = 0 + longest(prev,ind+1,arr,dp);
    int pick = 0;
    int actual = (prev == 0) ? -1 : prev-1;
    if(actual == -1 || arr[actual] < arr[ind]){        //strictly incr.
        //Update prev with curr

        pick = 1 + longest(ind+1,ind+1,arr,dp);
    }

    return dp[prev][ind] =  Math.max(pick,notPick);
}*/

