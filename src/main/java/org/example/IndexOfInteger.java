package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOfInteger {

    // Method to find the index of a number in the list
    public String findIndexOfInteger(List<Integer> numbers, int searchNumber) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == searchNumber) {
                return searchNumber + " is at index " + i;
            }
        }
        return searchNumber + " is not in the list.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to finish):");

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("Done entering integers into the list.");

        System.out.print("What number are you looking for in the list? ");
        int searchNumber = scanner.nextInt();

        IndexOfInteger indexOfInteger = new IndexOfInteger();
        System.out.println(indexOfInteger.findIndexOfInteger(numbers, searchNumber));

        scanner.close();
    }
}
