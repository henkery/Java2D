package java2d.lel;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class GeneralShape {
	
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


class GenPane extends JPanel {
	
	private GeneralPath myShape = new GeneralPath();
	
	public GenPane()
	{
		setPreferredSize( new Dimension(640,480));
		setBackground(Color.black);
		myShape.moveTo(100, 100);
		myShape.curveTo(100, 100, -40, 165, 100, 200);
		myShape.curveTo(100, 200, 40, 160, 100, 100);
		myShape.closePath();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		
		g2.fill(myShape);
		
	}
}

