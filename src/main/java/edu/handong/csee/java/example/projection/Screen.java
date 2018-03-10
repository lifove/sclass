package edu.handong.csee.java.example.projection;

public class Screen {
	int mWidth = 2;
	int mMinHeight = 0;
	int mMaxHeight = 3;
	
	public String mDescription = "This is the Screen class.";
	
	public void rollUp() {
		
		System.out.println("My screen is rolloing up!");
		System.out.println("Its current height is " + mMinHeight + " meters");
		
		getWidth();
		
	}
	
	public void rollDown() {
		
		System.out.println("My screen is rolloing down!");
		System.out.println("Its current height is " + mMaxHeight + " meters");
		
		getWidth();
	}
	
	private void getWidth() {
		
		System.out.println("My screen's width is " + mWidth+ " meters");
		
	}
}
