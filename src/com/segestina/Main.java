package com.segestina;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrays = getIntegers(5);
        int[] sort = sortIntegers(arrays);
        printArrays(sort);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " Integer values. \r");
        int[] value = new int[number];
        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static void printArrays(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Elements " + i + ", typed value was " + arrays[i]);
        }
    }

    public static int[] sortIntegers(int[] arrays) {
//        int[] sortArrays = new int[arrays.length];
//        for (int i = 0; i < sortArrays.length; i++) {
//            sortArrays[i] = arrays[i];
//        } //Either this method

        int[] sortedArrays = Arrays.copyOf(arrays, arrays.length);  //Or this method
        boolean flag = true;
        int temp;
        while (flag) {
            flag =false;
            for (int i = 0; i < sortedArrays.length-1; i++) {
                if (sortedArrays[i] < sortedArrays[i+1]) {
                    temp = sortedArrays[i];
                    sortedArrays[i] = sortedArrays[i+1];
                    sortedArrays[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArrays;
    }
}
