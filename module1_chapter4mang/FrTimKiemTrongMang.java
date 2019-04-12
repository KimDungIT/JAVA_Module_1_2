package module1_chapter4mang;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class FrTimKiemTrongMang extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtX;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrTimKiemTrongMang frame = new FrTimKiemTrongMang();
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
	public FrTimKiemTrongMang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp n:");
		lblNewLabel.setBounds(30, 24, 61, 14);
		contentPane.add(lblNewLabel);
		
		txtN = new JTextField();
		txtN.setBounds(169, 21, 213, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		JLabel lblNhpX = new JLabel("Nh\u1EADp x:");
		lblNhpX.setBounds(30, 66, 61, 14);
		contentPane.add(lblNhpX);
		
		txtX = new JTextField();
		txtX.setColumns(10);
		txtX.setBounds(169, 63, 213, 20);
		contentPane.add(txtX);
		
		JLabel lblMngcPht = new JLabel("M\u1EA3ng \u0111\u01B0\u1EE3c ph\u00E1t sinh:");
		lblMngcPht.setBounds(10, 124, 124, 14);
		contentPane.add(lblMngcPht);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(334, 124, -152, 22);
		contentPane.add(textArea);
		
		JTextArea txtareaMang = new JTextArea();
		txtareaMang.setLineWrap(true);
		txtareaMang.setBounds(169, 108, 213, 66);
		contentPane.add(txtareaMang);
		
		JLabel lblKtQuTm = new JLabel("K\u1EBFt qu\u1EA3 t\u00ECm ki\u1EBFm");
		lblKtQuTm.setBounds(30, 209, 104, 14);
		contentPane.add(lblKtQuTm);
		
		JTextArea txtareaKQ = new JTextArea();
		txtareaKQ.setLineWrap(true);
		txtareaKQ.setBounds(169, 193, 213, 66);
		contentPane.add(txtareaKQ);
		
		JButton btnTimKiem = new JButton("T\u00ECm ki\u1EBFm");
		btnTimKiem.addActionListener(new ActionListener() {
			public int[]mang(int n)
			{
				int[]a=new int[n];
				Random rd = new Random();
				for(int i=0;i<n;i++)
				{
					a[i]+=rd.nextInt(100);
				}
				return a;
			}
			public String XuatMang(int[] mang)
			{
				String chuoi="";
				for(int i:mang)
				{
					chuoi +=i+" ";
				}
				return chuoi;
			}
			public int TimViTriXuatHienX(int x, int[] mang)
			{
				
				int tam=-1;
				for(int i=0;i<mang.length;i++)
				{
					if(x==mang[i])
					{
						tam=i;
						break;
					}
				}
				return tam;
			}
			public boolean KiemTraXCoLonHonTatCa(int x, int[] mang)
			{
				boolean fag=true;
				for(int i=0;i<mang.length;i++)
				{
					if(x<=mang[i])
					{
						fag=false;
						break;
					}
				}
				return fag;
			}
			public String CacSoLonHonX(int x, int[] mang)
			{
				String chuoi="";
				for(int i=0;i<mang.length;i++)
				{
					if(mang[i] > x)
					{
						chuoi+=mang[i] + " ";
					}
				}
				return chuoi;
			}
			
			public void actionPerformed(ActionEvent arg0) {
				int n =Integer.parseInt(txtN.getText().trim());
				int x = Integer.parseInt(txtX.getText().trim());
				int[]mangA = mang(n);
				txtareaMang.setText(XuatMang(mangA));
				int tam = TimViTriXuatHienX(x,mangA);
				String kq="";
				kq+=(tam==-1)?"Không tìm thấy" : "Tìm thấy tại vị trí: "+ tam;
				kq+="\n";
				kq+=(KiemTraXCoLonHonTatCa(x,mangA))?"X lớn hơn tất cả":"X không lớn hơn tất cả";
				kq+="\n";
				kq+="X nhỏ hơn:"+(CacSoLonHonX(x, mangA));
				txtareaKQ.setText(kq);
				
			}
		});
		btnTimKiem.setBounds(152, 285, 89, 23);
		contentPane.add(btnTimKiem);
	}
}
