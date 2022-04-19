package StepDefination;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
public class TestRunner {
	

	


	//for TestNG
	@CucumberOptions(features="src\\test\\resources\\eBay(help&contact)_Features",
	glue= {"org.eBay.com"},strict=true,monochrome=false,dryRun=true)
	//plugin= {"pretty","html:target/htmlreports","json:target/jsonreports/jsonreports.json"})
	public class TestRunner extends AbstractTestNGCucumberTests{

	}
	//for Junit
	//@RunWith(Cucumber.class)
	//@CucumberOptions(features="src\\test\\resources\\Features\\org.login.feature\\SignInModule.feature",
	//glue= {"StepDefinition"},strict=true,monochrome=false)
	////plugin= {"pretty","html:target/htmlreports","json:target/jsonreports/jsonreports.json",
	////"junit:target/junitreports/junitreports.xml"})
	//public class TestRunner {
	//
	//}
}
