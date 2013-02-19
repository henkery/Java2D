package java2d.lel;

import java.awt.*;

import javax.swing.*;
import java.awt.geom.*;

public class ConsYin {
	
	public static void main(String s[])
	{
		JFrame frame = new JFrame("Hoofdstuk 2.6 - Enkele Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new ConsPanel2();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}


class ConsPanel2 extends JPanel {
	
	public ConsPanel2()
	{
		setPreferredSize( new Dimension(300,300));
		setBackground(Color.black);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		Shape s1 = new Arc2D.Double(50, 50, 200, 200, 90, 180, Arc2D.CHORD);
		Shape s2 = new Ellipse2D.Double(100, 50, 100, 100);
		Shape s3 = new Ellipse2D.Double(100, 150, 100, 100);
		Shape s4 = new Arc2D.Double(50, 50, 200, 200, 270, 180, Arc2D.CHORD);
		Shape s5 = new Ellipse2D.Double(145, 95, 10, 10);
		Shape s6 = new Ellipse2D.Double(145, 195, 10, 10);
		Area shape = new Area(s1);
		shape.add(new Area(s2));
		shape.subtract(new Area(s3));
		shape.subtract(new Area(s5));
		Area shape2 = new Area(s4);
		shape2.subtract(new Area(s2));
		shape2.add(new Area(s3));
		shape2.subtract(new Area(s6));
		g2.setPaint(Color.white);
		g2.fill(shape);
		g2.fill(s6);
		g2.setPaint(Color.black);
		g2.fill(shape2);
		g2.fill(s5);
		
	}
}

