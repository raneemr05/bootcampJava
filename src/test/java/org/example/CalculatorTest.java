package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @BeforeAll
    static void display(){
        System.out.println("Welcome to testing calculator");
    }

    // Test Annotation
    @Test
    void add_TwoPositiveInt() {
            assertEquals(8,calculator.add(4,4));
    }

    @Test
    @DisplayName("Add two Negative Numbers")
    void add_TwoNegativeInt(){
        assertEquals(-5, calculator.add(-4,-1));
    }


}