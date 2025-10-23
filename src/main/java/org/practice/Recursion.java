package org.practice;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j <= arr.length  -i- 1; j++) {
//                if (arr[j-1] > arr[j]) {
//                    int temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        int n = arr.length - 1;

        System.out.println(bubble(arr, 0, arr.length - 1, 4));

    }

    static int bubble(int[] arr, int s, int e, int target) {
        if (s > e) {
            return -1;
        }
        int mid = (s + e) / 2;
        if (arr[mid] == target) {
            return target;
        }
        if (arr[mid] < target) {
            bubble(arr, mid + 1, e, 4);
        }

            return bubble(arr, s, mid - 1, 4);


    }
}

