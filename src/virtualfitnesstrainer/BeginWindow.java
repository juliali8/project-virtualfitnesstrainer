package virtualfitnesstrainer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class BeginWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BeginWindow window = new BeginWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BeginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnBeginNow = new JButton("BEGIN NOW");
		springLayout.putConstraint(SpringLayout.NORTH, btnBeginNow, 178, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnBeginNow, -71, SpringLayout.SOUTH, frame.getContentPane());
		btnBeginNow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnBeginNow.setBackground(Color.WHITE);
		btnBeginNow.setForeground(new Color(0, 128, 0));
		springLayout.putConstraint(SpringLayout.WEST, btnBeginNow, -286, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnBeginNow, -170, SpringLayout.EAST, frame.getContentPane());
		btnBeginNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnBeginNow);
		
		JLabel lblWelcomeToCovid = new JLabel("Welcome to COVID-19 FITNESS TRAINER!");
		springLayout.putConstraint(SpringLayout.NORTH, lblWelcomeToCovid, 79, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblWelcomeToCovid, -93, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lblWelcomeToCovid);
	}
}
