package com.yair.model;

public class Methods {

    public static int findTheSmallDistance(int[] arr){
        int index = 0;
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if (Math.abs(arr[i] - arr[i+1]) < distance){
                distance = Math.abs(arr[i] - arr[i+1]);
                index = i;
            }
        }
        return index;
    }
}
