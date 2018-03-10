package edu.handong.csee.java.example.projection;

public class Projector {
	
	int mLampTemparature = 20;
	public String mDescription = "This is a projector class";
	
	public void turnOn() {
		System.out.println("My project is turing on!");
		getLampTemparature();
	}
	
	public void turnOff() {
		System.out.println("My project is turing off!");
	}
	
	private void getLampTemparature() {
		System.out.println("My projector temparature is :" + mLampTemparature);
	}

}
