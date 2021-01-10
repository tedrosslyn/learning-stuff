package uk.co.rosslyn.ted;

import java.util.Scanner;

import static java.lang.System.*;

public class ArrayResizeDemo {

        private static Scanner s = new Scanner(in);
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
            for (int j : arr) out.print(j + " ");
            out.println();
        }

        private static void resizeArray()
        {
            int[] original = baseData;

            baseData = new int[12];
            arraycopy(original, 0, baseData, 0, original.length);
        }

    }


