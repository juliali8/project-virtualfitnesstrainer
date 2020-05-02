package virtualfitnesstrainer;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;


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
		layout.putConstraint(SpringLayout.NORTH, exerciseLabel, 36, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.WEST, exerciseLabel, 47, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.SOUTH, exerciseLabel, -213, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.EAST, exerciseLabel, -29, SpringLayout.EAST, panel);
		exerciseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		exerciseLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel.add(exerciseLabel);
		
		JLabel durationLabel = new JLabel("Duration:");
		layout.putConstraint(SpringLayout.NORTH, durationLabel, 84, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.SOUTH, durationLabel, -168, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.EAST, durationLabel, 213, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.WEST, durationLabel, 154, SpringLayout.WEST, panel);

		panel.add(durationLabel);
		
		JLabel duration = new JLabel("" + exercise.getDuration() + " min(s)");
		layout.putConstraint(SpringLayout.NORTH, duration, 29, SpringLayout.SOUTH, exerciseLabel);
		layout.putConstraint(SpringLayout.WEST, duration, 38, SpringLayout.EAST, durationLabel);
		layout.putConstraint(SpringLayout.EAST, duration, -140, SpringLayout.EAST, panel);
		panel.add(duration);
		
		JLabel reps = new JLabel(exercise.getReps());
		layout.putConstraint(SpringLayout.NORTH, reps, 106, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.WEST, reps, 0, SpringLayout.WEST, duration);
		layout.putConstraint(SpringLayout.EAST, reps, 28, SpringLayout.EAST, duration);
		panel.add(reps);
	
		
		JLabel materialsLabel = new JLabel("Materials:");
		layout.putConstraint(SpringLayout.WEST, materialsLabel, 154, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.SOUTH, materialsLabel, -124, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.EAST, materialsLabel, 215, SpringLayout.WEST, panel);
		panel.add(materialsLabel);
		
		String equipment = "";
		for (String equip : exercise.getEquipment()) {
			equipment += equip + " ";
		}
		JLabel materials = new JLabel(equipment);
		layout.putConstraint(SpringLayout.NORTH, materials, 128, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.WEST, materials, 229, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.EAST, materials, -29, SpringLayout.EAST, panel);
		panel.add(materials);
		
		JLabel repsLabel = new JLabel("Repetitions:");
		layout.putConstraint(SpringLayout.NORTH, materialsLabel, 6, SpringLayout.SOUTH, repsLabel);
		layout.putConstraint(SpringLayout.SOUTH, repsLabel, -146, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.NORTH, repsLabel, 6, SpringLayout.SOUTH, durationLabel);
		layout.putConstraint(SpringLayout.WEST, repsLabel, 138, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.EAST, repsLabel, 213, SpringLayout.WEST, panel);
		panel.add(repsLabel);
		
		
        ImageIcon image = new ImageIcon(getClass().getResource(exercise.getImage()));
        int width = image.getIconWidth();
        int height = image.getIconHeight();
		
		JLabel detailsLabel = new JLabel();

		layout.putConstraint(SpringLayout.SOUTH, detailsLabel, 109, SpringLayout.SOUTH, materialsLabel);

		layout.putConstraint(SpringLayout.NORTH, detailsLabel, 6, SpringLayout.SOUTH, materialsLabel);
		layout.putConstraint(SpringLayout.WEST, detailsLabel, 0, SpringLayout.WEST, durationLabel);
		layout.putConstraint(SpringLayout.EAST, detailsLabel, 304, SpringLayout.WEST, panel);
		
        if(width > height) {
        	Image scaledImage = image.getImage().getScaledInstance(150, 100, Image.SCALE_DEFAULT);
        	ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        	detailsLabel.setIcon(scaledImageIcon);
        }
        else {
        	Image scaledImage = image.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT);
        	ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        	detailsLabel.setIcon(scaledImageIcon);
        }
        
		panel.add(detailsLabel);
		
		

	}
}
