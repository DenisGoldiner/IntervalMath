package com.denis.Regimes;

import com.denis.Operations.Division.Division;
import com.denis.Operations.Division.SimpleDiv;
import com.denis.Operations.Multiplication.Multiplication;
import com.denis.Operations.Multiplication.SimpleMult;
import com.denis.Operations.Subtraction.SimpleSub;
import com.denis.Operations.Subtraction.Subtraction;
import com.denis.Operations.Sum.SimpleSum;
import com.denis.Operations.Sum.Sum;

/**
 *
 * Created by Denis on 02.10.2015.
 */
public class SimpleCalc extends Calculator {

    Sum sum = new SimpleSum(this);
    Subtraction subtraction = new SimpleSub();
    Multiplication multiplication = new SimpleMult();
    Division division = new SimpleDiv();

    @Override
    public void sum() {
        this.setResult(sum.getSumResult());
    }

    @Override
    public void sub() {
        super.sub();
    }

    @Override
    public void mult() {
        super.mult();
    }

    @Override
    public void div() {
        super.div();
    }
}
