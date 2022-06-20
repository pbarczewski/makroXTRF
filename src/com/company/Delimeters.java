package com.company;

public enum Delimeters {
    EQ("="),
    AMP("&"),
    SLASH("/");

    private String delimeter;

    Delimeters(String delimeter) {
        this.delimeter = delimeter;
    }

    public String getDelimeter() {
        return delimeter;
    }
}
