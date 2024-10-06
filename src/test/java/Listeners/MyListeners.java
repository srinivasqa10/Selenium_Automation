package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener
{
    public void onStart(ITestContext context) {
        System.out.println("Test Execution is started"); //This will only execute once before starting Test Case
    }
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started");  // This will print before every Test Method Executes
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Test Execution is completed");
    }
}
