package runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features/Login.feature",

		glue="stepsdef" ,
		monochrome=true,
		publish=true
		
		)


public class Login extends AbstractTestNGCucumberTests {

}
