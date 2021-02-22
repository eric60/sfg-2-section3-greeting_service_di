package guru.springframework.sfgdi.services.GreetingServices.DIGrettingServices;

import guru.springframework.sfgdi.services.GreetingServices.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - Constructor!";
    }
}
