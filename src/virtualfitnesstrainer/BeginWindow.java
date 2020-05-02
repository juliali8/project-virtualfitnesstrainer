package virtualfitnesstrainer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class BeginWindow extends JFrame {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public BeginWindow() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout layout = new SpringLayout();
		frame.getContentPane().setLayout(layout);
		
		JButton beginButton = new JButton("BEGIN NOW");
		layout.putConstraint(SpringLayout.NORTH, beginButton, 178, SpringLayout.NORTH, frame.getContentPane());
		layout.putConstraint(SpringLayout.SOUTH, beginButton, 207, SpringLayout.NORTH, frame.getContentPane());
		beginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		beginButton.setBackground(Color.WHITE);
		beginButton.setForeground(new Color(0, 128, 0));
		layout.putConstraint(SpringLayout.WEST, beginButton, -286, SpringLayout.EAST, frame.getContentPane());
		layout.putConstraint(SpringLayout.EAST, beginButton, -170, SpringLayout.EAST, frame.getContentPane());
		beginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new WorkoutTypeWindow().setVisible(true);
			}
		});
		frame.getContentPane().add(beginButton);
		
		JLabel welcomeLabel = new JLabel("Welcome to COVID-19 FITNESS TRAINER!");
		layout.putConstraint(SpringLayout.NORTH, welcomeLabel, 79, SpringLayout.NORTH, frame.getContentPane());
		layout.putConstraint(SpringLayout.WEST, welcomeLabel, 99, SpringLayout.WEST, frame.getContentPane());
		layout.putConstraint(SpringLayout.SOUTH, welcomeLabel, -83, SpringLayout.NORTH, beginButton);
		layout.putConstraint(SpringLayout.EAST, welcomeLabel, 357, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(welcomeLabel);
	}
}
