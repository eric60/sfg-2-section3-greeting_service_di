package guru.springframework.sfgdi.services.GreetingServices.I18nGreetingServices;

import guru.springframework.sfgdi.services.GreetingServices.GreetingService;
import guru.springframework.sfgdi.services.GreetingServices.repositories.GreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class I18nSpanishService implements GreetingService {
    private GreetingRepository greetingRepository;

    public I18nSpanishService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
