package com.robquatela.calcengine;

/**
 * Created by rquatela on 11/28/16.
 */
public class PowerOf implements MathProcessing {

    @Override
    public String getKeyword() {

        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return Math.pow(leftVal, rightVal);
    }

}


