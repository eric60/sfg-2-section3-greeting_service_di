package guru.springframework.sfgdi.services.config;

import guru.springframework.sfgdi.exampleBeans.FakeDataSource;
import guru.springframework.sfgdi.exampleBeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
/*@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})*/
public class PropertyConfig {
    @Autowired
    Environment env;

    // Spring expression syntax to mark it as an expression
    @Value("${guru.username}")
    String username;

    @Value("${guru.password")
    String password;

    @Value("${guru.dburl")
    String dburl;

    @Value("${guru.jms.username}")
    String jmsUsername;

    @Value("${guru.jms.password")
    String jmsPassword;

    @Value("${guru.jms.dburl")
    String jmsDburl;



    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
//        fakeDataSource.setUsername(env.getProperty("USERNAME"));
        // vs GURU_USERNAME env variable override directly aka guru.username in datasource.properties file
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDburl(dburl);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setDburl(jmsDburl);
        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer(); // reading the file for us, scanning for the property files
        return propertySourcesPlaceholderConfigurer;
    }
}
