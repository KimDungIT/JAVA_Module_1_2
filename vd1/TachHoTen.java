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
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

public class TachHoTen extends JFrame {

	private JPanel contentPane;
	private JTextField txtHo;
	private JTextField txtHoten;
	private JTextField txtTenDem;
	private JTextField txtTen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TachHoTen frame = new TachHoTen();
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
	public TachHoTen() {
		setTitle("T\u00E1ch h\u1ECD t\u00EAn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD v\u00E0 t\u00EAn");
		lblNewLabel.setBounds(20, 29, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("H\u1ECD");
		lblNewLabel_1.setBounds(20, 71, 54, 14);
		contentPane.add(lblNewLabel_1);
		
		txtHo = new JTextField();
		txtHo.setBounds(99, 68, 224, 20);
		contentPane.add(txtHo);
		txtHo.setColumns(10);
		
		txtHoten = new JTextField();
		txtHoten.setText("Nguy\u1EC5n Th\u1ECB Kim Dung");
		txtHoten.setColumns(10);
		txtHoten.setBounds(99, 26, 224, 20);
		contentPane.add(txtHoten);
		
		JLabel lblTnm = new JLabel("T\u00EAn \u0111\u1EC7m");
		lblTnm.setBounds(20, 115, 54, 14);
		contentPane.add(lblTnm);
		
		txtTenDem = new JTextField();
		txtTenDem.setColumns(10);
		txtTenDem.setBounds(99, 112, 224, 20);
		contentPane.add(txtTenDem);
		
		JLabel lblTn = new JLabel("T\u00EAn");
		lblTn.setBounds(20, 169, 54, 14);
		contentPane.add(lblTn);
		
		txtTen = new JTextField();
		txtTen.setColumns(10);
		txtTen.setBounds(99, 166, 224, 20);
		contentPane.add(txtTen);
		
		JButton btnTachHoTen = new JButton("T\u00E1ch h\u1ECD t\u00EAn");
		btnTachHoTen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String hoten = txtHoten.getText();
				StringTokenizer str2 = new StringTokenizer(hoten, " ");
				int countoken = str2.countTokens();
				String ho=null;
				String ten=null;
				String tendem="";
				for(int i=0;i<countoken;i++)
				{
					if(i==0)
					{
						ho=str2.nextToken();
					}
					else if(i == countoken-1)
					{
						ten=str2.nextToken();
					}
					else{
						tendem+=str2.nextToken() +" ";
					}
				}
				txtHo.setText(ho);
				txtTenDem.setText(tendem);
				txtTen.setText(ten);
				
				
				
			}
		});
		btnTachHoTen.setBounds(161, 227, 89, 23);
		contentPane.add(btnTachHoTen);
	}
}
