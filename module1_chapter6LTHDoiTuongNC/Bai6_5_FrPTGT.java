package module1_chapter6LTHDoiTuongNC;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai6_5_FrPTGT extends JFrame {

	private JPanel contentPane;
	private JTextField txtQuangDuong;
	private JTextField txtThoiGian;
	private JTextField txtSoLit;
	private JTextField txtTenXe;
	private JTextField txtHangSanXuat;
	private JTextField txtTrongLuong;
	private JTextField txtSucTai;
	private JTextField txtVTXuoi;
	private JTextField txtVTNguoc;
	private JTextField txtNhienLieuTH;
	private JTextField txtVanToc;
	private JTextField txtTieuThuNL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai6_5_FrPTGT frame = new Bai6_5_FrPTGT();
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
	public Bai6_5_FrPTGT() {
		setTitle("Ph\u01B0\u01A1ng ti\u1EC7n giao th\u00F4ng- \u0111\u1ED9ng c\u01A1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThngTinChung = new JLabel("Th\u00F4ng tin chung");
		lblThngTinChung.setBounds(10, 11, 182, 14);
		contentPane.add(lblThngTinChung);
		
		JLabel lblQunng = new JLabel("Qu\u00E3n \u0111\u01B0\u1EDDng(km)");
		lblQunng.setBounds(10, 41, 116, 14);
		contentPane.add(lblQunng);
		
		txtQuangDuong = new JTextField();
		txtQuangDuong.setBounds(114, 38, 86, 20);
		contentPane.add(txtQuangDuong);
		txtQuangDuong.setColumns(10);
		
		JLabel lblThiGian = new JLabel("Th\u1EDDi gian (gi\u1EDD)");
		lblThiGian.setBounds(210, 41, 92, 14);
		contentPane.add(lblThiGian);
		
		txtThoiGian = new JTextField();
		txtThoiGian.setColumns(10);
		txtThoiGian.setBounds(312, 38, 86, 20);
		contentPane.add(txtThoiGian);
		
		JLabel lblNhinLiulit = new JLabel("Nhi\u00EAn li\u1EC7u (lit)");
		lblNhinLiulit.setBounds(417, 41, 92, 14);
		contentPane.add(lblNhinLiulit);
		
		txtSoLit = new JTextField();
		txtSoLit.setColumns(10);
		txtSoLit.setBounds(509, 38, 86, 20);
		contentPane.add(txtSoLit);
		
		JRadioButton rdbtnXeHoi = new JRadioButton("Xe h\u01A1i");
		rdbtnXeHoi.setBounds(32, 91, 109, 23);
		contentPane.add(rdbtnXeHoi);
		
		JRadioButton rdbtnTauThuy = new JRadioButton("T\u00E0u th\u1EE7y");
		rdbtnTauThuy.setBounds(350, 91, 109, 23);
		contentPane.add(rdbtnTauThuy);
		
		JLabel lblTnXe = new JLabel("T\u00EAn xe");
		lblTnXe.setBounds(10, 141, 46, 14);
		contentPane.add(lblTnXe);
		
		txtTenXe = new JTextField();
		txtTenXe.setColumns(10);
		txtTenXe.setBounds(108, 138, 116, 20);
		contentPane.add(txtTenXe);
		
		JLabel lblHngSnXut = new JLabel("H\u00E3ng s\u1EA3n xu\u1EA5t");
		lblHngSnXut.setBounds(10, 184, 100, 14);
		contentPane.add(lblHngSnXut);
		
		txtHangSanXuat = new JTextField();
		txtHangSanXuat.setColumns(10);
		txtHangSanXuat.setBounds(108, 181, 114, 20);
		contentPane.add(txtHangSanXuat);
		
		JLabel lblTrngLngkg = new JLabel("Tr\u1ECDng l\u01B0\u1EE3ng (kg)");
		lblTrngLngkg.setBounds(312, 144, 110, 14);
		contentPane.add(lblTrngLngkg);
		
		txtTrongLuong = new JTextField();
		txtTrongLuong.setColumns(10);
		txtTrongLuong.setBounds(432, 141, 116, 20);
		contentPane.add(txtTrongLuong);
		
		JLabel lblScTikg = new JLabel("S\u1EE9c t\u1EA3i (kg)");
		lblScTikg.setBounds(312, 184, 110, 14);
		contentPane.add(lblScTikg);
		
		txtSucTai = new JTextField();
		txtSucTai.setColumns(10);
		txtSucTai.setBounds(432, 181, 116, 20);
		contentPane.add(txtSucTai);
		
		JLabel lblVnTcNc = new JLabel("V\u1EADn t\u1ED1c n\u01B0\u1EDBc xu\u00F4i d\u00F2ng (km/h)");
		lblVnTcNc.setBounds(210, 229, 212, 14);
		contentPane.add(lblVnTcNc);
		
		txtVTXuoi = new JTextField();
		txtVTXuoi.setColumns(10);
		txtVTXuoi.setBounds(432, 226, 116, 20);
		contentPane.add(txtVTXuoi);
		
		JLabel lblVnTcNc_1 = new JLabel("V\u1EADn t\u1ED1c n\u01B0\u1EDBc ng\u01B0\u1EE3c d\u00F2ng (km/h)");
		lblVnTcNc_1.setBounds(210, 267, 212, 14);
		contentPane.add(lblVnTcNc_1);
		
		txtVTNguoc = new JTextField();
		txtVTNguoc.setColumns(10);
		txtVTNguoc.setBounds(432, 264, 116, 20);
		contentPane.add(txtVTNguoc);
		
		JLabel lblNhinLiuTiu = new JLabel("Nhi\u00EAn li\u1EC7u ti\u00EAu hao (lit)");
		lblNhinLiuTiu.setBounds(266, 307, 156, 14);
		contentPane.add(lblNhinLiuTiu);
		
		txtNhienLieuTH = new JTextField();
		txtNhienLieuTH.setColumns(10);
		txtNhienLieuTH.setBounds(432, 304, 116, 20);
		contentPane.add(txtNhienLieuTH);
		
		JButton btnNewButton = new JButton("T\u00EDnh v\u1EADn t\u1ED1c - ti\u00EAu th\u1EE5 nhi\u00EAn li\u1EC7u");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double quangDuong = (Double.parseDouble(txtQuangDuong.getText().trim()));
				double thoiGian = (Double.parseDouble(txtThoiGian.getText().trim()));
				double soLit = (Double.parseDouble(txtSoLit.getText().trim()));
				
				if(rdbtnXeHoi.isSelected())
				{
					
					XeHoi xehoi = new XeHoi();
					
					
					txtVanToc.setText(String.valueOf(xehoi.tinhVanToc(quangDuong, thoiGian)));
					txtTieuThuNL.setText(String.valueOf(xehoi.tinhTieuThuNhienLieu(quangDuong, soLit)));
				}
				if(rdbtnTauThuy.isSelected())
				{
					double trongLuong = (Double.parseDouble(txtTrongLuong.getText().trim()));
					
					double sucTai = (Double.parseDouble(txtSucTai.getText().trim()));
					double vtXuoi = (Double.parseDouble(txtVTXuoi.getText().trim()));
					double vtNguoc = (Double.parseDouble(txtVTNguoc.getText().trim()));
					double nlTieuHao = (Double.parseDouble(txtNhienLieuTH.getText().trim()));
					
					TauThuy tauthuy = new TauThuy();
					tauthuy.setNhienLieuTieuHao(nlTieuHao);
					tauthuy.setVanTocXuoi(vtXuoi);
					tauthuy.setVanTocNguoc(vtNguoc);
					txtVanToc.setText(String.valueOf(tauthuy.tinhVanToc(quangDuong, thoiGian)));
					txtTieuThuNL.setText(String.valueOf(tauthuy.tinhTieuThuNhienLieu(quangDuong, soLit)));
				}
				
			}
		});
		btnNewButton.setBounds(120, 351, 326, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblVnTckmh = new JLabel("V\u1EADn t\u1ED1c (km/h)");
		lblVnTckmh.setBounds(10, 406, 88, 14);
		contentPane.add(lblVnTckmh);
		
		txtVanToc = new JTextField();
		txtVanToc.setColumns(10);
		txtVanToc.setBounds(108, 403, 116, 20);
		contentPane.add(txtVanToc);
		
		JLabel lblTiuThNhin = new JLabel("Ti\u00EAu th\u1EE5 nhi\u00EAn li\u1EC7u (km/lit)");
		lblTiuThNhin.setBounds(266, 403, 156, 14);
		contentPane.add(lblTiuThNhin);
		
		txtTieuThuNL = new JTextField();
		txtTieuThuNL.setColumns(10);
		txtTieuThuNL.setBounds(432, 400, 116, 20);
		contentPane.add(txtTieuThuNL);
	}
}
