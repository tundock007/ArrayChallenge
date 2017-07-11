package com.Olatunde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter the number of integers to be sorted: ");
        int numberOfInt = scanner.nextInt();
        System.out.println("Please enter the numbers to be sorted");

        while (numbers.size() < numberOfInt) {
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers);

        for(int i=0; i<numbers.size(); i++) {
            System.out.println("Element in position " + i + " is " + numbers.get(i));
        }
       // System.out.println("List of numbers in the Array sorted :" + numbers);


//        int[] myIntegers = getIntegers(5);
//        int[] sorted = sortIntegers(myIntegers);
//        printArray(sorted);
//    }
//
//    public static int[] getIntegers(int capacity) {
//        int[] array = new int[capacity];
//        System.out.println("Enter " + capacity + " integer values:\r");
//        for(int i=0; i<array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }
//
//    public static void printArray(int[] array) {
//        for(int i=0; i<array.length; i++) {
//            System.out.println("Element " + i + " contents " + array[i]);
//        }
//    }
//
//    public static int[] sortIntegers(int[] array) {
////        int[] sortedArray = new int[array.length];
////        for(int i=0; i<array.length; i++) {
////            sortedArray[i] = array[i];
////        }
//
//        int[] sortedArray = Arrays.copyOf(array, array.length);
//        boolean flag = true;
//        int temp;
//        while(flag) {
//            flag = false;
//            for(int i =0; i<sortedArray.length-1; i++) {
//                if(sortedArray[i] < sortedArray[i+1]) {
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = temp;
//                    flag = true;
//                }
//            }
//        }
//        return sortedArray;
  }
}
