package virtualfitnesstrainer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class OutputWindow extends JFrame {

	private JPanel panel;
	private Workout workout;
	private List<Exercise> exercises;

	/**
	 * Create the frame.
	 */
	public OutputWindow(Workout workout) {
		this.workout = workout;
		this.exercises = workout.getWorkout();
		
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
		
		JList<String> list = new JList<String>();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				JList<?> list = (JList<?>) event.getSource();
	            int index = list.locationToIndex(event.getPoint());
	            new OutputDetailsWindow(workout, exercises.get(index)).setVisible(true);
			}
		});
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
		
		JButton rerollButton = new JButton("Reroll");
		rerollButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				reroll();
			}
		});
		layout.putConstraint(SpringLayout.NORTH, rerollButton, 239, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.WEST, rerollButton, 67, SpringLayout.EAST, list);
		layout.putConstraint(SpringLayout.SOUTH, rerollButton, 268, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.EAST, rerollButton, 147, SpringLayout.EAST, list);
		panel.add(rerollButton);
	}
	
	public void reroll() {
		dispose();
		this.workout.generateWorkout();
		new OutputWindow(this.workout).setVisible(true);
	}

}
