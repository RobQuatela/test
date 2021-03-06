package com.robquatela.calcengine;

/**
 * Created by rquatela on 11/22/16.
 */
public class Divider extends CalculateBase {

    public Divider() {}
    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
