package assignments.ex1;
import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2="", quit = "quit";
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            if (!num1.equals("quit")) break;
            // Validate num2
            boolean isNum2Valid = Ex1.isNumber(num2);
            int value2 = Ex1.number2Int(num2);
            if (!isNum2Valid || value2 == -1) {
                System.out.println("num2= " + num2 + " is number: false , value: -1");
                System.out.println("ERR: num2 is in the wrong format! (" + num2 + ")");
                continue;
            }
            System.out.println("num2= " + num2 + " is number: true , value: " + value2);

            // Input for the output base
            System.out.println("Enter a base for output: (a number [2,16]): ");
            int base = sc.nextInt();
            if (base < 2 || base > 16) {
                System.out.println("ERR: Base " + base + " is not in the range [2,16]");
                continue;
            }

            // Perform addition and multiplication
            int sum = value1 + value2;
            int product = value1 * value2;

            // Convert results to the specified base
            String sumStr = Ex1.int2Number(sum, base);
            String productStr = Ex1.int2Number(product, base);

            // Display results
            System.out.println(num1 + " + " + num2 + " = " + sumStr);
            System.out.println(num1 + " * " + num2 + " = " + productStr);

            // Find the maximum number
            String[] numbers = {num1, num2, sumStr, productStr};
            int maxIndex = Ex1.maxIndex(numbers);
            System.out.println("Max number over [" + String.join(",", numbers) + "] is: " + numbers[maxIndex]);
        }
        System.out.println("quiting now...");
        sc.close();
    }
}
