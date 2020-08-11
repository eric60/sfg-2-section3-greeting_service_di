package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServices.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryBeanController {
    private final GreetingService greetingService;

    public PrimaryBeanController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
