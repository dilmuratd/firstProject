package day2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags= "Smoke",
		
		features="C:\\Users\\ASUS\\eclipse-workspace\\Cucumberday2\\src\\test\\resources\\FaceBook",
		glue="Definitions",
		dryRun=false
		
		
		
		)










public class CucumberRun {

}
