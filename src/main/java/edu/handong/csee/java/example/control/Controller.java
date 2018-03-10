package edu.handong.csee.java.example.control;

import edu.handong.csee.java.example.projection.Projector;
import edu.handong.csee.java.example.projection.Screen;

public class Controller {
	
	Projector nth413Projector;
	Screen nth413Screen;

	public static void main(String[] args) {
		
		System.out.println("This is a main method in the Controller class");
		
		Controller nth413Controller = new Controller();
		
		nth413Controller.runEveryActions();
	}
	
	void runEveryActions(){
		
		createProjectorAndScreen();
		turnOnProjector();
		rollUpAndDownScreen();
		turnOffProjector();
		
	}

	void createProjectorAndScreen() {
		nth413Projector = new Projector();
		nth413Screen = new Screen();
	}

	void turnOnProjector() {

		System.out.println("My project's description:" + nth413Projector.mDescription);
		
		nth413Projector.turnOn();
	}
	
	void turnOffProjector() {
		
		nth413Projector.turnOff();
	}
	
	void rollUpAndDownScreen() {
		
		System.out.println("My screen's description:" + nth413Screen.mDescription);
		
		nth413Screen.rollUp();
		
		nth413Screen.rollDown();
		
	}
}
