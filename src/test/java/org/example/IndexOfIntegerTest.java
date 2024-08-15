package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexOfIntegerTest {

    private IndexOfInteger indexOfInteger;

    @BeforeEach
    void setUp() {
        indexOfInteger = new IndexOfInteger();
    }

    @Test
    void testFindIndex_ExistsInList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        String expected = "3 is at index 2";
        assertEquals(expected, indexOfInteger.findIndexOfInteger(numbers, 3));
    }

    @Test
    void testFindIndex_DoesNotExistInList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        String expected = "6 is not in the list.";
        assertEquals(expected, indexOfInteger.findIndexOfInteger(numbers, 6));
    }

    @Test
    void testFindIndex_EmptyList() {
        List<Integer> numbers = Arrays.asList();
        String expected = "1 is not in the list.";
        assertEquals(expected, indexOfInteger.findIndexOfInteger(numbers, 1));
    }

    @Test
    void testFindIndex_FirstElement() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        String expected = "10 is at index 0";
        assertEquals(expected, indexOfInteger.findIndexOfInteger(numbers, 10));
    }

    @Test
    void testFindIndex_LastElement() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        String expected = "50 is at index 4";
        assertEquals(expected, indexOfInteger.findIndexOfInteger(numbers, 50));
    }
}
