package com.robquatela.calcengine;

/**
 * Created by rquatela on 11/22/16.
 */
public abstract class CalculateBase {

    private double leftVal;
    private double rightVal;
    private double result;

    //get methods
    public double getLeftVal() {
        return leftVal;
    }
    public double getRightVal() {
        return rightVal;
    }
    public double getResult() {
        return result;
    }

    //set methods
    public void setLeftVal(double lv) {
        leftVal = lv;
    }
    public void setRightVal(double rv) {
        rightVal = rv;
    }
    public void setResult(double result) { this.result = result; }

    public CalculateBase() {}
    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public abstract void calculate();

}
