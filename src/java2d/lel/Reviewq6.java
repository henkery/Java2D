package java2d.lel;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Reviewq6 {
	
	public static void main(String s[])
	{
		JFrame frame = new JFrame("Hoofdstuk 2.6 - Enkele Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new CusPatPanel1();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}


class CusPatPanel1 extends JPanel {
	
	private GeneralPath myShape = new GeneralPath();
	
	public CusPatPanel1()
	{
		setPreferredSize( new Dimension(640,480));
		setBackground(Color.black);
		
		myShape.moveTo(-1.5f, 0f);
		myShape.lineTo(0f, 0f);
		myShape.lineTo(1f, 1f);
		myShape.lineTo(1f, 2.5f);
		myShape.lineTo(0f, 3.5f);
		myShape.lineTo(-1.5f, 3.5f);
		myShape.lineTo(-2.5f, 2.5f);
		myShape.lineTo(-2.5f, 1f);
		myShape.lineTo(-1.5f, 0f);
		myShape.closePath();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		AffineTransform tr = new AffineTransform();
		tr.setToScale(50, 50);
		Shape sh = tr.createTransformedShape(myShape);
		g2.translate(640/2, 320/2);
		g2.draw(sh);
	}
}

