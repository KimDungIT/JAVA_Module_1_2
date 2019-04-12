package module1_chapter6LTHDoiTuongNC;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JTabbedPane;
import java.awt.Font;

public class Bai6_3_FrTinhCVVaDTCacHinh extends JFrame {

	private JPanel contentPane;
	private Panel pnlHinhVuong;
	private Panel pnlHinhCN;
	private Panel pnlHinhTron;
	private JTextField txtR;
	private JTextField txtCV;
	private JTextField txtDT;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JTextField txtDTHCN;
	private JTextField txtCVHCN;
	private JTextField txtRong;
	private JTextField txtDai;
	private JButton btnCVHCN;
	private JButton btnDTHCN;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JTextField txtDTHV;
	private JTextField txtCVHV;
	private JTextField txtCanh;
	private JButton btnCVHV;
	private JButton btnDTHV;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai6_3_FrTinhCVVaDTCacHinh frame = new Bai6_3_FrTinhCVVaDTCacHinh();
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
	public Bai6_3_FrTinhCVVaDTCacHinh() {
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 498, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 462, 353);
		contentPane.add(tabbedPane);
		
		pnlHinhTron = new Panel();
		pnlHinhTron.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 12));
		tabbedPane.addTab("Hình tròn", null, pnlHinhTron, null);
		pnlHinhTron.setLayout(null);
		
		JLabel label = new JLabel("B\u00E1n k\u00EDnh");
		label.setBounds(28, 34, 68, 14);
		pnlHinhTron.add(label);
		
		JLabel label_1 = new JLabel("Chu vi");
		label_1.setBounds(28, 80, 68, 14);
		pnlHinhTron.add(label_1);
		
		JLabel label_2 = new JLabel("Di\u1EC7n t\u00EDch");
		label_2.setBounds(28, 132, 68, 14);
		pnlHinhTron.add(label_2);
		
		txtR = new JTextField();
		txtR.setBounds(130, 34, 141, 20);
		txtR.setColumns(10);
		pnlHinhTron.add(txtR);
		
		txtCV = new JTextField();
		txtCV.setBounds(130, 80, 141, 20);
		txtCV.setColumns(10);
		pnlHinhTron.add(txtCV);
		
		txtDT = new JTextField();
		txtDT.setBounds(130, 132, 141, 20);
		txtDT.setColumns(10);
		pnlHinhTron.add(txtDT);
		
		JButton btnCV = new JButton("Chu vi");
		btnCV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double R = Double.parseDouble(txtR.getText().trim());
				Circle c = new Circle();
				double cv =1;
				c.setR(R);
				cv = c.TinhCV();
				txtCV.setText((String.format("%.2f",cv)));
			}
		});
		btnCV.setBounds(300, 77, 104, 23);
		pnlHinhTron.add(btnCV);
		
		JButton btnDT = new JButton("Di\u1EC7n t\u00EDch");
		btnDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double R = Double.parseDouble(txtR.getText().trim());
				Circle c = new Circle();
				double dt =1;
				c.setR(R);
				dt = c.TinhDT();
				txtDT.setText((String.format("%.2f",dt)));
			}
		});
		btnDT.setBounds(300, 129, 104, 23);
		pnlHinhTron.add(btnDT);
		
		pnlHinhCN = new Panel();
		tabbedPane.addTab("Hình chữ nhật", null, pnlHinhCN, null);
		pnlHinhCN.setLayout(null);
		
		label_3 = new JLabel("Chi\u1EC1u d\u00E0i");
		label_3.setBounds(24, 49, 77, 14);
		pnlHinhCN.add(label_3);
		
		label_4 = new JLabel("Chi\u1EC1u r\u1ED9ng");
		label_4.setBounds(24, 87, 77, 14);
		pnlHinhCN.add(label_4);
		
		label_5 = new JLabel("Chu vi");
		label_5.setBounds(24, 129, 77, 14);
		pnlHinhCN.add(label_5);
		
		label_6 = new JLabel("Di\u1EC7n t\u00EDch");
		label_6.setBounds(24, 176, 77, 14);
		pnlHinhCN.add(label_6);
		
		txtDTHCN = new JTextField();
		txtDTHCN.setColumns(10);
		txtDTHCN.setBounds(135, 173, 175, 20);
		pnlHinhCN.add(txtDTHCN);
		
		txtCVHCN = new JTextField();
		txtCVHCN.setColumns(10);
		txtCVHCN.setBounds(135, 126, 175, 20);
		pnlHinhCN.add(txtCVHCN);
		
		txtRong = new JTextField();
		txtRong.setColumns(10);
		txtRong.setBounds(135, 84, 175, 20);
		pnlHinhCN.add(txtRong);
		
		txtDai = new JTextField();
		txtDai.setColumns(10);
		txtDai.setBounds(135, 49, 175, 20);
		pnlHinhCN.add(txtDai);
		
		btnCVHCN = new JButton("Chu vi");
		btnCVHCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dai = Double.parseDouble(txtDai.getText().trim());
				double rong = Double.parseDouble(txtRong.getText().trim());
				
				Rectangle r =new Rectangle();
				r.setChieuDai(dai);
				r.setChieuRong(rong);
				
				txtCVHCN.setText(String.format("%.2f", r.TinhCV()));
			}
		});
		btnCVHCN.setBounds(338, 125, 89, 23);
		pnlHinhCN.add(btnCVHCN);
		
		btnDTHCN = new JButton("Di\u1EC7n t\u00EDch");
		btnDTHCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double dai = Double.parseDouble(txtDai.getText().trim());
				double rong = Double.parseDouble(txtRong.getText().trim());
				
				Rectangle r =new Rectangle();
				r.setChieuDai(dai);
				r.setChieuRong(rong);
				
				txtDTHCN.setText(String.format("%.2f", r.TinhDT()));
			}
		});
		btnDTHCN.setBounds(338, 167, 89, 23);
		pnlHinhCN.add(btnDTHCN);
		
		pnlHinhVuong = new Panel();
		tabbedPane.addTab("Hình vuông", null, pnlHinhVuong, null);
		pnlHinhVuong.setLayout(null);
		
		label_7 = new JLabel("C\u1EA1nh");
		label_7.setBounds(10, 52, 68, 14);
		pnlHinhVuong.add(label_7);
		
		label_8 = new JLabel("Chu vi");
		label_8.setBounds(10, 108, 68, 14);
		pnlHinhVuong.add(label_8);
		
		label_9 = new JLabel("Di\u1EC7n t\u00EDch");
		label_9.setBounds(10, 172, 68, 14);
		pnlHinhVuong.add(label_9);
		
		txtDTHV = new JTextField();
		txtDTHV.setColumns(10);
		txtDTHV.setBounds(96, 155, 220, 20);
		pnlHinhVuong.add(txtDTHV);
		
		txtCVHV = new JTextField();
		txtCVHV.setColumns(10);
		txtCVHV.setBounds(96, 105, 220, 20);
		pnlHinhVuong.add(txtCVHV);
		
		txtCanh = new JTextField();
		txtCanh.setColumns(10);
		txtCanh.setBounds(96, 49, 220, 20);
		pnlHinhVuong.add(txtCanh);
		
		btnCVHV = new JButton("Chu vi");
		btnCVHV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double canh = (Double.parseDouble(txtCanh.getText().trim()));
				Square s = new Square();
				s.setCanh(canh);
				txtCVHV.setText(String.format("%.2f", s.TinhCV()));
			}
		});
		btnCVHV.setBounds(326, 104, 89, 23);
		pnlHinhVuong.add(btnCVHV);
		
		btnDTHV = new JButton("Di\u1EC7n t\u00EDch");
		btnDTHV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double canh = (Double.parseDouble(txtCanh.getText().trim()));
				Square s = new Square();
				s.setCanh(canh);
				txtDTHV.setText(String.format("%.2f", s.TinhDT()));
			}
		});
		btnDTHV.setBounds(326, 154, 89, 23);
		pnlHinhVuong.add(btnDTHV);
		PnlCircle pnlCircle = new PnlCircle();
		
		
		
		
	}
}
