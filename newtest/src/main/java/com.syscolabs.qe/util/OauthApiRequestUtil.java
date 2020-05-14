package com.syscolabs.qe.util;

import com.jayway.restassured.response.Response;
import com.syscolab.qe.core.api.restassured.RestUtil;
import com.syscolabs.qe.common.Constant;

import java.util.HashMap;

public class OauthApiRequestUtil {

    public OauthApiRequestUtil() {
    }

    private static void setEnvironmentVariables() {
        RestUtil.API_HOST = Constant.BASE_URL;
        RestUtil.PORT = Integer.parseInt(Constant.PORT);
        RestUtil.BASE_PATH = Constant.OAUTH_BASE_PATH;
    }

}
