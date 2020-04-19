package virtualfitnesstrainer;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class OutputDetailsWindow extends JPanel {

	/**
	 * Create the panel.
	 */
	public OutputDetailsWindow() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JButton btnBackToWorkouts = new JButton("Back");
		springLayout.putConstraint(SpringLayout.NORTH, btnBackToWorkouts, 261, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnBackToWorkouts, -440, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBackToWorkouts, 290, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnBackToWorkouts, -365, SpringLayout.EAST, this);
		add(btnBackToWorkouts);
		
		JLabel lblExercise = new JLabel("Exercise");
		springLayout.putConstraint(SpringLayout.EAST, lblExercise, -194, SpringLayout.EAST, this);
		add(lblExercise);
		
		JLabel lblDuration = new JLabel("Duration:");
		springLayout.putConstraint(SpringLayout.NORTH, lblDuration, 84, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblExercise, -29, SpringLayout.NORTH, lblDuration);
		add(lblDuration);
		
		JLabel label = new JLabel("0");
		springLayout.putConstraint(SpringLayout.EAST, lblDuration, -35, SpringLayout.WEST, label);
		springLayout.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, lblDuration);
		springLayout.putConstraint(SpringLayout.EAST, label, 0, SpringLayout.EAST, lblExercise);
		add(label);
		
		JLabel lblRepetitions = new JLabel("Repetitions:");
		springLayout.putConstraint(SpringLayout.WEST, lblRepetitions, 0, SpringLayout.WEST, lblDuration);
		add(lblRepetitions);
		
		JLabel label_1 = new JLabel("0");
		springLayout.putConstraint(SpringLayout.NORTH, label_1, 6, SpringLayout.SOUTH, label);
		springLayout.putConstraint(SpringLayout.WEST, label_1, 0, SpringLayout.WEST, label);
		add(label_1);
		
		JLabel lblMaterials = new JLabel("Materials:");
		springLayout.putConstraint(SpringLayout.NORTH, lblMaterials, 128, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblRepetitions, -6, SpringLayout.NORTH, lblMaterials);
		springLayout.putConstraint(SpringLayout.WEST, lblMaterials, 0, SpringLayout.WEST, lblDuration);
		add(lblMaterials);
		
		JLabel lblNewLabel = new JLabel("...");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, lblMaterials);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, label);
		add(lblNewLabel);
		
		JLabel lblHowTo = new JLabel("How to:");
		springLayout.putConstraint(SpringLayout.NORTH, lblHowTo, 7, SpringLayout.SOUTH, lblMaterials);
		springLayout.putConstraint(SpringLayout.WEST, lblHowTo, 0, SpringLayout.WEST, lblDuration);
		add(lblHowTo);
		
		JLabel lblNewLabel_1 = new JLabel("hello");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 6, SpringLayout.SOUTH, lblHowTo);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, -323, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 71, SpringLayout.SOUTH, lblHowTo);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -51, SpringLayout.EAST, this);
		add(lblNewLabel_1);

	}
}
