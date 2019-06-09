package assignment6;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class apples extends Applet {
	Random rand = new Random();
	int  x = rand.nextInt(400) + 250;
	int y = x;
	Color randomColor = new Color(rand.nextInt(255) + 1, rand.nextInt(255) + 1, rand.nextInt(255) + 1);
	Color randomColor2 = new Color(rand.nextInt(255) + 1, rand.nextInt(255) + 1, rand.nextInt(255) + 1);
	
	public void init() {
		setBackground(new Color(rand.nextInt(255) + 1));
		setSize(x,y + 150);
	}
		public void paint(Graphics g){
			Random rand = new Random();
			int x_temp = 0, y_temp = 0;
			int height = x, counter = 0;
			int temp_inc = rand.nextInt(50) + 1;
			while (height >= 0) {
				if (counter % 2 == 0){
					g.setColor(randomColor);
				}
				else {
					g.setColor(randomColor2);
				}
				g.fillOval(0 + x_temp, 0 + y_temp, height, height);
				height -= temp_inc*2;
				x_temp += temp_inc;
				y_temp += temp_inc;
				counter++;
			}
			
			Font font = new Font("Arial",Font.BOLD,15);
			g.setFont(font);
			g.drawString("The size of window is " + "(" + x + " , " +  (y + 150) + ")",20, y + 100);
			g.drawString("The ring width is: " + temp_inc + " , there will be " + counter + " rings",20, y + 125);
	}

}
