package virtualfitnesstrainer;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

@SuppressWarnings("serial")
public class OutputDetailsWindow extends JFrame {
	
	private JPanel panel;
	Workout workout;
	Exercise exercise;

	/**
	 * Create the panel.
	 */
	public OutputDetailsWindow(Workout workout, Exercise exercise) {
		this.workout = workout;
		this.exercise = exercise;
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		SpringLayout layout = new SpringLayout();
		panel.setLayout(layout);
		
		JLabel exerciseLabel = new JLabel("Exercise: " + exercise.getName());
		layout.putConstraint(SpringLayout.NORTH, exerciseLabel, 46, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.WEST, exerciseLabel, 197, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.SOUTH, exerciseLabel, 65, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.EAST, exerciseLabel, 256, SpringLayout.WEST, panel);
		exerciseLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel.add(exerciseLabel);
		
		JLabel durationLabel = new JLabel("Duration:");
		layout.putConstraint(SpringLayout.NORTH, durationLabel, 19, SpringLayout.SOUTH, exerciseLabel);
		layout.putConstraint(SpringLayout.WEST, durationLabel, 154, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.SOUTH, durationLabel, -200, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.EAST, durationLabel, 213, SpringLayout.WEST, panel);
		panel.add(durationLabel);
		
		JLabel duration = new JLabel("" + exercise.getDuration());
		layout.putConstraint(SpringLayout.NORTH, duration, 19, SpringLayout.SOUTH, exerciseLabel);
		layout.putConstraint(SpringLayout.WEST, duration, 35, SpringLayout.EAST, durationLabel);
		layout.putConstraint(SpringLayout.EAST, duration, -143, SpringLayout.EAST, panel);
		panel.add(duration);
		
		JLabel repsLabel = new JLabel("Repetitions:");
		layout.putConstraint(SpringLayout.NORTH, repsLabel, 6, SpringLayout.SOUTH, durationLabel);
		layout.putConstraint(SpringLayout.SOUTH, repsLabel, 22, SpringLayout.SOUTH, durationLabel);
		layout.putConstraint(SpringLayout.WEST, repsLabel, 154, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.EAST, repsLabel, 229, SpringLayout.WEST, panel);
		panel.add(repsLabel);
		
		JLabel reps = new JLabel("" + exercise.getReps());
		layout.putConstraint(SpringLayout.NORTH, reps, 106, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.SOUTH, duration, -6, SpringLayout.NORTH, reps);
		layout.putConstraint(SpringLayout.WEST, reps, 19, SpringLayout.EAST, repsLabel);
		layout.putConstraint(SpringLayout.EAST, reps, -143, SpringLayout.EAST, panel);
		panel.add(reps);
		
		JLabel materialsLabel = new JLabel("Materials:");
		layout.putConstraint(SpringLayout.NORTH, materialsLabel, 128, SpringLayout.NORTH, panel);
		panel.add(materialsLabel);
		
		JLabel materials = new JLabel("...");
		layout.putConstraint(SpringLayout.EAST, materialsLabel, -33, SpringLayout.WEST, materials);
		layout.putConstraint(SpringLayout.SOUTH, reps, -6, SpringLayout.NORTH, materials);
		layout.putConstraint(SpringLayout.EAST, materials, -165, SpringLayout.EAST, panel);
		layout.putConstraint(SpringLayout.NORTH, materials, -172, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.SOUTH, materials, -156, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.WEST, materials, 248, SpringLayout.WEST, panel);
		panel.add(materials);
		
		JLabel detailsLabel = new JLabel("How to:");
		layout.putConstraint(SpringLayout.NORTH, detailsLabel, 6, SpringLayout.SOUTH, materialsLabel);
		layout.putConstraint(SpringLayout.WEST, detailsLabel, 0, SpringLayout.WEST, durationLabel);
		layout.putConstraint(SpringLayout.SOUTH, detailsLabel, -134, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.EAST, detailsLabel, 0, SpringLayout.EAST, durationLabel);
		panel.add(detailsLabel);
		

	}
}
