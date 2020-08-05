package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.services.PetService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("---------- Primary Bean");
		MyController myController = (MyController) context.getBean("myController");
		System.out.println(myController.getGreeting());

		System.out.println("---------- Best Pet");
		PetController petController = (PetController) context.getBean("petController");
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("---------- Profile Beans");
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.getGreeting());

		System.out.println("---------- Property Injected Controller");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------- Setter Injected Controller");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------- Controller Injected Controller");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
