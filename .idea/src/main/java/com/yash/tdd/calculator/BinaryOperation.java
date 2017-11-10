package com.yash.tdd.calculator;

import java.math.BigDecimal;

public abstract class BinaryOperation implements Operation{

    public void apply(OperandStack values){
        BigDecimal value1 = values.peek();
        values.pop();
        BigDecimal value2 = values.peek();
        values.replaceTop(calculate(value1,value2));
    }

    protected abstract BigDecimal calculate(BigDecimal value1, BigDecimal value2);
}
