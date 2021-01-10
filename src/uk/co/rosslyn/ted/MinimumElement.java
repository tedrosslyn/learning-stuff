package uk.co.rosslyn.ted;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static int readInteger() {
        System.out.println("Enter the number of elements:");
        int numberOfElements = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Number of elements is " + numberOfElements);
        return numberOfElements;
    }

    public static int[] readElements(int numberOfElements) {

        int[] inputValues = new int[numberOfElements];
        for (int i = 0; i < inputValues.length; i++) {
            inputValues[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return inputValues;

    }

    public static int findMin(int[] myArray) {
        Arrays.sort(myArray);
        System.out.println("Minimum element is " + myArray[0]);
        return myArray[0];
    }

}//close class
