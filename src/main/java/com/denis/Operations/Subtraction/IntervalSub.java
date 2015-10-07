package com.denis.Operations.Subtraction;

import com.denis.Regimes.Calculator;

/**
 *
 * Created by Denis on 02.10.2015.
 */
public class IntervalSub implements Subtraction {

    Calculator calculator;
    private double[] subResult = new double[2];

    public IntervalSub(Calculator calculator) {
        this.calculator = calculator;
    }

    public void sub (){
        this.subResult[0] = calculator.getData()[0][0] - calculator.getData()[1][1];
        this.subResult[1] = calculator.getData()[0][1] - calculator.getData()[1][0];
    }

    @Override
    public double[] getSubResult() {
        sub();
        return this.subResult;
    }

}
