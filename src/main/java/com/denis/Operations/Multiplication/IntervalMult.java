package com.denis.Operations.Multiplication;

import com.denis.Regimes.Calculator;

/**
 *
 * Created by Denis on 02.10.2015.
 */
public class IntervalMult implements Multiplication {

    Calculator calculator;
    private double[] multResult = new double[2];

    public IntervalMult(Calculator calculator) {
        this.calculator = calculator;
    }

    public void mult (){
        this.multResult[0] = sort(calculator.getData())[0];
        this.multResult[1] = sort(calculator.getData())[1];
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

    @Override
    public double[] getMultResult() {
        mult();
        return this.multResult;
    }
}
