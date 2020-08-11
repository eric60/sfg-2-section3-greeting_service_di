package guru.springframework.sfgdi.services.GreetingServices;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - Property!";
    }
}
