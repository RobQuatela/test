package com.robquatela.calcengine;

/**
 * Created by rquatela on 11/28/16.
 */
public class InvalidStatementException extends Exception {

    public InvalidStatementException(String reason, String statement) {
        super(reason + ": " + statement);
    }

    public InvalidStatementException(String reason, String statement, Throwable cause) {
        super(reason + ": " + statement, cause);
    }
}
