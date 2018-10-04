import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithButtons extends Applet implements ActionListener {
	public void init() {
		button1 = new Button("Button 1");
		add(button1);
		button1.addActionListener(this);

		button2 = new Button("Button 2");
		add(button2);
		button2.addActionListener(this);
           pressed1 = false;
           pressed2 = false;
           which = 0;
	}
   

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1){
              System.out.println("Button 1 was pressed");
              if (pressed1)
                 button1.setBackground(Color.yellow);
              else
                 button1.setBackground(Color.green);
             
              pressed1 = !pressed1; 
              which = 1;
           }
		if (e.getSource() == button2) {
			System.out.println("Button 2 was pressed");
              if (pressed2)
                 button2.setBackground(Color.orange);
              else
                 button2.setBackground(Color.pink);
              
              pressed2 = !pressed2; 
              which = 2;
     
           }
           repaint();
	}
      public void paint(Graphics g) {
		if (which==1)
             g.drawLine(100,100,140,140);
          if (which==2) 
             g.drawOval(120,120,110,110);
	}


	Button button1, button2;
     boolean pressed1, pressed2;
     int which;
}