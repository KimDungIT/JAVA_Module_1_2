package module1_chapter3GiaoDien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import java.awt.Component;
import javax.swing.Box;

public class FrCapNhatLienHe extends JFrame {

	private JPanel contentPane;
	private JTextField txtNameTK;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtPic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrCapNhatLienHe frame = new FrCapNhatLienHe();
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
	public FrCapNhatLienHe() {
		setTitle("Th\u00F4ng tin li\u00EAn h\u1EC7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD t\u00EAn");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNameTK = new JTextField();
		txtNameTK.setBounds(113, 8, 233, 20);
		contentPane.add(txtNameTK);
		txtNameTK.setColumns(10);
		
		JButton btnTimKiem = new JButton("T\u00ECm ki\u1EBFm");
		btnTimKiem.setBounds(139, 57, 89, 23);
		contentPane.add(btnTimKiem);
		
		JLabel lblNewLabel_1 = new JLabel("C\u1EADp nh\u1EADt li\u00EAn h\u1EC7");
		lblNewLabel_1.setBounds(10, 113, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("H\u1ECD t\u00EAn");
		lblNewLabel_2.setBounds(10, 150, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtName = new JTextField();
		txtName.setBounds(113, 147, 233, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lbltdd = new JLabel("\u0110TDD");
		lbltdd.setBounds(10, 187, 46, 14);
		contentPane.add(lbltdd);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(113, 184, 233, 20);
		contentPane.add(txtPhone);
		
		JLabel lblHnhnh = new JLabel("H\u00ECnh \u1EA3nh");
		lblHnhnh.setBounds(10, 228, 46, 14);
		contentPane.add(lblHnhnh);
		
		txtPic = new JTextField();
		txtPic.setColumns(10);
		txtPic.setBounds(113, 225, 233, 20);
		contentPane.add(txtPic);
		
		JButton btnFileChooser = new JButton("...");
		btnFileChooser.setBounds(362, 224, 46, 23);
		contentPane.add(btnFileChooser);
		
		JButton btnCapNhat = new JButton("C\u1EADp nh\u1EADt");
		btnCapNhat.setBounds(180, 275, 89, 23);
		contentPane.add(btnCapNhat);
	}
}
