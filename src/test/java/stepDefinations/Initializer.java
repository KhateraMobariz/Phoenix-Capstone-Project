package stepDefinations;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base{
	
	//in this class we will write or define our beforeHooks and afterHooks methods and they are
	//coming from Cucumber
	//Before hooks will run before each scenario
	//After hooks will run after each scenario
	
	@Before
	public void beforeHooks(Scenario scenario)	{
		logger.info("Scenario " + scenario.getName()+ " Started");
		browserType(); // comes from base class and will launch browser
		openBrowswer(); // comes from base class and will launch url 
	}
	
	@After
	public void afterHooks(Scenario scenario) {
		tearDown(); 
		logger.info("Scenario " + scenario.getName()+" "+scenario.getStatus());

		
	}

}
