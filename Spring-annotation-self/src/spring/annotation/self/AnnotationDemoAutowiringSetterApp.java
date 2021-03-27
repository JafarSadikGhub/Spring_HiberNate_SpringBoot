package spring.annotation.self;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoAutowiringSetterApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CoachAutowiredConstructor theCoach = context.getBean("tennisCoachAutowiredSetter",
				CoachAutowiredConstructor.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();

	}

}
