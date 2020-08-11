package guru.springframework.sfgdi.services.GreetingServices.I18nGreetingServices;

import guru.springframework.sfgdi.services.GreetingServices.GreetingService;
import guru.springframework.sfgdi.services.GreetingServices.repositories.GreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class I18nEnglishGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;

    public I18nEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World- En!";
    }
}
