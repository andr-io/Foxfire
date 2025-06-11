package org.shadowcourt.exceptions;

public class EternalClause extends Exception {
    public EternalClause(String message) {
        super("📜 Eternal Clause Triggered: " + message);
    }
}
