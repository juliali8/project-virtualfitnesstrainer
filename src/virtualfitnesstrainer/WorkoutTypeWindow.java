package virtualfitnesstrainer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

@SuppressWarnings("serial")
public class WorkoutTypeWindow extends JFrame {

	private JPanel panel;

	/**
	 * Create the frame.
	 */
	public WorkoutTypeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		setResizable(false);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		SpringLayout layout = new SpringLayout();
		panel.setLayout(layout);
		
		JButton cardioButton = new JButton("Cardio");
		layout.putConstraint(SpringLayout.NORTH, cardioButton, -109, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.SOUTH, cardioButton, -80, SpringLayout.SOUTH, panel);
		cardioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nextCardio();
			}
		});
		panel.add(cardioButton);
		
		JButton powerButton = new JButton("Power");
		layout.putConstraint(SpringLayout.WEST, powerButton, 179, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.EAST, powerButton, -180, SpringLayout.EAST, panel);
		layout.putConstraint(SpringLayout.WEST, cardioButton, -153, SpringLayout.WEST, powerButton);
		layout.putConstraint(SpringLayout.EAST, cardioButton, -68, SpringLayout.WEST, powerButton);
		layout.putConstraint(SpringLayout.NORTH, powerButton, -109, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.SOUTH, powerButton, -80, SpringLayout.SOUTH, panel);
		powerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nextPower();
			}
		});
		panel.add(powerButton);
		
		JButton enduranceButton = new JButton("Endurance");
		layout.putConstraint(SpringLayout.WEST, enduranceButton, 310, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.NORTH, enduranceButton, -109, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.SOUTH, enduranceButton, -80, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.EAST, enduranceButton, 159, SpringLayout.EAST, powerButton);
		enduranceButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nextEndurance();
			}
		});
		panel.add(enduranceButton);
		
		JLabel chooseLabel = new JLabel("Choose your type of workout:");
		layout.putConstraint(SpringLayout.NORTH, chooseLabel, -100, SpringLayout.NORTH, powerButton);
		layout.putConstraint(SpringLayout.WEST, chooseLabel, -319, SpringLayout.EAST, panel);
		layout.putConstraint(SpringLayout.SOUTH, chooseLabel, -84, SpringLayout.NORTH, powerButton);
		layout.putConstraint(SpringLayout.EAST, chooseLabel, -132, SpringLayout.EAST, panel);
		panel.add(chooseLabel);
		
	}
	
	private void nextCardio() {
		dispose();
		new DurationInputWindow(new CardioWorkout()).setVisible(true);
	}
	
	private void nextPower() {
		dispose();
		new DurationInputWindow(new StrengthWorkout()).setVisible(true);
	}
	
	private void nextEndurance() {
		dispose();
		new DurationInputWindow(new EnduranceWorkout()).setVisible(true);
	}
}
