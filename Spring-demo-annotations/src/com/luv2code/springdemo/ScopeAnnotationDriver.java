package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAnnotationDriver {

	public static void main(String[] args) {
		
		//load bean configuration XML file
		ClassPathXmlApplicationContext cpxac = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach juniorCoach = cpxac.getBean("tennisCoach", Coach.class);
		Coach seniorCoach = cpxac.getBean("tennisCoach", Coach.class);
		
		//verify our results
		System.out.println("Whether juniorCoach and seniorCoach are pointing the same memory location?\n"
				+ "or They both share the same object reference? "
		+ (juniorCoach == seniorCoach) + " oh.. okay but,\n can you print the address of locations?\n");
		
		System.out.println("Okay! i'm juniorCoach and the memory location which i'm pointing to is: "
		+ juniorCoach + "\n");
		
		System.out.println("Fine! i'm seniorCoach and the memory location which i'm pointing to is: " 
		+ seniorCoach + "\n");
		
		System.out.println("Okay.. Another Test!"
				+ " Lets find out whether the TennisCoach is Annoted with singleton\n"
				+ "or prototype scope ? and the next print statement will determine that!\n");
		
		if(juniorCoach == seniorCoach)
		{
			System.out.println("Okay! we are(juniorCoach and seniorCoach) both are"
					+ " pointing to the same memory location that means"
					+ " TennisCoach has default or singleton scope declared on top of it\n");
		}
		else
		{
			System.out.println("Okay! we are(juniorCoach and seniorCoach) both are"
					+ " pointing to the different memory locations that means"
					+ " TennisCoach has prototype scope declared on top of it!");
		}	
	}
}
