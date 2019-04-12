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

public class FrTinhTongCacPhanTuTrongMang extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrTinhTongCacPhanTuTrongMang frame = new FrTinhTongCacPhanTuTrongMang();
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
	public FrTinhTongCacPhanTuTrongMang() {
		setTitle("T\u00EDnh t\u1ED5ng c\u00E1c ph\u1EA7n t\u1EED ng\u1EABu nhi\u00EAn trong m\u1EA3ng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp n:");
		lblNewLabel.setBounds(43, 25, 66, 14);
		contentPane.add(lblNewLabel);
		
		txtN = new JTextField();
		txtN.setBounds(174, 22, 203, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		JLabel lblMngcPht = new JLabel("M\u1EA3ng \u0111\u01B0\u1EE3c ph\u00E1t sinh");
		lblMngcPht.setBounds(22, 72, 111, 14);
		contentPane.add(lblMngcPht);
		
		JTextArea txtareaMang = new JTextArea();
		txtareaMang.setBounds(174, 67, 203, 88);
		contentPane.add(txtareaMang);
		
		JLabel lblTng = new JLabel("T\u1ED5ng");
		lblTng.setBounds(43, 181, 46, 14);
		contentPane.add(lblTng);
		
		txtKQ = new JTextField();
		txtKQ.setBounds(174, 178, 203, 20);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
		
		JButton btnNewButton = new JButton("T\u00EDnh t\u1ED5ng");
		btnNewButton.addActionListener(new ActionListener() {
			public int[]mang(int n)
			{
				
				int[] mang = new int[n];
				Random rd = new Random();
				for(int i=0;i<n;i++)
				{
					mang[i]=rd.nextInt(100);
				}
				return mang;
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
			public int TinhTong(int[] mang)
			{
				int tong = 0;
				for(int i:mang)
				{
					tong+=i;
				}
				return tong;
			}
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtN.getText().trim());
				int[]manga=mang(a);
				txtareaMang.setText(XuatMang(manga));
				txtKQ.setText(String.valueOf(TinhTong(manga)));
				
				////cach cua thay
				/*Random rd= new Random();
				StringBuilder sb = new StringBuilder("");
				int arr[]= new int[a];
				int tong = 0;
				int indexOfFind = -1;
				for(int i=0;i<a;i++)
				{
					int value = rd.nextInt(100);
					arr[i] = value;
					sb.append(value + " ");
					tong+=value;
					boolean flag = false;
					if(!flag&& x==value)
					{
						indexOfFind = i;
						flag=true;
					}
					
					
				}
				txtareaMang.setText(sb.toString());
				txtKQ.setText(String.valueOf(tong));*/
			}
			
			
			
		});
		btnNewButton.setBounds(159, 227, 89, 23);
		contentPane.add(btnNewButton);
	}
}
