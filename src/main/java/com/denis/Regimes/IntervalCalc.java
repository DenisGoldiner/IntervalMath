package com.denis.Regimes;

import com.denis.Operations.Division.Division;
import com.denis.Operations.Division.IntervalDiv;
import com.denis.Operations.Multiplication.IntervalMult;
import com.denis.Operations.Multiplication.Multiplication;
import com.denis.Operations.Subtraction.IntervalSub;
import com.denis.Operations.Subtraction.Subtraction;
import com.denis.Operations.Sum.IntervalSum;
import com.denis.Operations.Sum.Sum;

/**
 *
 * Created by Denis on 02.10.2015.
 */
public class IntervalCalc extends Calculator {

    Sum sum = new IntervalSum(this);
    Subtraction subtraction = new IntervalSub(this);
    Multiplication multiplication = new IntervalMult(this);
    Division division = new IntervalDiv(this);

    @Override
    public void sum() {
        this.setResult(sum.getSumResult());
    }

    @Override
    public void sub() {
        this.setResult(subtraction.getSubResult());
    }

    @Override
    public void mult() {
        this.setResult(multiplication.getMultResult());
    }

    @Override
    public void div() {
        this.setResult(division.getDivResult());
    }
}
