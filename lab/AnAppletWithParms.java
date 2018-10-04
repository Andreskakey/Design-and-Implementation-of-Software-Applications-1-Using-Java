package Applet;
import java.applet.*;
import java.awt.*;

public class AnAppletWithParms extends Applet {
	public void init() {
		/*
		 * are invoked as client-side applications running under a 
		 * user's local in the JVM. The classes themselves are reference from 
		 * the same server that the websitethat specified the applet
		 */
		String parmString =  getParameter("number"); // support to be in the HTML file, else this will null the code
		/*
		 * the applet parameters are sub-elements of the object tag on the website  that defined the applet. 
		 * The applet can then use the getParameter method to obtain their values which is the "number".  
		 * values is the applet's decision that make from the html. 
		 */
		System.err.println("The single parameter: " + parmString);
		n = Integer.parseInt(parmString);
		/*
		 * This it's one of the core Java classes that comes as part of the JVM.
		 */
		setBackground(Color.blue);
	}

	public void paint(Graphics g) {
		System.out.println("In paint: n = " + n);
		n++;
	}

	int n;
} 