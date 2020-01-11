package view;

import java.awt.*;
import javax.swing.*;

public class View extends JFrame {
	
	JPanel maps;
	final static String MAP1 = "Floor 1";
	final static String MAP2 = "Floor 2";

	public View() {
		super("Murder Solver");
		super.setResizable(false);
		this.setMinimumSize(new Dimension(600,605));
		this.setMaximumSize(new Dimension(600,605));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creating first floor map JPanel
		JPanel floor1 = new JPanel(new BorderLayout());
		
		JLabel floor1Image = new JLabel();
		floor1Image.setIcon(new ImageIcon("Floor_1.jpg"));
		floor1.add(floor1Image, BorderLayout.PAGE_START);
		
		
		JPanel floor2 = new JPanel(new BorderLayout());
		
		maps = new JPanel(new CardLayout());
		maps.add(floor1, MAP1);
		maps.add(floor2, MAP2);
		
		
		((CardLayout)(maps.getLayout())).show(maps, "Floor 1");
		
		add(maps);
		pack();
		setVisible(true);
		setSize(600,600);
	}
	
	public static void main(String args[]) {
		View v = new View();
		
	}
	
}