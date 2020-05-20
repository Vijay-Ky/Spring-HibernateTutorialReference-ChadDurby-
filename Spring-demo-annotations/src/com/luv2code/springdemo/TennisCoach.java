package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	/*spring will resolve this as a dependency.
	 * even it is private spring will set the value behind the scenes.
	 * -first it will construct the class by calling default constructor.
	 * and then it will actually inject a fortuneService implementation
	 * directly into this class. by making use of Java Technology reflection.
	 * -no constructor, setter injection just by using a field we are injecting.
	 * */
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	

	/*-configure the dependency injection using Autowired
	 * annotation.
	 * -parameter being passes is FortuneService.
	 * we want spring to automatically wire-up this
	 * component.instead of long XML configs.
	 * -behind the scenes - 
	 * spring will find a bean that implements
	 * FotuneService, in our case i,e HappyFortuneService
	 * and it will take that bean and inject it.i,e 
	 * to TennisCoach i,e auto-wired.
	 *  
	 * */
	
	//define a default constructor
	public TennisCoach()
	{
		System.out.println("TennisCoach: inside default constructor\n");
	}
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	//define a setter method
	/*-configure the dependency injection with @Autowired
	 * -we are guiding the spring that spring should auto-wire this
	 * dependency.
	 * -and spring will look for any class that implements FortuneService */
	//inject dependencies by calling any method on your class by simply keeping @Autowired
	//any method name simply listed as @Autowired
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println("TennisCoach: inside setFortuneService() method");
		fortuneService = theFortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
