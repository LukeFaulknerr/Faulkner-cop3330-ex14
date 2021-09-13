/*
    UCF COP3330 Fall 2021 Assignment 12 Solution
    Copyright 2021 Luke Faulkner
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex14 {

    static String wi = "WI";
    public static void main(String[] args) {

        // Variables
        Scanner taxMachine = new Scanner(System.in);
        String orderAmtStr, state;
        double tax = 0;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);

        // Prompt
        System.out.print("What is the order amount? ");
        orderAmtStr = taxMachine.nextLine();
        double orderAmt = Double.parseDouble(orderAmtStr);

        System.out.print("What is the state? ");
        state = taxMachine.nextLine();

        // Tax Inclusion
        if (state.equals(wi))
            tax = 0.55;

        // Calc
        double total = orderAmt + tax;

        // Result
        System.out.println("The subtotal is $" + df.format(orderAmt));
        System.out.println("The tax is $" + df.format(tax));
        System.out.print("The total is $" + df.format(total));

    }
}
