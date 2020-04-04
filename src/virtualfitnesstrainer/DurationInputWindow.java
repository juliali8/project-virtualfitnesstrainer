package virtualfitnesstrainer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DurationInputWindow extends JFrame {

	private JPanel contentPane;
	private JButton btnPrevious;
	private JButton btnNext;
	private JEditorPane dtrpnEnterDurationIn;
	private JLabel lblHowLongWill;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DurationInputWindow frame = new DurationInputWindow();
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
	public DurationInputWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		btnPrevious = new JButton("Previous");
		btnPrevious.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnPrevious, 0, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnPrevious);
		
		btnNext = new JButton("Next");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNext, 365, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNext, 0, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnPrevious, -365, SpringLayout.WEST, btnNext);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnPrevious, -268, SpringLayout.WEST, btnNext);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNext, 0, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnNext);
		
		dtrpnEnterDurationIn = new JEditorPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, dtrpnEnterDurationIn, -124, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, dtrpnEnterDurationIn, 137, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, dtrpnEnterDurationIn, -108, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, dtrpnEnterDurationIn, -123, SpringLayout.EAST, contentPane);
		dtrpnEnterDurationIn.setText("Enter duration in minutes");
		contentPane.add(dtrpnEnterDurationIn);
		
		lblHowLongWill = new JLabel("How long will your workout be?");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblHowLongWill, 66, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblHowLongWill, 82, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblHowLongWill, -113, SpringLayout.EAST, contentPane);
		contentPane.add(lblHowLongWill);
	}
}
