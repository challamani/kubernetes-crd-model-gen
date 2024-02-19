package com.github.jsonpatch;


public class Patch {

    private String op;
    private String path;
    private Object value;

    public Patch(String op, String path, Object value) {
        this.op = op;
        this.path = path;
        this.value = value;
    }

    public Patch() {
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
