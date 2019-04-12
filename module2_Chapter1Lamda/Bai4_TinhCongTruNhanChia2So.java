package module2_Chapter1Lamda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Bai4_TinhCongTruNhanChia2So extends JFrame {

	private JPanel contentPane;
	private JTextField txtSo1;
	private JTextField txtSo2;
	private JTextField txtKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai4_TinhCongTruNhanChia2So frame = new Bai4_TinhCongTruNhanChia2So();
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
	public Bai4_TinhCongTruNhanChia2So() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSoos = new JLabel("S\u1ED1 th\u1EE9 nh\u1EA5t");
		lblSoos.setBounds(10, 11, 86, 14);
		contentPane.add(lblSoos);
		
		JLabel lblSThHai = new JLabel("S\u1ED1 th\u1EE9 hai");
		lblSThHai.setBounds(10, 60, 86, 14);
		contentPane.add(lblSThHai);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setBounds(10, 116, 86, 14);
		contentPane.add(lblKtQu);
		
		txtSo1 = new JTextField();
		txtSo1.setBounds(121, 8, 160, 20);
		contentPane.add(txtSo1);
		txtSo1.setColumns(10);
		
		txtSo2 = new JTextField();
		txtSo2.setColumns(10);
		txtSo2.setBounds(121, 57, 160, 20);
		contentPane.add(txtSo2);
		
		txtKQ = new JTextField();
		txtKQ.setColumns(10);
		txtKQ.setBounds(121, 113, 160, 20);
		contentPane.add(txtKQ);
		
		JButton btnCong = new JButton("C\u1ED9ng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a = Integer.parseInt(txtSo1.getText().trim());
				float b = Integer.parseInt(txtSo2.getText().trim());
				
				Operator  cong = (x1, x2) ->x1+x2;
				txtKQ.setText(""+cong.Operate(a, b));
				
			} 
		});
		btnCong.setBounds(312, 7, 89, 23);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Tr\u1EEB");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a = Integer.parseInt(txtSo1.getText().trim());
				float b = Integer.parseInt(txtSo2.getText().trim());
				
				Operator tru = (x1, x2) ->x1-x2;
				txtKQ.setText( ""+tru.Operate(a, b));
			}
		});
		btnTru.setBounds(312, 41, 89, 23);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nh\u00E2n");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a = Integer.parseInt(txtSo1.getText().trim());
				float b = Integer.parseInt(txtSo2.getText().trim());
				
				Operator nhan = (x1, x2) ->x1*x2;
				txtKQ.setText(""+ nhan.Operate(a, b));
			}
		});
		btnNhan.setBounds(312, 75, 89, 23);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a = Integer.parseInt(txtSo1.getText().trim());
				float b = Integer.parseInt(txtSo2.getText().trim());
				
				
				Operator chia = (x1, x2) ->x1/x2;
				float kq = chia.Operate(a, b);
				DecimalFormat df = new DecimalFormat("###.##");
				kq = Float.parseFloat(df.format(kq));
				txtKQ.setText(String.valueOf(kq));
			}
		});
		btnChia.setBounds(312, 112, 89, 23);
		contentPane.add(btnChia);
	}
}
