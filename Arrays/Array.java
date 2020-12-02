package Arrays;

import java.util.Scanner;

public class Array {

    public static void main(String[] args){
        // One way of initializing array
        int[] myIntArray = new int[10];
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        System.out.println(myIntArray[1]);

        // Second Way
        double[] myDoubleArray = {10.4, 10.55, 34.66,23.34, 65.12};
        System.out.println(myDoubleArray[4]);

        // Third way
        int[] intArray = new int[5];
        for(int i = 1; i < intArray.length; i++){
            intArray[i] = i * 5;
        }
        for(int j = 0; j < intArray.length; j++){
            System.out.println("Element " + (j+1) + " = " + intArray[j]);
        }
        int[] newIntArray = new int[5];
        average(newIntArray);


    }
    // Application Example
    public static void average(int[] array) {
        Scanner scanner = new Scanner(System.in);
        array = new int[5];
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value " + (i + 1) + " value = ");
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < array.length; j++){
              total += array[j];
        }
        int totalAve = total / array.length;
        System.out.println("Your average is: " + totalAve );


    }

}
