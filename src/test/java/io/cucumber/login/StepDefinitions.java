package io.cucumber.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("Pati está ubicado/localizado {int} metro(s) de Javi")
    public void pati_está_ubicado_metros_de_javi(Integer meters) {
        // Write code here that turns the phrase above into concrete actions
        assert true;
    }

    @When("Javi canta {string}")
    public void javi_canta(String message) {
        // Write code here that turns the phrase above into concrete actions
        assert true;
    }

    @Then("Pati escucha el mensaje de Javi")
    public void pati_escucha_el_mensaje_de_javi() {
        // Write code here that turns the phrase above into concrete actions
        assert true;
    }
}
