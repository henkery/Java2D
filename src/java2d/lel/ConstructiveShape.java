package java2d.lel;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class ConstructiveShape {
	
	public static void main(String s[])
	{
		JFrame frame = new JFrame("Hoofdstuk 2.6 - Enkele Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new GenPane();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}


class ConsPane extends JPanel {
	
	public ConsPane()
	{
		setPreferredSize( new Dimension(640,480));
		setBackground(Color.black);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		Shape s1 = new Ellipse2D.Double(120, 120, 140, 100);
		Shape s2 = new Ellipse2D.Double(145, 120, 135, 105);
		Area shape = new Area(s1);
		shape.subtract(new Area(s2));
		g2.fill(shape);
		
	}
}

