package org.example;

public class FrontAgainChecker {

    public boolean frontAgain(String str) {
        // First, check if the string length is less than 2; if so, it can't have repeated characters
        if (str.length() < 2) {
            return false;
        }

        // Extract the first two characters of the string
        String firstTwo = str.substring(0, 2);
        // Extract the last two characters of the string
        String lastTwo = str.substring(str.length() - 2);

        // Check if the first two characters match the last two characters
        return firstTwo.equals(lastTwo);
    }

    public static void main(String[] args) {
        FrontAgainChecker checker = new FrontAgainChecker();
        System.out.println(checker.frontAgain("edited")); // Output: true
    }
}
