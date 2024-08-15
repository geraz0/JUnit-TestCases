package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HiFriendTest {

    private HiFriend hiFriend;

    @BeforeEach
    void setUp() {
        hiFriend = new HiFriend();
    }

    @Test
    void testGreetFriend() {
        String friendName = "Alex Canady";
        String expected = "Hi Alex Canady!";
        assertEquals(expected, hiFriend.greetFriend(friendName));
    }

    @Test
    void testGreetAnotherFriend() {
        String friendName = "John Doe";
        String expected = "Hi John Doe!";
        assertEquals(expected, hiFriend.greetFriend(friendName));
    }
}
