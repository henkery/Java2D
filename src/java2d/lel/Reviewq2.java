package java2d.lel;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Reviewq2 {
	
	public static void main(String s[])
	{
		JFrame frame = new JFrame("Hoofdstuk 2.6 - Enkele Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new PlotPanel();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}


class PlotPanel extends JPanel {
	
	public PlotPanel()
	{
		setPreferredSize( new Dimension(640,480));
		setBackground(Color.black);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		Point2D p1 = new Point2D.Double(10, 30);
		Point2D p2 = new Point2D.Double(-20, 15);
		Point2D p3 = new Point2D.Double(0, -20);
		Point2D p4 = new Point2D.Double(0, 0);
		//vertienvoudigd, om zichtbaarheidsredenen
		g2.draw(new Line2D.Double(p1, p2));
		g2.draw(new Line2D.Double(p3, p2));
		g2.draw(new Line2D.Double(p1, p4));
		g2.draw(new Line2D.Double(p3, p4));
		
		
		
		
		
	}
}

