package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.controllers.DIControllers.SetterInjectedController;
import guru.springframework.sfgdi.services.GreetingServices.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void Test_getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
    }
}