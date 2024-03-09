package io.cucumber.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.login.actions.LoginAction;
import io.cucumber.login.users.User;

public class StepDefinitions {

    private User user;
    private LoginAction loginAction;

    @Given("I am a registered user with username {string} and password {string}")
    public void i_am_a_registered_user_with_username_and_password(String username, String password) {
        user = new User(username, password);
    }

    @When("I log in with username {string} and password {string}")
    public void i_log_in_with_username_and_password(String username, String password) {
        loginAction = new LoginAction(user);
        loginAction.login(username, password);
    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        assert loginAction.isLoggedIn();
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        assert !loginAction.isLoggedIn();
    }
}
