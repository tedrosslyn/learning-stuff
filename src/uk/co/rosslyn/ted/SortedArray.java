package uk.co.rosslyn.ted;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);

        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        //int[] sortedArray = new int[array.length]; //create new array
        /*for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i]; //copy the input array into new sortedArray
        }*/
        //alternatively:
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true; //while loop continues until flag is false
        int temp;
        while(flag) {
            //set flag to false - if for loop hasn't sorted all the numbers
            //set the flag back to true to go through loop again
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }

        }
        return sortedArray;
    }
}
