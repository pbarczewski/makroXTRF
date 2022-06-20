package com.company;

public interface Split {
    static String divideName(String name) throws Exception {
        Validator.validate(name);
        return name.split("-")[0];
    }
}
