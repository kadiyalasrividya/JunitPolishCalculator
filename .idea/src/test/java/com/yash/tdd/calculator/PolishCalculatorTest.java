package com.yash.tdd.calculator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PolishCalculatorTest {

    private Calculator calculator;

    @Before
    public void createCalculator(){
        calculator = new Calculator();
    }

    @Test
    public void testNewCalculatorHasAnAccumulatorOfZero(){
        calculator = new Calculator();
        assertEquals(BigDecimal.ZERO,calculator.getAccumulator());
    }

    @Test
    public void testAccumulatorValue(){
        calculator = new Calculator();
        BigDecimal value = new BigDecimal(33);
        calculator.setAccumulator(value);
        assertEquals(value,calculator.getAccumulator());
    }


}
