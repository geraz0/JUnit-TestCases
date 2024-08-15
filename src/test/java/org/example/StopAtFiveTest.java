package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StopAtFiveTest {

    private StopAtFive stopAtFive;

    @BeforeEach
    void setUp() {
        stopAtFive = new StopAtFive();
    }

    @Test
    void testStopAtFive() {
        assertEquals("Stop", stopAtFive.checkNumber(5));
    }

    @Test
    void testContinueIfNotFive() {
        assertEquals("Continue", stopAtFive.checkNumber(3));
        assertEquals("Continue", stopAtFive.checkNumber(10));
        assertEquals("Continue", stopAtFive.checkNumber(0));
    }
}
