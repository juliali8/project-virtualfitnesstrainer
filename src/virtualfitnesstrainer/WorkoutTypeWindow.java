package virtualfitnesstrainer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class WorkoutTypeWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkoutTypeWindow frame = new WorkoutTypeWindow();
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
	public WorkoutTypeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnCardio = new JButton("Cardio");
		btnCardio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCardio, 159, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCardio, 26, SpringLayout.WEST, contentPane);
		contentPane.add(btnCardio);
		
		JButton btnPower = new JButton("Power");
		btnPower.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnPower, 0, SpringLayout.NORTH, btnCardio);
		contentPane.add(btnPower);
		
		JButton btnEndurance = new JButton("Endurance");
		btnEndurance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.EAST, btnPower, -50, SpringLayout.WEST, btnEndurance);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnEndurance, 0, SpringLayout.NORTH, btnCardio);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnEndurance, -21, SpringLayout.EAST, contentPane);
		contentPane.add(btnEndurance);
		
		JLabel lblChooseYourType = new JLabel("Choose your type of workout:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblChooseYourType, 59, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblChooseYourType, 121, SpringLayout.WEST, contentPane);
		contentPane.add(lblChooseYourType);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnPrevious, 0, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnPrevious);
	}
}
