package com.company;

import java.util.Map;

public interface Mapper {
    static String mapper(String value, Map<String, String> map) throws Exception {
        if(map.containsKey(value)) {
            return map.get(value);
        } else {
            throw new Exception(value + " nie istnieje");
        }
    }
}
