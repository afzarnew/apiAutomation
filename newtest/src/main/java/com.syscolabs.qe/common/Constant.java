
package com.syscolabs.qe.common;

public class Constant {

    public static final String BASE_DOMAIN = "";
    public static final String BASE_URL = "http://dummy.restapiexample.com/api/v1";

    public static final String PORT = System.getProperty("base.port", "");

    public static final String REQ_METHOD_GET = "GET";
    public static final String REQ_METHOD_POST = "POST";
    public static final String REQ_METHOD_PATCH = "PATCH";
    public static final String REQ_METHOD_PUT = "PUT";
    public static final String REQ_METHOD_DELETE = "DELETE";

    public static final String OAUTH_BASE_PATH = System.getProperty("oauth.base.path","");
    public static String TEST_RELEASE = "";

    Constant() {
    }
}

