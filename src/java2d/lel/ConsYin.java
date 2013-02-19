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
		Shape s1 = new Ellipse2D.Double(50, 50, 200, 200);
		Shape s2 = new Ellipse2D.Double(100, 50, 100, 100);
		Shape s3 = new Ellipse2D.Double(100, 150, 100, 100);
		//Shape s2 = new CubicCurve2D.Double(150, 50, 150, 50, 150, 50, 150, 250);
		//Shape s2 = new Ellipse2D.Double(145, 120, 135, 105);
		Area shape = new Area(s1);
		shape.exclusiveOr(new Area(s2));
		shape.exclusiveOr(new Area(s3));
		g2.fill(shape);
		//g2.draw(shape);
		
	}
}

