package com.yash.tdd.calculator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class OperationsTest {

    private Calculator calculator;

    @Before
    public void createCalculatorWithTwoValues(){
        calculator = new Calculator();
        calculator.setAccumulator(new BigDecimal(20));
        calculator.enter();
        calculator.setAccumulator(new BigDecimal(6));
    }

    /*@Test
    public void testAdd(){
        calculator.add();
        assertEquals(new BigDecimal(26),calculator.getAccumulator());
    }*/

    @Test
    public void testAddExecute(){
        calculator.execute("+");
        assertEquals(new BigDecimal(26),calculator.getAccumulator());
    }

    /*@Test
    public void testSubtract(){
        calculator.subtract();
        assertEquals(new BigDecimal(14),calculator.getAccumulator());
    }
*/
    @Test
    public void testSubtractExecute(){
        calculator.execute("-");
        assertEquals(new BigDecimal(14),calculator.getAccumulator());
    }

}
