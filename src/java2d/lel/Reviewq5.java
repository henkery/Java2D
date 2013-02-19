package java2d.lel;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Reviewq5 {
	
	public static void main(String s[])
	{
		JFrame frame = new JFrame("Hoofdstuk 2.6 - Enkele Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new ArcPanel();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}


class ArcPanel extends JPanel {
	
	public ArcPanel()
	{
		setPreferredSize( new Dimension(640,480));
		setBackground(Color.black);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		Arc2D el = new Arc2D.Float(0, 0, 100, 200, 0, 45, 1);
		g2.draw(el);
	}
}

