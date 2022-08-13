package com.exalt.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StringCalculatorKataTest {

    StringCalculatorKata stringCalculatorKata;

    @BeforeEach
    void setUp() {
        stringCalculatorKata = new StringCalculatorKata();
    }

    @Test
    void add() {

        assertEquals(stringCalculatorKata.add(""), 0);
        assertEquals(stringCalculatorKata.add("1"), 1);
        assertEquals(stringCalculatorKata.add("1,2"), 3);
        assertEquals(stringCalculatorKata.add("1,2,3"), 6);



    }
}