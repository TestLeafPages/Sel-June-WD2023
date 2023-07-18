package runnerclass;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepsdef.BaseClass;
import stepsdef.Hooks;


@CucumberOptions(features="src/test/java/features/Login.feature",

		glue="stepsdef" ,
		monochrome=true,
		publish=true,
		tags="@regression"
		//@dilip,not @dilip,@dilip and @smoke
		//@dilip or @smoke
		)

//public class Login extends Hooks{
//InvalidMethodException

//null pointer exp
public class Login extends BaseClass {
	
	
	

}
