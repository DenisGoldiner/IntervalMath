package com.denis.Operations.Sum;

import com.denis.Regimes.Calculator;

/**
 *
 * Created by Denis on 02.10.2015.
 */
public class CenterSum implements Sum {

    Calculator calculator;
    private double[] sumResult = new double[2];

    public CenterSum(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double[] getSumResult() {
        convertToInterval();
        return this.sumResult;
    }

    public double[][] convertToCenter(double[][] data) {
        double[][] result = new double[2][2];
        result[0][0] = (data[0][0] + ((data[0][1] - data[0][0]) / 2));
        result[1][0] = (data[1][0] + ((data[1][1] - data[1][0]) / 2));
        result[0][1] = (data[0][1] - data[0][0]) / 2;
        result[1][1] = (data[1][1] - data[1][0]) / 2;
        return result;
    }

    public double[] sum(){
        double[] result = new double[2];
        double[][] time = convertToCenter(calculator.getData());
        result[0] = time[0][0] + time[1][0];
        result[1] = time[0][1] + time[1][1];
        return result;
    }

    public void convertToInterval(){
        this.sumResult[0] = sum()[0] - sum()[1];
        this.sumResult[1] = sum()[0] + sum()[1];
    }
}
