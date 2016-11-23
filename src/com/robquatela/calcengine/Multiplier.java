package com.robquatela.calcengine;

/**
 * Created by rquatela on 11/22/16.
 */
public class Multiplier extends CalculateBase {

    public Multiplier() {}
    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
}
