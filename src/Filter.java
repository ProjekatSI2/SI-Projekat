import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Choice;

public class Filter extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Filter frame = new Filter();
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
	public Filter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 665);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JCheckBox chckbxSve = new JCheckBox("SVE");
		chckbxSve.setBounds(190, 386, 113, 25);
		panel.add(chckbxSve);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 148, 155, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(190, 198, 155, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(190, 247, 155, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(190, 298, 155, 22);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(190, 350, 155, 22);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("PRETRAZI");
		btnNewButton.setBounds(190, 420, 97, 25);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Vrsta");
		lblNewLabel.setBounds(81, 103, 56, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Naziv");
		lblNewLabel_1.setBounds(81, 151, 56, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Autor");
		lblNewLabel_2.setBounds(81, 201, 56, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mentor");
		lblNewLabel_3.setBounds(81, 250, 56, 16);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Godina izdanja");
		lblNewLabel_4.setBounds(81, 301, 97, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ISBN broj");
		lblNewLabel_5.setBounds(81, 353, 56, 16);
		panel.add(lblNewLabel_5);
		
		String[] items = {"Udzbenik", "Zbirka zadataka", "Praktikum", "Monografija", "Zavrsni rad", "Diplomski rad", "Master rad", "Doktorska disertacija"};
		JComboBox comboBox = new JComboBox(items);
		comboBox.setBounds(190, 100, 155, 22);
		panel.add(comboBox);
	}
}
