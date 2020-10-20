package stepdefinitions;

import io.cucumber.java.en.When;

import java.util.List;

public class Abc {
    @When("the gets list")
    public void theGetsList(List<String> dataTable) {

        for (String city :
                dataTable) {
            System.out.println(city);
        }



    }
}
