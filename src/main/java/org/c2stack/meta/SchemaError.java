package org.c2stack.meta;

/**
 *
 */
public class SchemaError extends RuntimeException {
    public SchemaError(String msg) {
        super(msg);
    }
    public SchemaError(String msg, Throwable suberr) {
        super(msg, suberr);
    }
}
