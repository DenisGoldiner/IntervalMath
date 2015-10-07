package com.denis.Operations.Subtraction;

import com.denis.Regimes.Calculator;

/**
 *
 * Created by Denis on 02.10.2015.
 */
public class CenterSub implements Subtraction {
    Calculator calculator;
    private double[] subResult = new double[2];

    public CenterSub(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double[] getSubResult() {
        convertToInterval();
        return this.subResult;
    }

    public double[][] convertToCenter(double[][] data) {
        double[][] result = new double[2][2];
        result[0][0] = (data[0][0] + ((data[0][1] - data[0][0]) / 2));
        result[1][0] = (data[1][0] + ((data[1][1] - data[1][0]) / 2));
        result[0][1] = (data[0][1] - data[0][0]) / 2;
        result[1][1] = (data[1][1] - data[1][0]) / 2;
        return result;
    }

    public double[] sub(){
        double[] result = new double[2];
        double[][] time = convertToCenter(calculator.getData());
        result[0] = time[0][0] - time[1][0];
        result[1] = time[0][1] + time[1][1];
        return result;
    }

    public void convertToInterval(){
        this.subResult[0] = sub()[0] - sub()[1];
        this.subResult[1] = sub()[0] + sub()[1];
    }
}
