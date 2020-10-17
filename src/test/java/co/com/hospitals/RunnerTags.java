package co.com.hospitals;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/hospital_administration.feature",
        tags = "@e2e",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
