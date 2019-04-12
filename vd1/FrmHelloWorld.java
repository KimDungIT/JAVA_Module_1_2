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

public class FrmHelloWorld extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoTen;
	private JLabel lblTen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmHelloWorld frame = new FrmHelloWorld();
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
	public FrmHelloWorld() {
		setTitle("Xin chao");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHoTen = new JLabel("Nh\u1EADp h\u1ECD t\u00EAn");
		lblHoTen.setBounds(52, 50, 100, 14);
		contentPane.add(lblHoTen);
		
		txtHoTen = new JTextField();
		txtHoTen.setBounds(183, 47, 180, 20);
		contentPane.add(txtHoTen);
		txtHoTen.setColumns(10);
		
		JButton btnHienThi = new JButton("Xu\u1EA5t l\u1EDDi ch\u00E0o");
		btnHienThi.addActionListener(new ActionListener() {
			private JLabel lblHienThi;

			public void actionPerformed(ActionEvent arg0) {
				//xu ly
				String hoTen = txtHoTen.getText();
				lblTen.setText("Chào bạn" + hoTen);
			}
		});
		btnHienThi.setBounds(168, 119, 113, 23);
		contentPane.add(btnHienThi);
		
		lblTen = new JLabel("");
		lblTen.setBounds(111, 86, 234, 20);
		contentPane.add(lblTen);
	}
}
