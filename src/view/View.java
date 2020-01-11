package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class View extends JFrame {
	
	JPanel maps;
	JPanel floor1, floor2;
	final static String MAP1 = "Floor 1";
	final static String MAP2 = "Floor 2";

	public View() {
		super("Murder Solver");
		super.setResizable(false);
		this.setMinimumSize(new Dimension(600,605));
		this.setMaximumSize(new Dimension(600,605));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		floor1 = new JPanel(new BorderLayout());
		setFloorOne();
		floor2 = new JPanel(new BorderLayout());
		setFloorTwo();
		
		
		maps = new JPanel(new CardLayout());
		
		JMenuBar floors = new JMenuBar();
		JButton f1 = new JButton("First Floor");
		f1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
            	((CardLayout)(maps.getLayout())).show(maps, "Floor 1");
            }
        });
		JButton f2 = new JButton("Second Floor");
		f2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
            	((CardLayout)(maps.getLayout())).show(maps, "Floor 2");
            }
        });
		
		floors.add(f1);
		floors.add(f2);
		//maps.setSize(500, 600);
		
		add(floors, BorderLayout.NORTH);
		maps.add(floor1, MAP1);
		maps.add(floor2, MAP2);
		maps.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		
		((CardLayout)(maps.getLayout())).show(maps, "Floor 2");
		
		add(maps, BorderLayout.PAGE_END);
		
		pack();
		setVisible(true);
		setSize(600,600);
	}
	
	public void setFloorOne() {
		
		JLabel floor1Image = new JLabel();
		floor1Image.setIcon(new ImageIcon("Floor_1.jpg"));
		floor1.add(floor1Image, BorderLayout.EAST);
	}
	
	public void setFloorTwo() {
		JLabel floor2Image = new JLabel();
		floor2Image.setIcon(new ImageIcon("Floor_2.jpg"));
		floor2.add(floor2Image, BorderLayout.EAST);
	}
	
	public static void main(String args[]) {
		View v = new View();
		
	}
	
}
