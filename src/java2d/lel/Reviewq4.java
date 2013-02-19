package java2d.lel;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Reviewq4 {
	
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


class ElPanel extends JPanel {
	
	public ElPanel()
	{
		setPreferredSize( new Dimension(640,480));
		setBackground(Color.black);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D el = new Ellipse2D.Double(100, 300, 80, 100);
		g2.draw(el);
	}
}

