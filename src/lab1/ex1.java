package lab1;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imag1 = scanner.nextDouble();


        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imag2 = scanner.nextDouble();


        System.out.println("\nMenu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");


        System.out.print("Select an option (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                //Addition
                double sumReal = real1 + real2;
                double sumImag = imag1 + imag2;
                System.out.println("Result: " + sumReal + " + " + sumImag + "i");
                break;

            case 2:
                //Subtraction
                double diffReal = real1 - real2;
                double diffImag = imag1 - imag2;
                System.out.println("Result: " + diffReal + " + " + diffImag + "i");
                break;

            case 3:
                //Multiplication
                double mulReal = (real1 * real2) - (imag1 * imag2);
                double mulImag = (real1 * imag2) + (imag1 * real2);
                System.out.println("Result: " + mulReal + " + " + mulImag + "i");
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option (1-3).");
        }
        scanner.close();
    }
}