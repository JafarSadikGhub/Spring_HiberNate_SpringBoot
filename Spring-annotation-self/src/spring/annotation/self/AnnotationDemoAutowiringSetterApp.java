package spring.annotation.self;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoAutowiringSetterApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// For setter method.......
		/*
		 * CoachAutowiredConstructor theCoach =
		 * context.getBean("tennisCoachAutowiredSetter",
		 * CoachAutowiredConstructor.class);
		 */
		/*
		 * CoachAutowiredConstructor theCoach =
		 * context.getBean("tennisCoachAutowiredFieldInjection",
		 * CoachAutowiredConstructor.class);
		 */
		CoachAutowiredConstructor theCoach = context.getBean("tennisCoachAutowiredWQualifier",
				CoachAutowiredConstructor.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();

	}

}
