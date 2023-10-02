package com.example.hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelloStepDefinitions {

    @Given("today is Sunday")
    public void today_is_sunday() {
        throw new io.cucumber.java.PendingException();
    }
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        throw new io.cucumber.java.PendingException();
    }
}