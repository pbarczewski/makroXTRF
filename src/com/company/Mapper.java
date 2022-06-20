package com.company;

import java.util.HashMap;
import java.util.Map;

public class Mapper {
    private final Map<String, String> map;

    public Mapper() {
        this.map = new HashMap<>();
        map.put("Tilde GE", "Tilde+technology");
        map.put("Tilde Prawo", "Tilde+legal");
        map.put("Globalese Medycyna", "Globalese+medicine");
        map.put("Globalese Finanse", "Globalese+finance");
        map.put("Globalese COVID", "Globalese+COVID");
        map.put("DeepL", "DeepL");
    }

    public Map<String, String> getMap() {
        return map;
    }
}
