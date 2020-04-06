package virtualfitnesstrainer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.util.*;

@SuppressWarnings("serial")
public class MaterialsInputWindow extends JFrame {

	private JPanel panel;
	private JCheckBox[] checkboxes;
	private Workout workout;

	/**
	 * Create the frame.
	 */
	public MaterialsInputWindow(Workout workout) {
		this.workout = workout;
		this.checkboxes = new JCheckBox[6];
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		SpringLayout layout = new SpringLayout();
		panel.setLayout(layout);
		
		JLabel checkLabel = new JLabel("Check all that apply");
		layout.putConstraint(SpringLayout.WEST, checkLabel, 154, SpringLayout.WEST, panel);
		panel.add(checkLabel);
		
		JLabel materialsLabel = new JLabel("What materials do you have handy?");
		layout.putConstraint(SpringLayout.NORTH, checkLabel, 18, SpringLayout.SOUTH, materialsLabel);
		layout.putConstraint(SpringLayout.WEST, materialsLabel, 113, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.EAST, materialsLabel, 333, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.NORTH, materialsLabel, 40, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.SOUTH, materialsLabel, 56, SpringLayout.NORTH, panel);
		panel.add(materialsLabel);
		
		JCheckBox dumbbellsCheckBox = new JCheckBox("Dumbbells");
		layout.putConstraint(SpringLayout.NORTH, dumbbellsCheckBox, 31, SpringLayout.SOUTH, checkLabel);
		layout.putConstraint(SpringLayout.WEST, dumbbellsCheckBox, 28, SpringLayout.WEST, panel);
		panel.add(dumbbellsCheckBox);
		checkboxes[0] = dumbbellsCheckBox;
		
		JCheckBox matCheckBox = new JCheckBox("Mat");
		layout.putConstraint(SpringLayout.NORTH, matCheckBox, 6, SpringLayout.SOUTH, dumbbellsCheckBox);
		layout.putConstraint(SpringLayout.WEST, matCheckBox, 0, SpringLayout.WEST, dumbbellsCheckBox);
		panel.add(matCheckBox);
		checkboxes[1] = matCheckBox;
		
		JCheckBox resistBandCheckBox = new JCheckBox("Resistance band");
		layout.putConstraint(SpringLayout.NORTH, resistBandCheckBox, 6, SpringLayout.SOUTH, matCheckBox);
		layout.putConstraint(SpringLayout.WEST, resistBandCheckBox, 0, SpringLayout.WEST, dumbbellsCheckBox);
		panel.add(resistBandCheckBox);
		checkboxes[2] = resistBandCheckBox;
		
		JCheckBox treadmillCheckBox = new JCheckBox("Treadmill");
		layout.putConstraint(SpringLayout.NORTH, treadmillCheckBox, 0, SpringLayout.NORTH, dumbbellsCheckBox);
		layout.putConstraint(SpringLayout.WEST, treadmillCheckBox, 59, SpringLayout.EAST, dumbbellsCheckBox);
		panel.add(treadmillCheckBox);
		checkboxes[3] = treadmillCheckBox;
		
		JCheckBox bikeCheckBox = new JCheckBox("Bike");
		layout.putConstraint(SpringLayout.NORTH, bikeCheckBox, 0, SpringLayout.NORTH, matCheckBox);
		layout.putConstraint(SpringLayout.WEST, bikeCheckBox, 0, SpringLayout.WEST, treadmillCheckBox);
		panel.add(bikeCheckBox);
		checkboxes[4] = bikeCheckBox;
		
		JCheckBox medBallCheckBox = new JCheckBox("Medicine ball");
		layout.putConstraint(SpringLayout.NORTH, medBallCheckBox, 0, SpringLayout.NORTH, resistBandCheckBox);
		layout.putConstraint(SpringLayout.WEST, medBallCheckBox, 0, SpringLayout.WEST, treadmillCheckBox);
		panel.add(medBallCheckBox);
		checkboxes[5] = medBallCheckBox;
		
		JButton prevButton = new JButton("Previous");
		prevButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				prev();
			}
		});
		layout.putConstraint(SpringLayout.SOUTH, prevButton, 0, SpringLayout.SOUTH, panel);
		panel.add(prevButton);
		
		JButton beginButton = new JButton("BEGIN");
		beginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				begin();
			}
		});
		layout.putConstraint(SpringLayout.SOUTH, beginButton, 0, SpringLayout.SOUTH, panel);
		layout.putConstraint(SpringLayout.EAST, beginButton, -10, SpringLayout.EAST, panel);
		panel.add(beginButton);
	}
	
	private void prev() {
		dispose();
		new DurationInputWindow(this.workout).setVisible(true);
	}
	
	private void begin() {
		dispose();
		List<String> equipment = new ArrayList<String>();
		for (JCheckBox checkbox : checkboxes) {
			if (checkbox.isSelected()) {
				equipment.add(checkbox.getText());
			}
		}
		this.workout.addEquipment(equipment);
		new OutputWindow(this.workout).setVisible(true);
	}
	
	
}
