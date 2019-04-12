package module1_chapter6LTHDoiTuongNC;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlRectangle extends JPanel {
	private JTextField txtDai;
	private JTextField txtRong;
	private JTextField txtCV;
	private JTextField txtDT;

	/**
	 * Create the panel.
	 */
	public PnlRectangle() {
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chi\u1EC1u d\u00E0i");
		lblNewLabel.setBounds(25, 30, 77, 14);
		add(lblNewLabel);
		
		JLabel lblChiuRng = new JLabel("Chi\u1EC1u r\u1ED9ng");
		lblChiuRng.setBounds(25, 68, 77, 14);
		add(lblChiuRng);
		
		JLabel lblChuVi = new JLabel("Chu vi");
		lblChuVi.setBounds(25, 110, 77, 14);
		add(lblChuVi);
		
		JLabel lblDinTch = new JLabel("Di\u1EC7n t\u00EDch");
		lblDinTch.setBounds(25, 157, 77, 14);
		add(lblDinTch);
		
		txtDai = new JTextField();
		txtDai.setBounds(136, 30, 175, 20);
		add(txtDai);
		txtDai.setColumns(10);
		
		txtRong = new JTextField();
		txtRong.setColumns(10);
		txtRong.setBounds(136, 65, 175, 20);
		add(txtRong);
		
		txtCV = new JTextField();
		txtCV.setColumns(10);
		txtCV.setBounds(136, 107, 175, 20);
		add(txtCV);
		
		txtDT = new JTextField();
		txtDT.setColumns(10);
		txtDT.setBounds(136, 154, 175, 20);
		add(txtDT);
		
		JButton btnCV = new JButton("Chu vi");
		btnCV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dai = Double.parseDouble(txtDai.getText().trim());
				double rong = Double.parseDouble(txtRong.getText().trim());
				
				Rectangle r =new Rectangle();
				r.setChieuDai(dai);
				r.setChieuRong(rong);
				
				txtCV.setText(String.format("%.2f", r.TinhCV()));
			}
		});
		btnCV.setBounds(339, 106, 89, 23);
		add(btnCV);
		
		JButton btnDT = new JButton("Di\u1EC7n t\u00EDch");
		btnDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dai = Double.parseDouble(txtDai.getText().trim());
				double rong = Double.parseDouble(txtRong.getText().trim());
				
				Rectangle r =new Rectangle();
				r.setChieuDai(dai);
				r.setChieuRong(rong);
				
				txtDT.setText(String.format("%.2f", r.TinhDT()));
			}
		});
		btnDT.setBounds(339, 148, 89, 23);
		add(btnDT);

	}
}
