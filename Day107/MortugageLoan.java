import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

class MortgageLoan {
    public static void main(String[] args) {
        int principal = getPrincipal();
        int years = getYears();
        double annualInterestRate = getAnnualInterestRate();

        double emi = calculateEMI(principal, years, annualInterestRate);

        displayEMI(emi);
    }

    private static int getPrincipal() {
        Scanner sc = new Scanner(System.in);
        int principal = 0;
        try {
            System.out.println("Enter principal:");
            principal = sc.nextInt();
            if (principal <= 1000) {
                throw new IllegalArgumentException("Enter principal amount greater than 1000");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return principal;
    }

    private static int getYears() {
        Scanner sc = new Scanner(System.in);
        int years = 0;
        try {
            System.out.println("Enter number of years:");
            years = sc.nextInt();
            if (years < 1 || years > 30) {
                throw new IllegalArgumentException("Enter valid years (between 1 and 30)");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return years;
    }

    private static double getAnnualInterestRate() {
        Scanner sc = new Scanner(System.in);
        double annualInterestRate = 0;
        try {
            System.out.println("Enter annual interest rate:");
            annualInterestRate = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        }
        return annualInterestRate;
    }

    private static double calculateEMI(int principal, int years, double annualInterestRate) {
        final byte noOfMonths = 12;
        final byte percent = 100;

        double monthlyInterestRate = annualInterestRate / noOfMonths / percent;
        int totalNumOfMonths = years * noOfMonths;

        return principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalNumOfMonths)
                / (Math.pow(1 + monthlyInterestRate, totalNumOfMonths) - 1);
    }

    private static void displayEMI(double emi) {
        Locale locale = new Locale("en", "IN");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        String formattedEmi = currencyFormat.format(emi);
        System.out.println("EMI of given principal is: " + formattedEmi);
    }
}
