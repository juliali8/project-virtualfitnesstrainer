package virtualfitnesstrainer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

@SuppressWarnings("serial")
public class DurationInputWindow extends JFrame {

	private Workout workout;
	private JPanel panel;
	private JButton prevButton;
	private JButton nextButton;
	private JEditorPane durationBox;
	private JLabel durationLabel;

	/**
	 * Create the frame.
	 */
	public DurationInputWindow(Workout workout) {
		this.workout = workout;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		setResizable(false);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		SpringLayout layout = new SpringLayout();
		panel.setLayout(layout);
		
		prevButton = new JButton("Previous");
		prevButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				prev();
			}
		});
		layout.putConstraint(SpringLayout.SOUTH, prevButton, 0, SpringLayout.SOUTH, panel);
		panel.add(prevButton);
		
		nextButton = new JButton("Next");
		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				next();
			}
		});
		layout.putConstraint(SpringLayout.WEST, nextButton, 365, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.EAST, nextButton, 0, SpringLayout.EAST, panel);
		layout.putConstraint(SpringLayout.WEST, prevButton, -365, SpringLayout.WEST, nextButton);
		layout.putConstraint(SpringLayout.EAST, prevButton, -268, SpringLayout.WEST, nextButton);
		layout.putConstraint(SpringLayout.SOUTH, nextButton, 0, SpringLayout.SOUTH, panel);
		panel.add(nextButton);
		
		durationBox = new JEditorPane();
		layout.putConstraint(SpringLayout.NORTH, durationBox, -124, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.WEST, durationBox, 137, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.SOUTH, durationBox, -108, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.EAST, durationBox, -123, SpringLayout.EAST, panel);
		durationBox.setText("10");
		panel.add(durationBox);
		
		durationLabel = new JLabel("How long will your workout be (minutes)?");
		layout.putConstraint(SpringLayout.NORTH, durationLabel, 66, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.SOUTH, durationLabel, 82, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.EAST, durationLabel, -113, SpringLayout.EAST, panel);
		panel.add(durationLabel);
	}
	
	public String getDurationBoxText() {
		return durationBox.getText();
	}
	
	public void setDurationBoxText(String input) {
		durationBox.setText(input);
	}
	
	public void checkValidDurationBoxInput() {
		if (Integer.parseInt(durationBox.getText()) < 10) {
			durationBox.setText("10");
		}
	}
	
	private void prev() {
		dispose();
		new WorkoutTypeWindow().setVisible(true);
	}
	
	private void next() {
		dispose();
		checkValidDurationBoxInput();
		this.workout.setDuration(Integer.parseInt(durationBox.getText()));
		new MaterialsInputWindow(workout).setVisible(true);
	}
}
