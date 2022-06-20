package com.company;

public interface Validator {
    static void validate(Object parameter) throws Exception {
        try {
            if(parameter != null || !parameter.equals(""));
         } catch (Exception e) {
            throw new Exception("Exception " + e);
        }
    }
}
