package module1_chapter5DoiTuong;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class FrPayment extends JFrame {

	private JPanel contentPane;
	private JTextField txtCardNumber;
	private JTextField txtFullName;
	private JTextField txtAddress;
	private JTextField txtCountry;
	private JTextField txtZipcode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrPayment frame = new FrPayment();
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
	public FrPayment() {
		setTitle("Payment Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCardType = new JLabel("Card type");
		lblCardType.setBounds(10, 11, 65, 14);
		contentPane.add(lblCardType);
		
		JLabel lblCardNumber = new JLabel("Card number");
		lblCardNumber.setBounds(10, 46, 65, 14);
		contentPane.add(lblCardNumber);
		
		JComboBox cbbTypeCard = new JComboBox();
		cbbTypeCard.setBounds(169, 11, 102, 20);
		contentPane.add(cbbTypeCard);
		
		txtCardNumber = new JTextField();
		txtCardNumber.setBounds(169, 46, 218, 20);
		contentPane.add(txtCardNumber);
		txtCardNumber.setColumns(10);
		
		JLabel lblBuill = new JLabel("BILL INFORMATION");
		lblBuill.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblBuill.setBounds(150, 93, 213, 28);
		contentPane.add(lblBuill);
		
		JLabel lblFullName = new JLabel("Full name");
		lblFullName.setBounds(10, 147, 65, 14);
		contentPane.add(lblFullName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 182, 80, 14);
		contentPane.add(lblAddress);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(10, 216, 80, 14);
		contentPane.add(lblCountry);
		
		JLabel lblZipCode = new JLabel("Zip code");
		lblZipCode.setBounds(10, 251, 80, 14);
		contentPane.add(lblZipCode);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(167, 284, 89, 23);
		contentPane.add(btnSubmit);
		
		txtFullName = new JTextField();
		txtFullName.setBounds(169, 144, 218, 20);
		contentPane.add(txtFullName);
		txtFullName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(169, 179, 218, 20);
		contentPane.add(txtAddress);
		
		txtCountry = new JTextField();
		txtCountry.setColumns(10);
		txtCountry.setBounds(169, 213, 218, 20);
		contentPane.add(txtCountry);
		
		txtZipcode = new JTextField();
		txtZipcode.setColumns(10);
		txtZipcode.setBounds(169, 248, 218, 20);
		contentPane.add(txtZipcode);
	}
}
