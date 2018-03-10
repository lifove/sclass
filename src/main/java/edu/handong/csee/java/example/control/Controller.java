package edu.handong.csee.java.example.control;

import edu.handong.csee.java.example.projection.Projector;
import edu.handong.csee.java.example.projection.Screen;

public class Controller {

	public static void main(String[] args) {
		
		System.out.println("This is a main method in the Controller class");
		
		Controller nth413Controller = new Controller();
		
		nth413Controller.turnOnProjector();
		nth413Controller.rollUpAndDownScreen();
		
	}

	public void turnOnProjector() {
		
		Projector nth413Projector = new Projector();
		
		System.out.println("My project's description:" + nth413Projector.mDescription);
		
		nth413Projector.turnOn();
	}
	
	public void rollUpAndDownScreen() {
		
		Screen nth413Screen = new Screen();
		
		System.out.println("My screen's description:" + nth413Screen.mDescription);
		
		nth413Screen.rollUp();
		
		nth413Screen.rollDown();
		
	}
}
