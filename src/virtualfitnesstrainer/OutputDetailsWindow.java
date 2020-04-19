package virtualfitnesstrainer;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OutputDetailsWindow extends JPanel {

	/**
	 * Create the panel.
	 */
	public OutputDetailsWindow() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JButton btnBackToWorkouts = new JButton("Back");
		btnBackToWorkouts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnBackToWorkouts, 261, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnBackToWorkouts, -440, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBackToWorkouts, 290, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnBackToWorkouts, -365, SpringLayout.EAST, this);
		add(btnBackToWorkouts);
		
		JLabel lblExercise = new JLabel("Exercise");
		springLayout.putConstraint(SpringLayout.NORTH, lblExercise, 46, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblExercise, 197, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblExercise, 65, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblExercise, 256, SpringLayout.WEST, this);
		lblExercise.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		add(lblExercise);
		
		JLabel lblDuration = new JLabel("Duration:");
		springLayout.putConstraint(SpringLayout.NORTH, lblDuration, 19, SpringLayout.SOUTH, lblExercise);
		springLayout.putConstraint(SpringLayout.WEST, lblDuration, 154, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblDuration, -200, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblDuration, 213, SpringLayout.WEST, this);
		add(lblDuration);
		
		JLabel duration = new JLabel("0");
		springLayout.putConstraint(SpringLayout.NORTH, duration, 19, SpringLayout.SOUTH, lblExercise);
		springLayout.putConstraint(SpringLayout.WEST, duration, 35, SpringLayout.EAST, lblDuration);
		springLayout.putConstraint(SpringLayout.EAST, duration, -143, SpringLayout.EAST, this);
		add(duration);
		
		JLabel lblRepetitions = new JLabel("Repetitions:");
		springLayout.putConstraint(SpringLayout.NORTH, lblRepetitions, 6, SpringLayout.SOUTH, lblDuration);
		springLayout.putConstraint(SpringLayout.SOUTH, lblRepetitions, 22, SpringLayout.SOUTH, lblDuration);
		springLayout.putConstraint(SpringLayout.WEST, lblRepetitions, 154, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblRepetitions, 229, SpringLayout.WEST, this);
		add(lblRepetitions);
		
		JLabel repetitions = new JLabel("0");
		springLayout.putConstraint(SpringLayout.NORTH, repetitions, 106, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, duration, -6, SpringLayout.NORTH, repetitions);
		springLayout.putConstraint(SpringLayout.WEST, repetitions, 19, SpringLayout.EAST, lblRepetitions);
		springLayout.putConstraint(SpringLayout.EAST, repetitions, -143, SpringLayout.EAST, this);
		add(repetitions);
		
		JLabel lblMaterials = new JLabel("Materials:");
		springLayout.putConstraint(SpringLayout.NORTH, lblMaterials, 128, SpringLayout.NORTH, this);
		add(lblMaterials);
		
		JLabel materials = new JLabel("...");
		springLayout.putConstraint(SpringLayout.EAST, lblMaterials, -33, SpringLayout.WEST, materials);
		springLayout.putConstraint(SpringLayout.SOUTH, repetitions, -6, SpringLayout.NORTH, materials);
		springLayout.putConstraint(SpringLayout.EAST, materials, -165, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, materials, -172, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, materials, -156, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, materials, 248, SpringLayout.WEST, this);
		add(materials);
		
		JLabel lblHowTo = new JLabel("How to:");
		springLayout.putConstraint(SpringLayout.NORTH, lblHowTo, 6, SpringLayout.SOUTH, lblMaterials);
		springLayout.putConstraint(SpringLayout.WEST, lblHowTo, 0, SpringLayout.WEST, lblDuration);
		springLayout.putConstraint(SpringLayout.SOUTH, lblHowTo, -134, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblHowTo, 0, SpringLayout.EAST, lblDuration);
		add(lblHowTo);
		

	}
}
