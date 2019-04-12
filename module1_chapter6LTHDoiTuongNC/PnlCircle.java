package module1_chapter6LTHDoiTuongNC;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlCircle extends JPanel {
	private JTextField txtR;
	private JTextField txtCV;
	private JTextField txtDT;

	/**
	 * Create the panel.
	 */
	public PnlCircle() {
		setLayout(null);
		
		JLabel label = new JLabel("B\u00E1n k\u00EDnh");
		label.setBounds(10, 56, 64, 14);
		add(label);
		
		JLabel label_1 = new JLabel("Chu vi");
		label_1.setBounds(10, 100, 64, 14);
		add(label_1);
		
		JLabel label_2 = new JLabel("Di\u1EC7n t\u00EDch");
		label_2.setBounds(10, 146, 64, 14);
		add(label_2);
		
		txtR = new JTextField();
		txtR.setColumns(10);
		txtR.setBounds(84, 53, 208, 20);
		add(txtR);
		
		txtCV = new JTextField();
		txtCV.setColumns(10);
		txtCV.setBounds(84, 97, 208, 20);
		add(txtCV);
		
		txtDT = new JTextField();
		txtDT.setColumns(10);
		txtDT.setBounds(84, 143, 208, 20);
		add(txtDT);
		
		JButton btnCV = new JButton("Chu vi");
		btnCV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double R = Double.parseDouble(txtR.getText().trim());
				Circle c = new Circle();
				double cv =1;
				c.setR(R);
				cv = c.TinhCV();
				txtCV.setText((String.format("%.2f",cv)));
				
			}
		});
		btnCV.setBounds(331, 96, 89, 23);
		add(btnCV);
		
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
		btnDT.setBounds(331, 142, 89, 23);
		add(btnDT);

	}

}
