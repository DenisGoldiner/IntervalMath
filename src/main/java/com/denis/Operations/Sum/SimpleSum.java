package com.denis.Operations.Sum;

import com.denis.Regimes.Calculator;

/**
 *
 * Created by Denis on 02.10.2015.
 */
public class SimpleSum implements Sum {

    Calculator calculator;
    private double[] sumResult = new double[2];

    public SimpleSum(Calculator calculator) {
        this.calculator = calculator;
    }

    private void sum (){
        this.sumResult[0] = calculator.getData()[0][0] + calculator.getData()[1][0];
        this.sumResult[1] = calculator.getData()[0][1] + calculator.getData()[1][1];
    }

    @Override
    public double[] getSumResult() {
        sum();
        return this.sumResult;
    }
}
