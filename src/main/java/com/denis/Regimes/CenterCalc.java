package com.denis.Regimes;

import com.denis.Operations.Division.CenterDiv;
import com.denis.Operations.Division.Division;
import com.denis.Operations.Multiplication.CenterMult;
import com.denis.Operations.Multiplication.Multiplication;
import com.denis.Operations.Subtraction.CenterSub;
import com.denis.Operations.Subtraction.Subtraction;
import com.denis.Operations.Sum.CenterSum;
import com.denis.Operations.Sum.Sum;

/**
 *
 * Created by Denis on 02.10.2015.
 */
public class CenterCalc extends Calculator {

    Sum sum = new CenterSum(this);
    Subtraction subtraction = new CenterSub(this);
    Multiplication multiplication = new CenterMult();
    Division division = new CenterDiv();

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
