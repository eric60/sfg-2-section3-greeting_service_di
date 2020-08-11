package guru.springframework.sfgdi.services.GreetingServices;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - Setter!";
    }
}
