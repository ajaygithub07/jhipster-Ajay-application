package io.github.jhipster.ajay.cucumber.stepdefs;

import io.github.jhipster.ajay.JhipsterAjayApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterAjayApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
