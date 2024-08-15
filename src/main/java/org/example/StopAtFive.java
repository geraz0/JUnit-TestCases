package org.example;

import java.util.Scanner;

public class StopAtFive {

    // Method that continues to request numbers until 5 is received
    public String checkNumber(int num) {
        if (num == 5) {
            return "Stop";
        } else {
            return "Continue";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.println("Give a number:");
            num = input.nextInt();
        } while (!"Stop".equals(new StopAtFive().checkNumber(num)));
    }
}
