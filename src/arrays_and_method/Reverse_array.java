package src.arrays_and_method;

import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        int[] array;
        do {
            System.out.println("Enter a size:");
            size = input.nextInt();
            if (size > 20){
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i+1) + " : ");
            array[i] = input.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }

        for (int j = 0; j < array.length / 2; j++){
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j =0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
    }
}

