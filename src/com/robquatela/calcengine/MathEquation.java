package com.robquatela.calcengine;

/**
 * Created by rquatela on 11/15/16.
 */
public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    //get methods
    public double getLeftVal() {
        return leftVal;
    }
    public double getRightVal() {
        return rightVal;
    }
    public char getOpCode() {
        return opCode;
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
    public void setOpCode(char oc) {
        opCode = oc;
    }

    //constructors
    public MathEquation() {}

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
    }

    public void execute(int leftVal, int rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();

        result = (int)result;
    }

    public void execute() {
        switch(opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }

}
