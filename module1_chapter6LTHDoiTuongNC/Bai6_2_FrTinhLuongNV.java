package module1_chapter6LTHDoiTuongNC;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Bai6_2_FrTinhLuongNV extends JFrame {

	private JPanel contentPane;
	private JTextField txtPhuCap;
	private JTextField txtLuong;
	private JLabel lblHSL;
	private JLabel lblThongSo;
	private JLabel lblLoaiNV;
	private JComboBox comboBox;
	private JTextField txtHeSo;
	private JButton btnTinhLuong;
	private JLabel lblLuong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai6_2_FrTinhLuongNV frame = new Bai6_2_FrTinhLuongNV();
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
	public Bai6_2_FrTinhLuongNV() {
		setTitle("T\u00EDnh l\u01B0\u01A1ng nh\u00E2n vi\u00EAn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLoaiNV = new JLabel("Lo\u1EA1i NV");
		lblLoaiNV.setBounds(10, 11, 70, 14);
		contentPane.add(lblLoaiNV);
		
		comboBox = new JComboBox();
		comboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		       switch(comboBox.getSelectedItem().toString())
		       {
		       case "Hành chính":
		    	   lblThongSo.setVisible(true);  
		    	   txtPhuCap.setVisible(true);
		    	   break;
		       case "Kỹ thuật":
		    	   lblThongSo.setVisible(true);  
		    	   txtPhuCap.setVisible(true);
		    	   lblThongSo.setText("Số dự án");
		    	   break;
		       case "Kinh doanh":
		    	   lblThongSo.setVisible(true);  
		    	   txtPhuCap.setVisible(true);
		    	   lblThongSo.setText("Số sản phẩm");
		    	   break;
		       case "Lãnh đạo":
		    	   lblThongSo.setVisible(false);
		    	   txtPhuCap.setVisible(false);
		    	  
		    	   break;
		       }
		    }
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"H\u00E0nh ch\u00EDnh", "K\u1EF9 thu\u1EADt", "Kinh doanh", "L\u00E3nh \u0111\u1EA1o"}));
		comboBox.setBounds(127, 8, 174, 20);
		contentPane.add(comboBox);
		
		lblHSL = new JLabel("H\u1EC7 s\u1ED1 l\u01B0\u01A1ng");
		lblHSL.setBounds(10, 61, 70, 14);
		contentPane.add(lblHSL);
		
		txtHeSo = new JTextField();
		txtHeSo.setBounds(127, 58, 174, 20);
		contentPane.add(txtHeSo);
		txtHeSo.setColumns(10);
		
		lblThongSo = new JLabel("Ph\u1EE5 c\u1EA5p");
		lblThongSo.setBounds(10, 109, 70, 14);
		contentPane.add(lblThongSo);
		
		txtPhuCap = new JTextField();
		txtPhuCap.setColumns(10);
		txtPhuCap.setBounds(127, 106, 174, 20);
		contentPane.add(txtPhuCap);
		
		btnTinhLuong = new JButton("T\u00EDnh l\u01B0\u01A1ng");
		btnTinhLuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double heSo = (Double.parseDouble(txtHeSo.getText().trim()));
				double luong=0;
				switch(comboBox.getSelectedItem().toString())
				{
				case "Hành chính":
					
					int thongSo = (Integer.parseInt(txtPhuCap.getText().trim()));
					NhanVienHanhChinh nvhc = new NhanVienHanhChinh(thongSo,heSo);
					luong = nvhc.TinhLuong();
					txtLuong.setText(String.valueOf(luong));
					break;
				case "Kỹ thuật":
					thongSo = (Integer.parseInt(txtPhuCap.getText().trim()));
					NhanVienkyThuat nvkt = new NhanVienkyThuat(thongSo, heSo);
					luong = nvkt.TinhLuong();
					txtLuong.setText(String.valueOf(luong));
					break;
				case "Kinh doanh":
					thongSo = (Integer.parseInt(txtPhuCap.getText().trim()));
					NhanVienKinhDoanh nvkd = new NhanVienKinhDoanh(thongSo,heSo);
					luong = nvkd.TinhLuong();
					txtLuong.setText(String.valueOf(luong));
					break;
				case "Lãnh đạo":
					
					NhanVienLanhDao nvld = new NhanVienLanhDao(heSo);
					luong = nvld.TinhLuong()+(0.1*nvld.TinhLuong());
					txtLuong.setText(String.valueOf(luong));
					break;
				}
			}
		});
		btnTinhLuong.setBounds(127, 191, 174, 23);
		contentPane.add(btnTinhLuong);
		
		lblLuong = new JLabel("L\u01B0\u01A1ng");
		lblLuong.setBounds(10, 246, 70, 14);
		contentPane.add(lblLuong);
		
		txtLuong = new JTextField();
		txtLuong.setColumns(10);
		txtLuong.setBounds(127, 243, 174, 20);
		contentPane.add(txtLuong);
	}
}
