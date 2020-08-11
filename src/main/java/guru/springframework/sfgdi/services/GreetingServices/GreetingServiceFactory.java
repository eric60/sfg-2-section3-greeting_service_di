package guru.springframework.sfgdi.services.GreetingServices;

import guru.springframework.sfgdi.services.GreetingServices.I18nGreetingServices.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.GreetingServices.I18nGreetingServices.I18nSpanishService;
import guru.springframework.sfgdi.services.GreetingServices.repositories.GreetingRepository;

public class GreetingServiceFactory {
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
