package run;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/feature",
		glue="stepdef")
		
public class testrunner extends AbstractTestNGCucumberTests {

}
