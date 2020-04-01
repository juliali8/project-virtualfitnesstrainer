package virtualfitnesstrainer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class MaterialsInputWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaterialsInputWindow frame = new MaterialsInputWindow();
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
	public MaterialsInputWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblCheckAllThat = new JLabel("check all that apply");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblCheckAllThat, 154, SpringLayout.WEST, contentPane);
		contentPane.add(lblCheckAllThat);
		
		JLabel lblWhatMaterialsDo = new JLabel("What materials do you have handy?");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblCheckAllThat, 18, SpringLayout.SOUTH, lblWhatMaterialsDo);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblWhatMaterialsDo, 113, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblWhatMaterialsDo, 333, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblWhatMaterialsDo, 40, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblWhatMaterialsDo, 56, SpringLayout.NORTH, contentPane);
		contentPane.add(lblWhatMaterialsDo);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("dumbbells");
		sl_contentPane.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox, 31, SpringLayout.SOUTH, lblCheckAllThat);
		sl_contentPane.putConstraint(SpringLayout.WEST, chckbxNewCheckBox, 28, SpringLayout.WEST, contentPane);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMat = new JCheckBox("mat");
		sl_contentPane.putConstraint(SpringLayout.NORTH, chckbxMat, 6, SpringLayout.SOUTH, chckbxNewCheckBox);
		sl_contentPane.putConstraint(SpringLayout.WEST, chckbxMat, 0, SpringLayout.WEST, chckbxNewCheckBox);
		contentPane.add(chckbxMat);
		
		JCheckBox chckbxResistanceBand = new JCheckBox("resistance band");
		sl_contentPane.putConstraint(SpringLayout.NORTH, chckbxResistanceBand, 6, SpringLayout.SOUTH, chckbxMat);
		sl_contentPane.putConstraint(SpringLayout.WEST, chckbxResistanceBand, 0, SpringLayout.WEST, chckbxNewCheckBox);
		contentPane.add(chckbxResistanceBand);
		
		JCheckBox chckbxTreadmill = new JCheckBox("treadmill");
		sl_contentPane.putConstraint(SpringLayout.NORTH, chckbxTreadmill, 0, SpringLayout.NORTH, chckbxNewCheckBox);
		sl_contentPane.putConstraint(SpringLayout.WEST, chckbxTreadmill, 59, SpringLayout.EAST, chckbxNewCheckBox);
		contentPane.add(chckbxTreadmill);
		
		JCheckBox chckbxBike = new JCheckBox("bike");
		sl_contentPane.putConstraint(SpringLayout.NORTH, chckbxBike, 0, SpringLayout.NORTH, chckbxMat);
		sl_contentPane.putConstraint(SpringLayout.WEST, chckbxBike, 0, SpringLayout.WEST, chckbxTreadmill);
		contentPane.add(chckbxBike);
		
		JCheckBox chckbxMedicineBall = new JCheckBox("medicine ball");
		sl_contentPane.putConstraint(SpringLayout.NORTH, chckbxMedicineBall, 0, SpringLayout.NORTH, chckbxResistanceBand);
		sl_contentPane.putConstraint(SpringLayout.WEST, chckbxMedicineBall, 0, SpringLayout.WEST, chckbxTreadmill);
		contentPane.add(chckbxMedicineBall);
		
		JButton btnBegin = new JButton("BEGIN");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnBegin, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnBegin, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnBegin);
	}
}
