package virtualfitnesstrainer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class OutputWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OutputWindow frame = new OutputWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OutputWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblYourWorkout = new JLabel("Your Workout:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblYourWorkout, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblYourWorkout, 164, SpringLayout.WEST, contentPane);
		contentPane.add(lblYourWorkout);
		
		JList list = new JList();
		sl_contentPane.putConstraint(SpringLayout.NORTH, list, -225, SpringLayout.SOUTH, contentPane);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4", "Exercise 5"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		sl_contentPane.putConstraint(SpringLayout.WEST, list, 130, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, list, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, list, 293, SpringLayout.WEST, contentPane);
		contentPane.add(list);
	}

}
