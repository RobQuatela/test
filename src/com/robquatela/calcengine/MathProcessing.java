package com.robquatela.calcengine;

/**
 * Created by rquatela on 11/28/16.
 */
public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyword(); //add
    char getSymbol(); //+
    double doCalculation(double leftVal, double rightVal);
}
