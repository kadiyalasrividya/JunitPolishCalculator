package com.yash.tdd.calculator;

import java.math.BigDecimal;

public class SubtractOperation extends BinaryOperation {
    protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value2.subtract(value1);
    }
}
