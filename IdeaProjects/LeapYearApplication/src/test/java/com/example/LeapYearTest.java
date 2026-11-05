package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    @Test
    void testLeapYear() {
        assertTrue(LeapYear.isLeapYear(2024));
        assertTrue(LeapYear.isLeapYear(2028));
    }

    @Test
    void testNonLeapYear() {
        assertFalse(LeapYear.isLeapYear(2023));
        assertFalse(LeapYear.isLeapYear(2025));
    }

    @Test
    void testCenturyLeapYear() {
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2400));
    }

    @Test
    void testCenturyNonLeapYear() {
        assertFalse(LeapYear.isLeapYear(1900));
        assertFalse(LeapYear.isLeapYear(2100));
    }
}
