package com.company;

import java.util.Arrays;

/**
 * Created by UITS-Admin on 18.02.2018.
 */
public class Main {
    public static void main(String[] args) {
/*
        int a=10;
        String s = String.valueOf(a+1);
        String s1 = ""+a;
        System.out.println(s);
        System.out.println(s1);

        int a1;
        a1 = Integer.parseInt(s);
        System.out.println(a1);

        double a2;
        a2 = Double.parseDouble(s1);
        System.out.println(a2);
*/
/*
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8,9,10,11};

        System.out.println(Arrays.toString(a1));
        rewertArray(a1);
        System.out.println(Arrays.toString(a1));
*/
/*
        int[] a1 = {1, 3, 2, 10, 9, 7, 8, 5, 4, 11, 6};
        sortArray(a1);
        System.out.println(Arrays.toString(a1));
*/
/*
        int[] arr = {10, 20 ,30, 25};
        int pos = Arrays.binarySearch(arr, 25);
        System.out.println(pos);
*/
        int[] arr0 = {1,2,3,4,5,6};
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(arr0));
        System.out.println(Arrays.toString(arr1));

        System.arraycopy(arr0, 1, arr1, 2, 3);
        System.out.println(Arrays.toString(arr1));
    }

    private static void sortArray(int[] a1) {
        for (int i = a1.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a1[j] > a1[j+1]){
                    int temp = a1[j];
                    a1[j] = a1[j+1];
                    a1[j+1] = temp;
                }
            }
        }
    }

    private static void rewertArray(int[] a1) {
        for (int i = 0; i < a1.length/2; i++) {
            int temp = a1[i];
            a1[i] = a1[a1.length - 1-i];
            a1[a1.length - 1-i] = temp;
        }
    }
}
