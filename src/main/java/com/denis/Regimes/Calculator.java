package com.denis.Regimes;

/**
 *
 * Created by Denis on 02.10.2015.
 */
public abstract class Calculator {

    private double result[] = new double[2];
    private double data[][] = new double[2][2];

    public void sum(){}

    public void sub(){}

    public void mult(){}

    public void div(){}

    public void setData(double[][] data) {
        this.data = data;
    }

    public double[][] getData() {
        return data;
    }

    public double[] getResult() {
        return result;
    }

    public void setResult(double[] result) {
        this.result = result;
    }

    public void resetResult() {
        this.result = new double[] {0, 0};
    }
}
