import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Registracija extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registracija frame = new Registracija();
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
	public Registracija() {
		setTitle("REGISTRACIJA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 654);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(178, 134, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(178, 182, 116, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(178, 234, 116, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(178, 289, 116, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(178, 350, 116, 22);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblIme = new JLabel("IME");
		lblIme.setBounds(61, 137, 56, 16);
		panel.add(lblIme);
		
		JLabel lblPrezime = new JLabel("PREZIME");
		lblPrezime.setBounds(61, 185, 56, 16);
		panel.add(lblPrezime);
		
		JLabel lblBrojIndeksa = new JLabel("BROJ INDEKSA");
		lblBrojIndeksa.setBounds(61, 237, 92, 16);
		panel.add(lblBrojIndeksa);
		
		JLabel lblNewLabel = new JLabel("KORISNICKO IME");
		lblNewLabel.setBounds(61, 292, 105, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LOZINKA");
		lblNewLabel_1.setBounds(61, 353, 56, 16);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("REGISTRACIJA");
		btnNewButton.setBounds(178, 424, 116, 22);
		panel.add(btnNewButton);
		
		JLabel lblRegistracija = new JLabel("REGISTRACIJA");
		lblRegistracija.setBackground(Color.ORANGE);
		lblRegistracija.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistracija.setBounds(134, 50, 207, 33);
		panel.add(lblRegistracija);
	}

}
