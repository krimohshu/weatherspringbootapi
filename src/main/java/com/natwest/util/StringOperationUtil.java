package com.natwest.util;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringOperationUtil {

    public static Map<String, String> convertStringToMap(String data , String delimiter) {
        Map<String, String> mapToBeConvertedFromString = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(data, delimiter);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            String[] keyValue = token.split(":");
            mapToBeConvertedFromString.put(keyValue[0], keyValue[1]);
        }

        return mapToBeConvertedFromString;
    }
}
