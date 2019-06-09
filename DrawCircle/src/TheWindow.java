import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class TheWindow extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JSlider slider;
	private DrawOval myPanel;
	
	public TheWindow() {
		super("The title");
		myPanel = new DrawOval();
		myPanel.setBackground(Color.ORANGE);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 400, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
				new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						myPanel.setD(slider.getValue());
					}
					
				}
		);
		
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	}
}
