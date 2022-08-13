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

        // step 1, 2
        assertEquals(stringCalculatorKata.add(""), 0);
        assertEquals(stringCalculatorKata.add("1"), 1);
        assertEquals(stringCalculatorKata.add("1,2"), 3);
        assertEquals(stringCalculatorKata.add("1,2,3"), 6);

        // step 3
        assertEquals(stringCalculatorKata.add("1\n2,3"), 6);
        assertEquals(stringCalculatorKata.add("1,\n"), 1);

        // step 4
        assertEquals(stringCalculatorKata.add("//;\n1;2"), 3);
        assertEquals(stringCalculatorKata.add("//;\n1;2;3"), 6);
        assertEquals(stringCalculatorKata.add("//;\n1\n;2;\n4"), 7);
        assertEquals(stringCalculatorKata.add("//!\n1\n!2!\n4"), 7);
        assertEquals(stringCalculatorKata.add("//!\n1"), 1);
        assertEquals(stringCalculatorKata.add("//!\n"), 0);







    }
}