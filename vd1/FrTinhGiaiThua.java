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

public class FrTinhGiaiThua extends JFrame {

	private JPanel contentPane;
	private JTextField txtX;
	private JTextField txtKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrTinhGiaiThua frame = new FrTinhGiaiThua();
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
	public FrTinhGiaiThua() {
		setTitle("T\u00EDnh giai th\u1EEBa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EDnh giai th\u1EEBa c\u1EE7a x");
		lblNewLabel.setBounds(91, 27, 216, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nh\u1EADp x:");
		lblNewLabel_1.setBounds(57, 93, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtX = new JTextField();
		txtX.setBounds(166, 90, 169, 20);
		contentPane.add(txtX);
		txtX.setColumns(10);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3:");
		lblKtQu.setBounds(57, 143, 58, 14);
		contentPane.add(lblKtQu);
		
		txtKQ = new JTextField();
		txtKQ.setColumns(10);
		txtKQ.setBounds(166, 140, 169, 20);
		contentPane.add(txtKQ);
		
		JButton btnTinh = new JButton("T\u00EDnh");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(txtX.getText().trim());
				int kq=1;
				for(int i=1;i<=x;i++)
				{
					kq=kq*i;
				}
				txtKQ.setText(String.valueOf(kq));
				
			}
		});
		btnTinh.setBounds(55, 208, 89, 23);
		contentPane.add(btnTinh);
		
		JButton btnNhapLai = new JButton("Nh\u1EADp l\u1EA1i");
		btnNhapLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtX.setText("");
				txtKQ.setText("");
			}
		});
		btnNhapLai.setBounds(203, 208, 89, 23);
		contentPane.add(btnNhapLai);
	}

}
