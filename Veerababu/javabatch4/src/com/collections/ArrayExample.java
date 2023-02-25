package com.collections;

import java.util.Arrays;

public class ArrayExample {
    void find3largest(int[] arr)
    {
        Arrays.sort(arr); // It uses Tuned Quicksort with
        // avg. case Time complexity = O(nLogn)
        int n = arr.length;
        int check = 0, count = 1;
 
        for (int i = 1; i <= n; i++) {
 
            if (count < 4) {
                if (check != arr[n - i]) {
                    // to handle duplicate values
                    System.out.print(arr[n - i] + " ");
                    check = arr[n - i];
                    count++;
                }
            }
            else
                break;
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
    	ArrayExample obj = new ArrayExample();
        int[] arr = { 12, 49, 1, -1, 45, 54, 23, 5, 0, -10 ,100};
        obj.find3largest(arr);
    }
}


