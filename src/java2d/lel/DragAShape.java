package java2d.lel;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class DragAShape {

	
	
	public static void main(String s[])
	{
		JFrame frame = new JFrame("Drag-A-Shape");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new DragAShapePanel();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}


class DragAShapePanel extends JPanel 
	implements MouseListener, MouseMotionListener 
{

	private int teller = 0;
	
	private int x = 100;
	private int y = 100;
	private Shape rect;
	
	boolean isSelected = false;
	
	/* Constructor */
	public DragAShapePanel()
	{
		setPreferredSize( new Dimension(640,480));
		
		rect = new Rectangle2D.Double();
		
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	// Repaint
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		((Rectangle2D)rect).setFrame(x,y,100,50);
		
		g2.draw(rect);
		
		// Debug info
		System.out.println( "Aantal updates : " + teller );
		teller++;

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println( "mouseDragged " + arg0.getX() + " " + arg0.getY() );
		
		if(isSelected == true)
		{
			int xoff = arg0.getX() - x;
			int yoff = arg0.getY() - y;
			x = arg0.getX() + xoff;
			y = arg0.getY() + yoff;
			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if( rect.contains( arg0.getPoint()) )
		{
			isSelected = true;
		}
		else
		{
			isSelected = false;
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
