package com.company;

import java.util.Map;

public class Service {
    private final Job job;

    public Service(Job job) throws Exception {
        if(job == null ) {
            throw new Exception("Null");
        }
        this.job = job;
    }

    public String getName() throws Exception {
       String name = Split.divideName(job.getName());
       return name + Delimeters.SLASH.getDelimeter() + job.getId();
    }

    public String getId() {
        return job.getId();
    }

    public String mapName(String old, Map<String, String> map) throws Exception {
        return Mapper.mapper(old, map);
    }


}
