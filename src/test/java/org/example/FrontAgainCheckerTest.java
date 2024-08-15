package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FrontAgainCheckerTest {

    private FrontAgainChecker checker;

    @BeforeEach
    void setUp() {
        checker = new FrontAgainChecker();
    }

    @Test
    void testFrontAgain_MatchingFrontAndBack() {
        assertTrue(checker.frontAgain("edited"));
        assertTrue(checker.frontAgain("abab"));
        assertTrue(checker.frontAgain("xyxy"));
    }

    @Test
    void testFrontAgain_NotMatchingFrontAndBack() {
        assertFalse(checker.frontAgain("front"));
        assertFalse(checker.frontAgain("abcdef"));
        assertFalse(checker.frontAgain("xyab"));
    }

    @Test
    void testFrontAgain_ShortStrings() {
        assertFalse(checker.frontAgain("a"));
        assertFalse(checker.frontAgain(""));
        assertTrue(checker.frontAgain("aa"));
    }
}
