package spring.annotation.self;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoAutowiringConstructorApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CoachAutowiredConstructor theCoach = context.getBean("tennisCoachAutowiredConstructor",
				CoachAutowiredConstructor.class);

		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		context.close();

	}

}
