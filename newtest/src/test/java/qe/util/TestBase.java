package qe.util;

import com.syscolab.qe.core.reporting.SyscoLabListener;
import com.syscolab.qe.core.reporting.SyscoLabQCenter;
import com.syscolab.qe.core.reporting.SyscoLabReporting;
import com.syscolabs.api.functions.QCenterData;
import com.syscolabs.qe.common.Constant;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners(SyscoLabListener.class)
public class TestBase {

    private SyscoLabListener testListeners;
    private SyscoLabQCenter syscoLabQCenter;

    @BeforeSuite
    public void createBuild(){
        Constant.TEST_RELEASE = "";
    }

    @BeforeMethod(alwaysRun = true)
    public void init() {
        testListeners = new SyscoLabListener();
        syscoLabQCenter = new SyscoLabQCenter();
        System.out.println("Running " + this.getClass().toString());
    }

  //  @AfterMethod(alwaysRun = true)
   /* public void updateQCenter(ITestContext iTestContext) {
        try {
            syscoLabQCenter.setProjectName(Constant.TEST_PROJECT);
            syscoLabQCenter.setEnvironment(Constant.TEST_ENV);
            syscoLabQCenter.setRelease(Constant.TEST_RELEASE);
            syscoLabQCenter.setModule(iTestContext.getAttribute("feature").toString());
            syscoLabQCenter.setFeature(iTestContext.getAttribute("feature").toString());
            syscoLabQCenter.setClassName(iTestContext.getClass().getName());
            if (Constant.UPDATE_DASHBOARD)
                SyscoLabReporting.generateJsonFile(testListeners.getResults(), syscoLabQCenter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
