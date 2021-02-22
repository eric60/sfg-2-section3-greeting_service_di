package guru.springframework.sfgdi.services.GreetingServices.I18nGreetingServices;

import guru.springframework.sfgdi.services.GreetingServices.GreetingService;
import guru.springframework.sfgdi.services.GreetingServices.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Value;

public class GreetingServiceFactory {

    @Value("{spring.profiles}")
    private String lang;

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new I18nEnglishGreetingService(greetingRepository);
            case "es":
                return new I18nSpanishService(greetingRepository);
            default :
                return new I18nEnglishGreetingService(greetingRepository);
        }
    }
}
