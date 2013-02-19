package java2d.lel;

import java.awt.*;
import javax.swing.*;

import java.awt.geom.*;

public class Chessboard {
	
	public static void main(String s[])
	{
		JFrame frame = new JFrame("Hoofdstuk 2.6 - Enkele Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new Field1();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}


class Field1 extends JPanel {
	
	private GeneralPath myShape = new GeneralPath();
	
	public Field1()
	{
		setPreferredSize( new Dimension(400,400));
		setBackground(Color.white);
		
		
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		
		int la = 0;
		boolean colour = false;
		g2.setPaintMode();
		for (int i=0; i<8; i++)
		{
			la += 50;
			int lo = 0;
			for (int p=0; p<4; p++)
			{
				lo += 50;
				g2.setPaint(Color.BLACK);
				g2.fill(new Rectangle2D.Double(lo-50, la-50, lo, la));
				g2.setPaint(Color.WHITE);
				lo += 50;
				g2.fill	(new Rectangle2D.Double(lo-50, la-50, lo, la));
				colour = false;
			}
			
		}
	}
}

