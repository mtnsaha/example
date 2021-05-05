package test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("simple multiplication should work")
    public void testMultiply() {
assertEquals(30,calculator.multiply(5,6),"regular multiplication should work" );
    }

    @RepeatedTest(7)
    @DisplayName("Ensure correct handling with zero")
    public void testMultiplicationWithZero(){
        assertEquals(0,calculator.multiply(0,7),"multiply with zero should be zero");
        assertEquals(0,calculator.multiply(7,0),"multiply with zero should be zero");


    }

    @AfterEach
    void tearDown() {
    }
}