package java2d.lel;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Plot2 {
	
	public static void main(String s[])
	{
		JFrame frame = new JFrame("Hoofdstuk 2.6 - Enkele Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new EquationPanel1();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}


class EquationPanel1 extends JPanel {
	
	int nPoints= 1000; // number of points to be graphed.
	double t=1; //intialize parameter
	
	public EquationPanel1()
	{
		setPreferredSize( new Dimension(640,480));
		setBackground(Color.black);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.translate(100,100);
		int x1 = 0;//initial x1
		int x2;
		int y1 =0; //initial y1
		int y2;
		for (int i=0; i double t=i*Math.PI/90)
		{
			x2 = (int)(11*Math.cos(t) - 4*Math.cos(11*t/2)); //change this to your new equation
			y2 = (int)(11*Math.sin(t) - 4*Math.cos(11*t/2));//change this to your new equation
			g2.drawLine(x1,y1,x2,y2);
			x1=x2;
			y1=y2;
		}
	}
}

