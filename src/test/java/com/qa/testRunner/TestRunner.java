package com.qa.testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(dryRun = false,
			features= {"src/test/resources/features/"},
			glue= {"com.tnf.stepDefinitions"},
			monochrome=true)
	public class TestRunner {
		
				
							
							@AfterClass
							public void after() {
//								timetaken = (System.currentTimeMillis()-duration);
//								System.out.println("\n Time taken for the JournalContent Execution - "+ TimeUnit.MILLISECONDS.toHours(timetaken) + " hours");
							}

	}

