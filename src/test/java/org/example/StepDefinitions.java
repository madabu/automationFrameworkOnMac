package org.example;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();

    public StepDefinitions () {
        driver.manage().window().maximize();
    }

    @Given("I am on the homepage")
    public void iAmOnTheHomePage() {
        driver.get("file:///Users/mac/Desktop/Testing-Env-master/index.html");
    }


}
