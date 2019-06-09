//import java.util.Scanner
import java.awt.*;
import javax.swing.*;


public class DrawOval extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private int d = 10;
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.fillOval(10, 10, d, d);
		
	}
	
	public void setD (int newD) {
		d = (newD >= 0 ? newD : 10);
		repaint();
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(600, 600);
	}
	
	public Dimension getMinimumSize() {
		return getPreferredSize();
	}
	
	/*public void paint (Graphics g) {
		super.paint(g);
		g.drawString("The sum is " + sum, 25, 25);
	}*/
}