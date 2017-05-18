package oop;


public class DecrementableCounter extends Counter {

	protected int myCount = 0;
	
	public void increment ( ) {
		myCount++;
	}
	
	public int value ( ) {
		if (myCount < 0){
			myCount = 0;
		}
		return myCount;
	}
	
	public void reset ( ) {
		myCount = 0;
	}
	
	public void decrement ( ) {
		myCount--;
	}
}
