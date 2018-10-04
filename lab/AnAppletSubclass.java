package lab3;

/**
 * the java.awt contain the entire library include the color
 * as well as the apple.
 */
import java.applet.*;
import java.awt.*;

/**
 * This have the apple package
 *
 */
public class AnAppletSubclass extends Applet {
	/**
	 * The apple that output the graph in a line arguments 
	 * apple library
	 * 
	 */
	public void init() {
		System.err.println("Hello from AnAppletSubClass.init - the current value of n is " + n);
	/**
	 * color = Color.green; is one the basic way to input the color
	 *  another way is using new object that have (r,g,b) to adjust the color.
	 * 	
	 */
		color = new Color (120,150,0);
		
	}
	/**
	 * the part were initialize the graphic inside the computer before output the apple 
	 * the awt library.
	 * also n++ is counting the value of n
	 * 
	 */
	public void paint(Graphics g) {
		setBackground(color);
		System.err.println("Hello from AnAppletSubClass.paint-- the current value of n is " + n);
		n++;
	}
/**
 * the color package  and the int of n for the starting point.
 */
	Color color;
	int n = 0;
}
