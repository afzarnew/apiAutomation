package com.syscolabs.qe.tests;

import com.jayway.restassured.response.Response;
import com.syscolabs.qe.common.Constant;
import com.syscolabs.qe.common.StatusCodes;
import com.syscolabs.qe.response.modal.ProjectModel;
import com.syscolabs.qe.util.ApiGWResponseUtil;
import com.syscolabs.qe.util.OauthApiRequestUtil;
import com.syscolabs.qe.utils.OauthApiResponseUtil;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import qe.util.TestBase;

import java.util.HashMap;

import static com.syscolabs.qe.util.ApiGWRequestUtil.setExecutionEnvironment;

public class EmployeeTest  extends TestBase{

    public static String getData;
    @BeforeClass
    public static void initiate(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "");
        setExecutionEnvironment();
    }

    @Test(description = "EmployeeTest", alwaysRun = true)
    public void testEmployees() throws JSONException {
        SoftAssert softAssert = new SoftAssert();
        HashMap<String, String> headers = new HashMap();

        Response response = ApiGWResponseUtil.getEmployees(headers);
        getData = OauthApiResponseUtil.getValueFromResponse(response, "data");
        System.out.print(getData);
        ProjectModel projectModel = (ProjectModel) ApiGWResponseUtil.getDataObjectValueInDataArray(getData, 0, ProjectModel.class);


        softAssert.assertEquals(ApiGWResponseUtil.getResponseCode(response), StatusCodes.SUCCESS_200_CODE, "Status code should be 200");
        softAssert.assertEquals(projectModel.id, 1, "Should be equal");
        softAssert.assertEquals(projectModel.profile_image, "", "Should be equal");
        softAssert.assertEquals(projectModel.employee_name, "Tiger Nixon", "Should be equal");
        softAssert.assertEquals(projectModel.employee_salary, "320800", "Should be equal");
        softAssert.assertEquals(projectModel.employee_age, 61, "Should be equal");
        softAssert.assertAll();
    }
}
