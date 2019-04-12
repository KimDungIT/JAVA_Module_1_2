package vd1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmTong2SoNguyen extends JFrame {

	private JPanel contentPane;
	private JTextField txtSoThuNhat;
	private JTextField txtSoThuHai;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTong2SoNguyen frame = new FrmTong2SoNguyen();
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
	public FrmTong2SoNguyen() {
		setTitle("T\u1ED5ng 2 s\u1ED1 nguy\u00EAn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTinhTong = new JLabel("T\u00EDnh t\u1ED5ng hai s\u1ED1 nguy\u00EAn");
		lblTinhTong.setBounds(157, 22, 168, 14);
		contentPane.add(lblTinhTong);
		
		JLabel lblSoThuNhat = new JLabel("S\u1ED1 nguy\u00EAn th\u1EE9 nh\u1EA5t");
		lblSoThuNhat.setBounds(30, 74, 128, 14);
		contentPane.add(lblSoThuNhat);
		
		txtSoThuNhat = new JTextField();
		txtSoThuNhat.setBounds(168, 71, 212, 20);
		contentPane.add(txtSoThuNhat);
		txtSoThuNhat.setColumns(10);
		
		JLabel lblSoThuHai = new JLabel("S\u1ED1 nguy\u00EAn th\u1EE9 hai:");
		lblSoThuHai.setBounds(30, 105, 128, 14);
		contentPane.add(lblSoThuHai);
		
		txtSoThuHai = new JTextField();
		txtSoThuHai.setBounds(168, 102, 212, 20);
		contentPane.add(txtSoThuHai);
		txtSoThuHai.setColumns(10);
		
		JButton btnTinhTong = new JButton("T\u1ED5ng");
		btnTinhTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//xử lí
				//trim(): xóa khoảng trắng ở đầu và cuối chuỗi
				//Lấy dữ liệu người dùng nhập vào
				
				int so1 = Integer.parseInt(txtSoThuNhat.getText().trim());
				
				int so2 = Integer.parseInt(txtSoThuHai.getText().trim());
				
				//Tính tổng
				int ketqua = so1+so2;
				
				//Hiện thị kết quả
				txtKetQua.setText(String.valueOf(ketqua));
				
			}
		});
		btnTinhTong.setBounds(157, 176, 89, 23);
		contentPane.add(btnTinhTong);
		
		JLabel lblKetQua = new JLabel("K\u1EBFt qu\u1EA3:");
		lblKetQua.setBounds(35, 142, 46, 14);
		contentPane.add(lblKetQua);
		
		txtKetQua = new JTextField();
		txtKetQua.setBounds(168, 137, 212, 20);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
	}

}
