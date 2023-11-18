import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static final int MONTHS_IN_A_YEAR = 12;
    public static void main(String[] args) {

        // monthly payment = Principle * ( i ( 1 + i)^term ) / (( 1 + i )^term - 1 )
        //create scanner
        Scanner scanner = new Scanner(System.in);
        //collect principal balance
        System.out.println("Enter principal:");
        double principal = scanner.nextDouble();

        //collect annual interest rate
        System.out.println("Enter annual interest rate:");
        float annualInterestRate = scanner.nextFloat();
        //collect years of loan term
        System.out.println("Enter term for loan in years:");
        int termInYears = scanner.nextInt();
        //calculate monthly interest rate
        float monthlyInterestRate = annualInterestRate / MONTHS_IN_A_YEAR;
        //calculate number of monthly payments
        int numberOfPayments = termInYears * MONTHS_IN_A_YEAR;
        //calculate monthly payment
        double monthlyPayment = principal * ((monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments)))
         / ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1 ));

        scanner.close();

        System.out.println("Monthly payment: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));
        System.out.println("Total payback amount: " + NumberFormat.getCurrencyInstance().format(monthlyPayment * numberOfPayments));
    }
}