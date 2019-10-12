package com.vytrack.step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.security.PublicKey;

public class Hook {


    @Before
    public void setup(Scenario scenario){

        System.out.println(scenario.getName()+" "+scenario.getSourceTagNames());
        System.out.println("Before");

    }

    @After
    public void teardown() {
        System.out.println("After");


    }
}
