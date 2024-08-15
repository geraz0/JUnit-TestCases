package org.example;

public class FizzBuzz {

    public String fizzString(String str) {
        // Check if the string starts with "f" and ends with "b"
        if (str.startsWith("f") && str.endsWith("b")) {
            // If both conditions are true, return "FizzBuzz"
            return "FizzBuzz";
        }
        // Check if the string starts with "f"
        if (str.startsWith("f")) {
            // If it starts with "f", return "Fizz"
            return "Fizz";
        }
        // Check if the string ends with "b"
        if (str.endsWith("b")) {
            // If it ends with "b", return "Buzz"
            return "Buzz";
        }
        // If none of the conditions are met, return the string unchanged
        return str;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        System.out.println(fb.fizzString("foobar")); // Output: FizzBuzz
    }
}
