package com.robquatela.calcengine;

/**
 * Created by rquatela on 11/15/16.
 */
public class Main {

    public static void main(String[] args) {

        String[] statements = {
                "Add 1.0",              //Error: incorrect number of values
                "Add xx 25.0",          //Error: non-numeric data
                "AddX 0.0 0.0",         //Error: invalid command
                "Divide 100.0 50.0",
                "Add 25.0 92.0",
                "Subtract 225.0 17.0",
                "Multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();
        for(String statement: statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch(InvalidStatementException e) {
                System.out.println(e.getMessage());
                if(e.getCause() != null)
                    System.out.println("  Original Exception: " + e.getCause().getMessage());
            }
        }

    }


}
