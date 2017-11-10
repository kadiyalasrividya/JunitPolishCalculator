package com.yash.tdd.calculator;

import java.math.BigDecimal;

public class AddOperation extends BinaryOperation {
    protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value1.add(value2);
    }
}
