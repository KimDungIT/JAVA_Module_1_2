package module1_chapter3GiaoDien;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class FrThongTinLienHe extends JFrame {

	private JPanel contentPane;
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
					FrThongTinLienHe frame = new FrThongTinLienHe();
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
	public FrThongTinLienHe() {
		setTitle("Th\u00F4ng tin li\u00EAn h\u1EC7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThngTinLin = new JLabel("Th\u00F4ng tin li\u00EAn h\u1EC7");
		lblThngTinLin.setBounds(10, 11, 130, 14);
		contentPane.add(lblThngTinLin);
		
		JLabel lblHTn = new JLabel("H\u1ECD t\u00EAn");
		lblHTn.setBounds(20, 46, 46, 14);
		contentPane.add(lblHTn);
		
		txtName = new JTextField();
		txtName.setBounds(193, 43, 223, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lbltdd = new JLabel("\u0110TDD");
		lbltdd.setBounds(20, 87, 46, 14);
		contentPane.add(lbltdd);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(193, 84, 223, 20);
		contentPane.add(txtPhone);
		
		JLabel lblHnhnh = new JLabel("H\u00ECnh \u1EA3nh");
		lblHnhnh.setBounds(20, 124, 66, 14);
		contentPane.add(lblHnhnh);
		JLabel lbName = new JLabel("");
		lbName.setBounds(193, 188, 223, 20);
		contentPane.add(lbName);
		JLabel lbPhone = new JLabel("");
		lbPhone.setBounds(193, 229, 223, 20);
		JLabel lbPic = new JLabel("");
		lbPic.setBounds(193, 270, 210, 160);
		contentPane.add(lbPic);
		contentPane.add(lbPhone);
		txtPic = new JTextField();
		txtPic.setColumns(10);
		txtPic.setBounds(193, 121, 223, 20);
		contentPane.add(txtPic);
		
		JButton btnHienThi = new JButton("Hi\u1EC3n th\u1ECB");
		btnHienThi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = txtName.getText().trim();
				String phone = txtPhone.getText().trim();
				String pic = txtPic.getText().trim();
				for(int i=0;i<phone.length();i++)
				{
					Pattern pattern = Pattern.compile("\\d*"); 
			        Matcher matcher = pattern.matcher(phone); 
			        if (matcher.matches() && phone.length()==10) { 
			            lbPhone.setText(phone); 
			        } else { 
			            lbPhone.setText("Du lieu nhap vao khong hop le");
			        }
				}
				lbName.setText(name);
				ImageIcon icon = new ImageIcon(pic);
				Image img = icon.getImage();
				Image newImg = img.getScaledInstance(lbPic.getWidth(),lbPic.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon image = new ImageIcon(newImg);
				lbPic.setIcon(image);
			}
		});
		btnHienThi.setBounds(179, 154, 89, 23);
		contentPane.add(btnHienThi);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD t\u00EAn");
		lblNewLabel.setBounds(20, 188, 46, 14);
		contentPane.add(lblNewLabel);
		
		
		
		
		JLabel lbltdd_1 = new JLabel("\u0110TDD");
		lbltdd_1.setBounds(20, 229, 46, 14);
		contentPane.add(lbltdd_1);
		
		
		
		JLabel lblHnhnh_1 = new JLabel("H\u00ECnh \u1EA3nh");
		lblHnhnh_1.setBounds(20, 270, 66, 14);
		contentPane.add(lblHnhnh_1);
	}
}
