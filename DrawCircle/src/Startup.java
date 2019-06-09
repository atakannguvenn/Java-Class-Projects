import javax.swing.JFrame;

public class Startup {
	public static void main (String[] args) {
		
		TheWindow w = new TheWindow();
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setSize(500, 600);
		w.setVisible(true);
		
	}
}
