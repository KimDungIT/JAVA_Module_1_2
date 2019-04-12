package module1_chapter5DoiTuong;

import module1_chapter5DoiTuong.CD;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrQuanLyCD extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaCD;
	private JTextField txtTenCD;
	private JTextField txtCaSi;
	private JTextField txtSoBaiHat;
	private JTextField txtGiaThanh;
	public double tong =0;
	String chuoiCD="";
	public String[]listCD = new String[100];
	public int indexRow=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrQuanLyCD frame = new FrQuanLyCD();
					frame.setVisible(true);
					CD cd = new CD();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrQuanLyCD() {
		setTitle("Qu\u1EA3n l\u00FD CD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMCd = new JLabel("M\u00E3 CD");
		lblMCd.setBounds(10, 11, 46, 14);
		contentPane.add(lblMCd);
		
		txtMaCD = new JTextField();
		txtMaCD.setBounds(108, 8, 86, 20);
		contentPane.add(txtMaCD);
		txtMaCD.setColumns(10);
		
		JLabel lblTnCd = new JLabel("T\u00EAn CD");
		lblTnCd.setBounds(300, 14, 62, 14);
		contentPane.add(lblTnCd);
		
		txtTenCD = new JTextField();
		txtTenCD.setColumns(10);
		txtTenCD.setBounds(398, 11, 226, 20);
		contentPane.add(txtTenCD);
		
		JLabel lblCaS = new JLabel("Ca s\u0129");
		lblCaS.setBounds(10, 67, 46, 14);
		contentPane.add(lblCaS);
		
		txtCaSi = new JTextField();
		txtCaSi.setColumns(10);
		txtCaSi.setBounds(61, 64, 160, 20);
		contentPane.add(txtCaSi);
		
		JLabel lblSBiHt = new JLabel("S\u1ED1 b\u00E0i h\u00E1t");
		lblSBiHt.setBounds(256, 67, 76, 14);
		contentPane.add(lblSBiHt);
		
		txtSoBaiHat = new JTextField();
		txtSoBaiHat.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char a = arg0.getKeyChar();
				if(!Character.isDigit(a))
				{
					arg0.consume();
				}
			}
		});
		txtSoBaiHat.setColumns(10);
		txtSoBaiHat.setBounds(326, 64, 46, 20);
		contentPane.add(txtSoBaiHat);
		
		JLabel lblGiThnh = new JLabel("Gi\u00E1 th\u00E0nh");
		lblGiThnh.setBounds(413, 70, 76, 14);
		contentPane.add(lblGiThnh);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 159, 614, 241);
		contentPane.add(scrollPane);
		
		JTextArea txtaMangCD = new JTextArea();
		scrollPane.setViewportView(txtaMangCD);
		txtGiaThanh = new JTextField();
		txtGiaThanh.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char a = e.getKeyChar();
				if(!Character.isDigit(a))
				{
					e.consume();
				}
			}
		});
		txtGiaThanh.setColumns(10);
		txtGiaThanh.setBounds(494, 67, 130, 20);
		contentPane.add(txtGiaThanh);
		
		JButton btnThemMoi = new JButton("Th\u00EAm m\u1EDBi");
		btnThemMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//lay thong tin CD tu nguoi dung nhap
				String maCD = txtMaCD.getText();
				String tenCD = txtTenCD.getText();
				String tenCaSi = txtCaSi.getText();
				int soBaiHat = Integer.parseInt(txtSoBaiHat.getText().trim());
				double giaThanh = Double.parseDouble(txtGiaThanh.getText().trim());
				
				CD cd = new CD(maCD,tenCD, tenCaSi,soBaiHat,giaThanh);
				
				chuoiCD+=cd.getMaCD() +" "+cd.getMaCD()+" "+ cd.getTenCaSi()+" "+ cd.getSoBaiHat()+" "+ cd.getGiaThanh()+"\n";
				tong+=cd.getGiaThanh();
				txtaMangCD.setText(chuoiCD + "\n Tổng giá thành = "+tong);
				
				//
				/*String output="";
				listCD[indexRow++] = String.valueOf(cd);
				for(int i=0;i<indexRow;i++)
				{
					output=listCD[i];
					
				}*/
				

			}
			
		});
		btnThemMoi.setBounds(209, 109, 89, 23);
		contentPane.add(btnThemMoi);
		
		JButton btnTiepTuc = new JButton("Ti\u1EBFp t\u1EE5c");
		btnTiepTuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMaCD.setText("");
				txtTenCD.setText("");
				txtCaSi.setText("");
				txtSoBaiHat.setText("");
				txtGiaThanh.setText("");
				txtaMangCD.setText("");
			}
		});
		btnTiepTuc.setBounds(351, 109, 89, 23);
		contentPane.add(btnTiepTuc);
		
		
	}
}
