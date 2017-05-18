package oop;

import tests.ModNCounterTest; 
import tests.ModNCounter2Test;
import tests.DecrementableCounterTest;
import tests.SeasonCounterTest;

public class Runner {

	public static void main(String[] args) {
		testCounter();

		testCounter7Statements();

		testModNCounter();
		
		testModNCounter2();
	}

	
	public static void testCounter() {
		System.out.println("-- testing Counter");

		Counter c = new Counter();
		for(int i = 0; i < 3; i++)
			c.increment();
		System.out.println(c.value());

	}

	
	// Use this method to completestatic  exercise 1c
	public static void testCounter7Statements() {
		Counter c = new Counter();
		System.out.println("-- testing 7 statements");
		// include exactly 7 increment() and reset() statements below
		
		c.reset();
		c.reset();
		c.increment();
		c.increment();
		c.reset();
		c.reset();
		c.reset();
		c.increment();
		c.reset();
		c.increment();
		c.reset();
		c.increment();
		c.increment();
		c.increment();
		

		System.out.println("current value: " + c.value());
	}
	
	public static void testModNCounter(){
		ModNCounterTest.testInitialValues();
		ModNCounterTest.testIncrementing();
		ModNCounterTest.testResetting();
		
	}
	
	public static void testModNCounter2(){
		
		ModNCounter2Test.testInitialValues();
		ModNCounter2Test.testIncrementing();
		ModNCounter2Test.testResetting();
		
	}
	
	public static void testDecrementableCounter(){
		DecrementableCounterTest.testInitialValues();
		DecrementableCounterTest.testIncrement();
		DecrementableCounterTest.testDecrement();
		DecrementableCounterTest.testResetting();
	}
	
	public static void testSeasonCounter() {
		SeasonCounterTest.testInitialValues();
		SeasonCounterTest.testIncrementing();
		SeasonCounterTest.testResetting();
	}
}
