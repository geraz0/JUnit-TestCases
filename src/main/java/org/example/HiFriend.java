package org.example;

public class HiFriend {

    // Method to generate the greeting message
    public String greetFriend(String friendName) {
        return "Hi " + friendName + "!";
    }

    public static void main(String[] args) {
        String friendName = "Alex Canady";
        System.out.println(new HiFriend().greetFriend(friendName));
    }
}
