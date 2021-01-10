package uk.co.rosslyn.ted;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

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
        System.out.println("Input values : " + Arrays.toString(inputValues));
        return inputValues;
    }

    public static void reverse(int[] revArray) {
        int temp;
        int aL = revArray.length - 1;
        //System.out.println("Reversed array is " + myArray[0]);
        for (int i = 0; i <= (aL / 2); i++) { //check half the elements - leave middle where it is , if odd number
            temp = revArray[i]; //store first value in temp
            revArray[i] = revArray[aL - i]; //store last value in first element
            revArray[aL - i] = temp; //store orig first value in last slot
        }
        System.out.println("Output values " + Arrays.toString(revArray));
    }
}//class
