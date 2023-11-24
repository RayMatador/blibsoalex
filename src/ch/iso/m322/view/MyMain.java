package ch.iso.m322.view;


public class MyMain {

	public static void main(String[] args) {
	final MyFrame myFrame = new MyFrame();

	myFrame.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
	
	// size, location and show
	myFrame.setSize(300, 400);
	myFrame.setLocation(10, 10);
	myFrame.setVisible(true);
	
	myFrame.getFocusElement().requestFocus();

	}
}
