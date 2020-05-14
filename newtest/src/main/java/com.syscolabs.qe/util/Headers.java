package com.syscolabs.qe.util;

import org.apache.commons.codec.binary.Base64;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Headers {

    public Headers() {
    }

    public static HashMap<String, String> getHeader(String clientId, String clientSecret) {
        HashMap<String, String> headers = new HashMap();
        String base64 = getBase64(clientId + ":" + clientSecret);
        headers.put("Content-type", "application/x-www-form-urlencoded");
        headers.put("Authorization", "Basic " + base64);
        headers.put("Accept", "application/json");
        return headers;
    }
    public static HashMap<String, String> addToHeader(HashMap<String, String> headers, HashMap<String, String> newHeaderAttributes) {
        Iterator var2 = newHeaderAttributes.entrySet().iterator();

        while(var2.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry)var2.next();
            String key = (String)entry.getKey();
            String value = (String)entry.getValue();
            headers.put(key, value);
        }

        return headers;
    }
    public static HashMap<String, String> getBearerHeaders(String accessToken) {
        HashMap<String, String> headers = new HashMap();
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", "Bearer " + accessToken);
        return headers;
    }

    public static String getBase64(String originalString) {
        return Base64.encodeBase64String(originalString.getBytes());
    }
}
