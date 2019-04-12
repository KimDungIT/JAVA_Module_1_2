package module1_chapter6LTHDoiTuongNC;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlSquare extends JPanel {
	private JTextField txtCanh;
	private JTextField txtCV;
	private JTextField txtDT;

	/**
	 * Create the panel.
	 */
	public PnlSquare() {
		setLayout(null);
		
		JLabel lblCnh = new JLabel("C\u1EA1nh");
		lblCnh.setBounds(22, 48, 68, 14);
		add(lblCnh);
		
		JLabel lblChuVi = new JLabel("Chu vi");
		lblChuVi.setBounds(22, 104, 68, 14);
		add(lblChuVi);
		
		JLabel lblDinTch = new JLabel("Di\u1EC7n t\u00EDch");
		lblDinTch.setBounds(22, 168, 68, 14);
		add(lblDinTch);
		
		txtCanh = new JTextField();
		txtCanh.setBounds(108, 45, 220, 20);
		add(txtCanh);
		txtCanh.setColumns(10);
		
		txtCV = new JTextField();
		txtCV.setColumns(10);
		txtCV.setBounds(108, 101, 220, 20);
		add(txtCV);
		
		txtDT = new JTextField();
		txtDT.setColumns(10);
		txtDT.setBounds(108, 151, 220, 20);
		add(txtDT);
		
		JButton btnCV = new JButton("Chu vi");
		btnCV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double canh = (Double.parseDouble(txtCanh.getText().trim()));
				Square s = new Square();
				s.setCanh(canh);
				txtCV.setText(String.format("%.2f", s.TinhCV()));
			}
		});
		btnCV.setBounds(338, 100, 89, 23);
		add(btnCV);
		
		JButton btnDT = new JButton("Di\u1EC7n t\u00EDch");
		btnDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double canh = (Double.parseDouble(txtCanh.getText().trim()));
				Square s = new Square();
				s.setCanh(canh);
				txtDT.setText(String.format("%.2f", s.TinhDT()));
				
			}
		});
		btnDT.setBounds(338, 150, 89, 23);
		add(btnDT);

	}
}
