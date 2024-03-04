package lab1;

import java.util.Arrays;
import java.util.Random;
public class ex3 {
    public static void main(String[] args) {

        int[] randomNumbers = new int[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = random.nextInt(333); // numbers from 0 to 332
        }

        System.out.println("Original array:");
        displayArray(randomNumbers);

        Arrays.sort(randomNumbers);

        System.out.println("\nSorted array:");
        displayArray(randomNumbers);
    }

    private static void displayArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}