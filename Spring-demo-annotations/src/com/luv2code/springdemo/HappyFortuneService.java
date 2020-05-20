package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/*-Then we have the implementation class 
called HappyFortuneService will return simple message.
-new thing here it is that @Component, spring will auto-scan and find this
implementation for the spring container.
-Spring will actually scan all of the components,
if any class that implements the FortuneService, Spring will grab that component
or bean and inject it.
in our example we have HappyFortuneService which implements FotuneService interface,
Spring will find this implementation and automatically inject it to our class. and
thats called Auto-wiring.
-Auto-wiring Example: We will make use of Coach and FotuneService.
we need to inject a FortuneService into a Coach implementation.
-What if there are multiple FortuneService implementations?
When using autowiring, what if there are multiple FortuneService implementations?
ANSWER
Spring has special support to handle this case. Use the @Qualifier annotation.
We'll cover this later in the course with slides and code examples.
-*/
/*Spring can auto-scan and find this implementation for the spring container*/
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
