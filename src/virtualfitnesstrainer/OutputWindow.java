package virtualfitnesstrainer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.List;

@SuppressWarnings("serial")
public class OutputWindow extends JFrame {

	private JPanel panel;
	private Workout workout;
	@SuppressWarnings("unused")
	private List<Exercise> exercises;

	/**
	 * Create the frame.
	 */
	public OutputWindow(Workout workout) {
		this.workout = workout;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		SpringLayout layout = new SpringLayout();
		panel.setLayout(layout);
		
		JLabel workoutLabel = new JLabel("Your Workout:");
		layout.putConstraint(SpringLayout.NORTH, workoutLabel, 10, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.WEST, workoutLabel, 164, SpringLayout.WEST, panel);
		panel.add(workoutLabel);
		
		List<Exercise> exercises = this.workout.generateWorkout();
		
		JList<String> list = new JList<String>();
		layout.putConstraint(SpringLayout.NORTH, list, -225, SpringLayout.SOUTH, panel);
		list.setModel(new DefaultListModel<String>() {
			public int getSize() {
				return exercises.size();
			}
			public String getElementAt(int index) {
				return exercises.get(index).toString();
			}
		});
		layout.putConstraint(SpringLayout.WEST, list, 130, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.SOUTH, list, -10, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.EAST, list, 293, SpringLayout.WEST, panel);
		panel.add(list);
	}
	
	public void generateWorkout() {
		
	}

}
