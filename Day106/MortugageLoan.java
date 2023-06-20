/*
Formula for EMI Calculation is -

P x R x (1+R)^N / [(1+R)^N-1] where-

P = Principal loan amount

N = Loan tenure in months

R = Monthly interest rate

The rate of interest (R) on your loan is calculated per month.

R = Annual Rate of interest/12/100
*/

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

class MortugageLoan{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        final byte noOfMonths=12;
        final byte percent=100;
        int principal=0;
        int years=0;
        int totalNumOfMonths=0;
        double emi=0;
        try{
            System.out.println("Enter principal:");
            principal=sc.nextInt();
            if(principal<=1000){
                throw new IllegalArgumentException("Enter principal amount greater than 1000");
            }
            System.out.println("Enter number of years:");
            years=sc.nextInt();
            if (years < 1 || years > 30) {
                throw new IllegalArgumentException("Enter valid years (between 1 and 30)");
            }
            System.out.println("Enter annual interest rate:");
            double annualInterestRate = sc.nextDouble();
            double monthlyInterestRate = annualInterestRate / noOfMonths / percent;

            totalNumOfMonths = years * noOfMonths;

            emi = principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalNumOfMonths)
                    / (Math.pow(1 + monthlyInterestRate, totalNumOfMonths) - 1);

        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        Locale l=new Locale("En", "In");
        NumberFormat nf=NumberFormat.getCurrencyInstance(l);
        String formattedEmi = nf.format(emi);
        System.out.println("EMI of given principal is:"+formattedEmi);

    }
}