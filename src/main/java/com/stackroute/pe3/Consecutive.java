package com.stackroute.pe3;

public class Consecutive {
    public String consFun(String inputString){

        String[] s =inputString.split(",");
        int arr[] = new int[s.length];
        for(int i=0; i<s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        for(int i=0;i<arr.length-1;i++) {
            if (arr[i + 1] - arr[i] == 1) {
            }
        }
        return "Consecutive";
    }
}