package com.company;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.SplittableRandom;

public class Service {
    private final Job job;

    public Service(Job job) throws Exception {
        if(job == null ) {
            throw new Exception("Job nie istnieje");
        }
        this.job = job;
    }

    public String getDescription() {
        return job.getDescription();
    }

    public String getName() throws Exception {
       String name = Split.divideName(job.getName());
       return name + Delimeters.SLASH.getDelimeter() + job.getId();
    }

    public String mapName(String old, Map<String, String> map) throws Exception {
        return Mapper.mapper(old, map);
    }

    private URL createUrl(String url) throws MalformedURLException {
        return new URL(url);
    }
}
