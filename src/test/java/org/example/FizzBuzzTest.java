package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.fizzString("foobarb"));
        assertEquals("FizzBuzz", fizzBuzz.fizzString("faceb"));
    }

    @Test
    void testFizz() {
        assertEquals("Fizz", fizzBuzz.fizzString("fizz"));
        assertEquals("Fizz", fizzBuzz.fizzString("fun"));
    }

    @Test
    void testBuzz() {
        assertEquals("Buzz", fizzBuzz.fizzString("blob"));
        assertEquals("Buzz", fizzBuzz.fizzString("ab"));
    }

    @Test
    void testNoFizzNoBuzz() {
        assertEquals("hello", fizzBuzz.fizzString("hello"));
        assertEquals("world", fizzBuzz.fizzString("world"));
    }
}
