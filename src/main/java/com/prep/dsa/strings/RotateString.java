package com.prep.dsa.strings;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if(n != m){ //if two strings not matched no chance of finding goal
            return false;
        }
        char[] sChar = s.toCharArray();
        for(int rotate = 0; rotate  < n; rotate++){
            sChar = rotateOnce(sChar);  //rotate method which rotates leftmost
            if(new String(sChar).equals(goal)) return true;
        }
        return false;
    }

    char[] rotateOnce(char[] arr){
        char firstChar = arr[0];
        System.arraycopy(arr,1,arr,0,arr.length-1);
        arr[arr.length-1] = firstChar;
        return arr;
    }
}
