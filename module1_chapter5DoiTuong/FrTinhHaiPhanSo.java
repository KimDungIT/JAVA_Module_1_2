package module1_chapter5DoiTuong;
import module1_chapter5DoiTuong.PhanSo;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrTinhHaiPhanSo extends JFrame {

	private JPanel contentPane;
	private JTextField txtTuSo1;
	private JTextField txtMauSo1;
	private JTextField txtTuSo2;
	private JTextField txtMauSo2;
	private JTextField txtKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrTinhHaiPhanSo frame = new FrTinhHaiPhanSo();
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
	public FrTinhHaiPhanSo() {
		setTitle("T\u00EDnh to\u00E1n 2 ph\u00E2n s\u1ED1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ph\u00E2n s\u1ED1 1");
		lblNewLabel.setBounds(10, 11, 71, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblTS = new JLabel("T\u1EED s\u1ED1");
		lblTS.setBounds(10, 48, 71, 14);
		contentPane.add(lblTS);
		
		JLabel lblMuS = new JLabel("M\u1EABu s\u1ED1");
		lblMuS.setBounds(10, 85, 71, 14);
		contentPane.add(lblMuS);
		
		txtTuSo1 = new JTextField();
		txtTuSo1.setBounds(91, 45, 86, 20);
		contentPane.add(txtTuSo1);
		txtTuSo1.setColumns(10);
		
		txtMauSo1 = new JTextField();
		txtMauSo1.setColumns(10);
		txtMauSo1.setBounds(91, 82, 86, 20);
		contentPane.add(txtMauSo1);
		
		JLabel lblPhnS = new JLabel("Ph\u00E2n s\u1ED1 2");
		lblPhnS.setBounds(345, 11, 71, 14);
		contentPane.add(lblPhnS);
		
		JLabel label = new JLabel("T\u1EED s\u1ED1");
		label.setBounds(309, 45, 71, 14);
		contentPane.add(label);
		
		txtTuSo2 = new JTextField();
		txtTuSo2.setColumns(10);
		txtTuSo2.setBounds(390, 42, 86, 20);
		contentPane.add(txtTuSo2);
		
		JLabel label_1 = new JLabel("M\u1EABu s\u1ED1");
		label_1.setBounds(309, 82, 71, 14);
		contentPane.add(label_1);
		
		txtMauSo2 = new JTextField();
		txtMauSo2.setColumns(10);
		txtMauSo2.setBounds(390, 79, 86, 20);
		contentPane.add(txtMauSo2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		String pt[]={"+", "-", "*", "/"};
		comboBox.setModel(new DefaultComboBoxModel(pt));
		comboBox.setBounds(228, 59, 55, 20);
		contentPane.add(comboBox);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setBounds(10, 166, 71, 14);
		contentPane.add(lblKtQu);
		
		txtKQ = new JTextField();
		txtKQ.setColumns(10);
		txtKQ.setBounds(91, 163, 325, 20);
		contentPane.add(txtKQ);
		
		JButton btnTinh = new JButton("T\u00EDnh");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tuSo1 = Integer.parseInt(txtTuSo1.getText().trim());
				int mauSo1 = Integer.parseInt(txtMauSo1.getText().trim());
				int tuSo2 = Integer.parseInt(txtTuSo2.getText().trim());
				int mauSo2 = Integer.parseInt(txtMauSo2.getText().trim());
				
				PhanSo ps1 = new PhanSo(tuSo1, mauSo1);
				PhanSo ps2 = new PhanSo(tuSo2, mauSo2);
				String phepTinh = String.valueOf(comboBox.getSelectedItem());
				PhanSo ps = new PhanSo();
				ps = ps.tinh(phepTinh, ps1, ps2);
				txtKQ.setText(ps.getTuSo() +"/"+ps.getMauSo());
				
				
			}
		});
		btnTinh.setBounds(91, 243, 89, 23);
		contentPane.add(btnTinh);
		
		JButton btnLamLai = new JButton("L\u00E0m l\u1EA1i");
		btnLamLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTuSo1.setText("");
				txtMauSo1.setText("");
				txtTuSo2.setText("");
				txtMauSo2.setText("");
				txtKQ.setText("");
			}
		});
		btnLamLai.setBounds(291, 243, 89, 23);
		contentPane.add(btnLamLai);
	}

}
