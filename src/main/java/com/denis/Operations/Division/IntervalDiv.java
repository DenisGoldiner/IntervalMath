package com.denis.Operations.Division;

import com.denis.Regimes.Calculator;

/**
 * Created by Denis on 02.10.2015.
 */
public class IntervalDiv implements Division {

    Calculator calculator;
    private double[] divResult = new double[2];

    public IntervalDiv(Calculator calculator) {
        this.calculator = calculator;
    }

    public double[] sort (double[][] val) {
        double[] result = new double[2];
        double time;
        double[] mass = new double[4];
        mass[0] = val[0][0] * val[1][0];
        mass[1] = val[0][1] * val[1][0];
        mass[2] = val[0][0] * val[1][1];
        mass[3] = val[0][1] * val[1][1];

        for(int i = 0; i < mass.length; ++i){
            for(int j = 0; j < mass.length; ++j){
                if (mass[i] < mass[j]){
                    time = mass[j];
                    mass[j] = mass[i];
                    mass[i] = time;
                }
            }
        }
        result[0] = mass[0];
        result[1] = mass[3];
        return  result;
    }

    public void div (){
        double[][] ned = new double[2][2];
        ned[0] = calculator.getData()[0];
        ned[1][0] = 1 / calculator.getData()[1][1];
        ned[1][1] = 1 / calculator.getData()[1][0];
        this.divResult[0] = Math.rint(100.0 * sort(ned)[0]) / 100.0;
        this.divResult[1] = Math.rint(100.0 * sort(ned)[1]) / 100.0;
    }

    @Override
    public double[] getDivResult() {
        div();
        return this.divResult;
    }
}
