package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(

		features="./src/test/resources/Feature/Ecomapp.feature",
		glue={"stepdef","hooks"},
		tags = "not @ignore"
		)
public class Testrunner {

}
