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
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		SpringLayout layout = new SpringLayout();
		panel.setLayout(layout);
		
		JButton cardioButton = new JButton("Cardio");
		cardioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nextCardio();
			}
		});
		layout.putConstraint(SpringLayout.NORTH, cardioButton, 159, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.WEST, cardioButton, 26, SpringLayout.WEST, panel);
		panel.add(cardioButton);
		
		JButton powerButton = new JButton("Power");
		powerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nextPower();
			}
		});
		layout.putConstraint(SpringLayout.NORTH, powerButton, 0, SpringLayout.NORTH, cardioButton);
		panel.add(powerButton);
		
		JButton enduranceButton = new JButton("Endurance");
		enduranceButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nextEndurance();
			}
		});
		layout.putConstraint(SpringLayout.EAST, powerButton, -50, SpringLayout.WEST, enduranceButton);
		layout.putConstraint(SpringLayout.NORTH, enduranceButton, 0, SpringLayout.NORTH, cardioButton);
		layout.putConstraint(SpringLayout.EAST, enduranceButton, -21, SpringLayout.EAST, panel);
		panel.add(enduranceButton);
		
		JLabel chooseLabel = new JLabel("Choose your type of workout:");
		layout.putConstraint(SpringLayout.NORTH, chooseLabel, 59, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.WEST, chooseLabel, 121, SpringLayout.WEST, panel);
		panel.add(chooseLabel);
		
		JButton prevButton = new JButton("Previous");
		prevButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				prev();
			}
		});
		layout.putConstraint(SpringLayout.SOUTH, prevButton, 0, SpringLayout.SOUTH, panel);
		panel.add(prevButton);
	}
	
	private void prev() {
		dispose();
		new BeginWindow().setVisible(true);
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
