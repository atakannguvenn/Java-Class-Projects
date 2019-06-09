package assignment5_1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class apples extends Applet {
	private static final long serialVersionUID = 1L;

	
	public void paint(Graphics g) {
	int j = 0,k = 430;
	int x[]= {440,450,460,470,480,490};
	int y[]= {300,350,460,250,600,150};
	int a[]= {600,650,700,750,800};
	int b[]= {300,400,200,300,200};
	Font font = new Font("Arial",Font.BOLD,30);
	g.setFont(font);
	g.drawString("Beautiful Pic",10,50);
	g.setColor(Color.BLUE);
	while(j < 430) {
		g.drawLine(j, k, j + 30, k + 30);
		j += 10;
		k -= 10;
	}
	g.drawLine(100, 100, 200, 200);
	setBackground(Color.PINK);
	setSize(1024,768);
	g.drawRect(250, 250, 50, 50);
	g.setColor(Color.RED);
	g.fillRect(320, 320, 50, 50);
	//g.drawOval(600, 500, 100, 100);
	g.setColor(Color.GREEN);
	g. fillOval(600, 500, 100, 100);
	g.drawArc(750, 300, 50, 100, 0, 360);
	g.setColor(Color.MAGENTA);
	g. fillArc(500, 600, 50, 100, 0, 360);
	g.drawPolygon(x, y, 6);
	g.setColor(Color.ORANGE);
	g. fillPolygon(a,b,5);
	g.setColor(Color.BLACK);
	drawTree(g, 400, 500, -90, 9);
	}
	

	
    private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
        if (depth == 0) return;
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
        g.drawLine(x1, y1, x2, y2);
        drawTree(g, x2, y2, angle - 20, depth - 1);
        drawTree(g, x2, y2, angle + 20, depth - 1);
    }
}
