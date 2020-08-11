package guru.springframework.sfgdi.services.config;

import guru.springframework.sfgdi.services.GreetingServices.GreetingService;
import guru.springframework.sfgdi.services.GreetingServices.GreetingServiceFactory;
import guru.springframework.sfgdi.services.GreetingServices.I18nGreetingServices.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.GreetingServices.I18nGreetingServices.I18nSpanishService;
import guru.springframework.sfgdi.services.GreetingServices.repositories.GreetingRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class I18nGreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
        return new GreetingServiceFactory(repository);
    }

    @Bean("i18nService")
    @Profile({"default", "en"})
//    @Service("i18nService")
    GreetingService i18nEnglishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean("i18nService")
    @Profile("es")
    GreetingService i18nSpanishService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("es");
    }

}
