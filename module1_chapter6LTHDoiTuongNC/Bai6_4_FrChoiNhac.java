package module1_chapter6LTHDoiTuongNC;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Bai6_4_FrChoiNhac extends JFrame {

	private JPanel contentPane;
	private JTextField txtNhacCu;
	private JTextField txtTenHinh;
	private JTextField txtSoDay;
	private JLabel lblImage;
	private JLabel lblDeChoi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai6_4_FrChoiNhac frame = new Bai6_4_FrChoiNhac();
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
	public Bai6_4_FrChoiNhac() {
		setTitle("Nh\u1EA1c c\u1EE5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTnNhcC = new JLabel("T\u00EAn nh\u1EA1c c\u1EE5");
		lblTnNhcC.setBounds(10, 30, 91, 14);
		contentPane.add(lblTnNhcC);
		
		JLabel lblTnHnh = new JLabel("T\u00EAn h\u00ECnh");
		lblTnHnh.setBounds(10, 87, 91, 14);
		contentPane.add(lblTnHnh);
		
		JLabel lblLoiNhcC = new JLabel("Lo\u1EA1i nh\u1EA1c c\u1EE5");
		lblLoiNhcC.setBounds(10, 149, 91, 14);
		contentPane.add(lblLoiNhcC);
		
		JLabel lblSoDay = new JLabel("S\u1ED1 d\u00E2y");
		lblSoDay.setBounds(10, 210, 91, 14);
		contentPane.add(lblSoDay);
		
		txtNhacCu = new JTextField();
		txtNhacCu.setBounds(111, 24, 154, 20);
		contentPane.add(txtNhacCu);
		txtNhacCu.setColumns(10);
		
		txtTenHinh = new JTextField();
		txtTenHinh.setColumns(10);
		txtTenHinh.setBounds(111, 81, 154, 20);
		contentPane.add(txtTenHinh);
		
		txtSoDay = new JTextField();
		txtSoDay.setColumns(10);
		txtSoDay.setBounds(111, 204, 154, 20);
		contentPane.add(txtSoDay);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().toString()=="Không dây")
				{
					lblSoDay.setText("Sử dụng");
					lblDeChoi.setVisible(true);
				}
				else
				{
					lblSoDay.setText("Số dây");
					lblDeChoi.setVisible(false);
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"C\u00F3 d\u00E2y", "Kh\u00F4ng d\u00E2y"}));
		comboBox.setBounds(111, 143, 154, 20);
		contentPane.add(comboBox);
		
		lblImage = new JLabel("");
		lblImage.setBounds(331, 16, 176, 183);
		contentPane.add(lblImage);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(331, 210, 176, 73);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		lblDeChoi = new JLabel("\u0110\u1EC3 ch\u01A1i");
		lblDeChoi.setVisible(false);
		lblDeChoi.setBounds(275, 210, 54, 14);
		contentPane.add(lblDeChoi);
		
		JButton btnChoiNhac = new JButton("Ch\u01A1i nh\u1EA1c");
		btnChoiNhac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tenNhacCu = txtNhacCu.getText().trim();
				String choiNhac="";
				String tenHinh = "./src/img/"+txtTenHinh.getText().trim();
				String soDay = txtSoDay.getText().trim();
				if(comboBox.getSelectedIndex()==0)
				{
					NhacCuCoDay nccd = new NhacCuCoDay(Integer.parseInt(soDay),tenNhacCu,tenHinh );
					choiNhac = nccd.ChoiNhac();
				}
				else
				{
					NhacCuKhongDay nckd = new NhacCuKhongDay(soDay,tenNhacCu,tenHinh);
					choiNhac = nckd.ChoiNhac();
				}
				XuLyAnh(lblImage,tenHinh);
				textArea.setText(choiNhac);
			}
		});
		btnChoiNhac.setBounds(132, 260, 105, 23);
		contentPane.add(btnChoiNhac);
	}
	public void XuLyAnh(JLabel lab, String duongDan) {
		try {
			BufferedImage img = ImageIO.read(new File(duongDan));
			int x = lab.getSize().width;
			int y = lab.getSize().height;
			int ix = img.getWidth();
			int iy = img.getHeight();
			int dx=0;
			int dy=0;
			
			if(x/y > ix/iy) {
				dy = y;
				dx = dy*ix/iy;
			}
			else {
				dx = x;
				dy = dx*iy/ix;
			}
			ImageIcon icon = new ImageIcon(img.getScaledInstance(dx, dy, img.SCALE_SMOOTH));
			lab.setIcon(icon);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
