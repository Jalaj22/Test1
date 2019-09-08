package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\Selenium java program\\cucumber_Naveen\\src\\main\\java\\Features\\mainMenuTags.feature",
		glue={"stepDefinitions"},
		format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome=true,
		strict=true,
		tags={"@SanityTest"},
		dryRun=false
		)
public class TestRunner {

}
