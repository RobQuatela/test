package com.robquatela.calcengine;

/**
 * Created by rquatela on 11/15/16.
 */
public class Main {

    public static void main(String[] args) {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for(MathEquation equation : equations) {
            equation.execute();
            System.out.printf("result = %.1f", equation.getResult());
            System.out.println();
        }

        System.out.printf("Using Overloads\n");

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightDouble);
        System.out.printf("Result = %.1f\n", equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);
        System.out.printf("Result = %.1f\n", equationOverload.getResult());

        equationOverload.execute((double)leftInt, rightInt);
        System.out.printf("Result = %.1f\n", equationOverload.getResult());
    }


}