package vkapitest;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.Map;

public class Entity {
    private Map<String,String> fields;

    @JsonAnyGetter
    public Map<String,String> getFields(){
        return fields;
    }
}
