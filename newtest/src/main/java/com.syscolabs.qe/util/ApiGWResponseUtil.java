package com.syscolabs.qe.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.syscolab.qe.core.api.restassured.RestUtil;
import com.syscolab.qe.core.common.LoggerUtil;
import com.syscolabs.qe.common.Constant;
import com.syscolabs.qe.common.URIs;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class ApiGWResponseUtil {
    public ApiGWResponseUtil(){
    }

    public static void setExecutionEnvironment() {

    }

    public static int getResponseCode(Response response){
        return RestUtil.getResponseCode(response);
    }

    public static String getValueFromResponse(Response response,String key){
        return RestUtil.getValue(response,key);
    }

    public static Response getEmployees(HashMap<String, String> headers){
        Response response=RestUtil.send(headers,null, URIs.EMPLOYEES, Constant.REQ_METHOD_GET,null);
        return response;
    }

    public static Object getDataObjectValueInDataArray(String response, int dataArrayIndex, Class c) throws JSONException {
        JSONArray jArray = new JSONArray(response);

        String toReturn ="";
        try {
            JSONObject responseBody = jArray.getJSONObject(dataArrayIndex);;
            return new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).readValue(responseBody.toString(), c);

        }catch (Exception e){
            e.getMessage();
        }
        return null;
    }

}
