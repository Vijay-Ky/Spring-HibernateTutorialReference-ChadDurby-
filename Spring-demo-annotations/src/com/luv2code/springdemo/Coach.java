package com.luv2code.springdemo;

/*1.Our Coach already provides getDailyWorkout() method.
now it will also provides daily fortunes. we will make use of 
FortuneService and this is the Dependency. we have seen this in the
previous tutorial but now we are going to inject this dependency using annotations
and autowiring.
2.What exactly is Spring Auto-wiring?
for dependency injection spring can automatically wire up our objects together.
basically Spring will look for a class that matches a given property.
and it'll actually match by type. the type could be either the class or the interface.
once spring finds a match it'll automatically inject it. thats why its called auto-wired.*/
public interface Coach {

	public String getDailyWorkout();

	public String getDailyFortune();
	
}
