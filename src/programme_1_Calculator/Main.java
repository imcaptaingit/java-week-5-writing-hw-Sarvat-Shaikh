package programme_1_Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaring the scanner object
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please Enter the First Number : "); // input wizard
            int a = scanner.nextInt();
            System.out.println("Please Enter the Second Number : "); // input wizard
            int b = scanner.nextInt();
            System.out.println("Please enter on of the symbol to calulate +, -, /, * ::"); //input wizard
            char symbol = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a,b,symbol);
            System.out.println("Would you like to continue with calculator Please enter 'Y' or 'N' : " ); // input wizard
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));
        //closing the scanner
        scanner.close();
    }
}
