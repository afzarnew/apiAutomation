package com.syscolabs.qe.util;

import com.syscolab.qe.core.api.restassured.RestUtil;
import com.syscolabs.qe.common.Constant;

public class ApiGWRequestUtil {

    public ApiGWRequestUtil() {
    }

    public static void setExecutionEnvironment() {
        RestUtil.BASE_PATH = Constant.BASE_DOMAIN;
        RestUtil.API_HOST = Constant.BASE_URL;
    }

}
