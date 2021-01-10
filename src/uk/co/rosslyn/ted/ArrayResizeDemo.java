package uk.co.rosslyn.ted;

import java.util.Scanner;

public class ArrayResizeDemo {

        private static Scanner s = new Scanner(System.in);
        private static int[] baseData = new int[10];

       /* public static void main(String[] args) {
            System.out.println("Enter 10 integers:");
            getInput();
            printArray(baseData);
            resizeArray();
            System.out.println("Enter 12 integers:");
            getInput();
//        baseData[10] = 67;
//        baseData[11] = 34;
            printArray(baseData);

        }*/

        private static void getInput()
        {
            for(int i = 0; i < baseData.length; i++)
                baseData[i] = s.nextInt();
        }

        private static void printArray(int[] arr)
        {
            /*for(int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println(); */
            for (int j : arr) System.out.print(j + " ");
            System.out.println();
        }

        private static void resizeArray()
        {
            int[] original = baseData;

            baseData = new int[12];
            System.arraycopy(original, 0, baseData, 0, original.length);
        }

    }


