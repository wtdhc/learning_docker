package com.github.two.model;

import java.util.HashMap;
import java.util.Map;
import lombok.Data;

@Data
public class AllNameValueTO {

    private String originalName;
    private String originalValue;
    private Map<String, String> remainingNameValuePair = new HashMap<>();

}
