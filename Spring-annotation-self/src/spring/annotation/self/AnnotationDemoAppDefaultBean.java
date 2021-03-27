package spring.annotation.self;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoAppDefaultBean {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("tennisCoachDefaultBean", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
