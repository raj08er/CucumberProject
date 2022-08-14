package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {
		"com.StepDefination" }, monochrome = false, plugin = { "html:\\CucumberProject\\Reports\\HTMLReports" }
// dryRun = false
//strict=true
)
public class Runner {

}

// If the ???? not removed after monochrome as true than user lower dependency versions