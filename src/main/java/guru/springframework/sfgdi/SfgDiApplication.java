package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.controllers.DIControllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.DIControllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.DIControllers.SetterInjectedController;
import guru.springframework.sfgdi.exampleBeans.FakeDataSource;
import guru.springframework.sfgdi.exampleBeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework"})
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("\n---------- Primary Bean");
		PrimaryBeanController primaryBeanController = (PrimaryBeanController) context.getBean("primaryBeanController");
		System.out.println(primaryBeanController.getGreeting());

		System.out.println("\n---------- Best Pet");
		PetController petController = (PetController) context.getBean("petController");
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("\n---------- Profile I18nService Beans");
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.getGreeting());

		System.out.println("\n---------- Property Injected Controller");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("\n---------- Setter Injected Controller");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("\n---------- Controller Injected Controller");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("\n---------- External properties file properties");
		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());

		FakeJmsBroker fakeJmsBroker = context.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());

	}

}
