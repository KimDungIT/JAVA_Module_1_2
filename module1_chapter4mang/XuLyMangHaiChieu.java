package module1_chapter4mang;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class XuLyMangHaiChieu extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XuLyMangHaiChieu frame = new XuLyMangHaiChieu();
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
	public XuLyMangHaiChieu() {
		setTitle("X\u1EED l\u00FD m\u1EA3ng hai chi\u1EC1u");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp n (d\u00F2ng)");
		lblNewLabel.setBounds(10, 11, 92, 14);
		contentPane.add(lblNewLabel);
		
		txtN = new JTextField();
		txtN.setBounds(155, 8, 327, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		JLabel lblNhpMdng = new JLabel("Nh\u1EADp m (c\u1ED9t)");
		lblNhpMdng.setBounds(10, 55, 92, 14);
		contentPane.add(lblNhpMdng);
		
		txtM = new JTextField();
		txtM.setColumns(10);
		txtM.setBounds(155, 52, 327, 20);
		contentPane.add(txtM);
		JTextArea taMang = new JTextArea();
		taMang.setBounds(157, 135, 325, 74);
		contentPane.add(taMang);
		
		JTextArea taKQ = new JTextArea();
		taKQ.setBounds(156, 224, 327, 123);
		contentPane.add(taKQ);
		
		JButton btnPSVaXL = new JButton("Ph\u00E1t sinh v\u00E0 x\u1EED l\u00FD");
		btnPSVaXL.addActionListener(new ActionListener() {
			public int[][]mang2chieu(int n, int m)
			{
				int[][]mang = new int[n][m];
				Random rd = new Random();
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<m;j++)
					{
						mang[i][j]= rd.nextInt(100);
						
					}
				}
				return mang;
			}
			public String XuatMang2Chieu(int[][]mang, int n, int m)
			{
				String chuoi="";
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<m;j++)
					{
						chuoi+=mang[i][j] + " ";
					}
					chuoi+="\n";
				}
				return chuoi;
			}
			
			public void actionPerformed(ActionEvent arg0) {
				int n = Integer.parseInt(txtN.getText().trim());
				int m = Integer.parseInt(txtM.getText().trim());
				int[][]mangA = new int[n][m];
				StringBuilder sb1 = new StringBuilder("");
				StringBuilder sb2 = new StringBuilder("");
				Random rd = new Random();
				
				int demChan = 0;
				int demLe=0;
				int tongChan=0;
				int tongLe=0;
				float tbChan=0;
				float tbLe=0;
				String tb1="";
				String tb2="";
				int max = mangA[0][0];
				int min = mangA[0][0];
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<m;j++)
					{
						int value = rd.nextInt(100);
						mangA[i][j]=value;
						sb1.append(value+ " ");
						if(mangA[i][j]%2==0)
						{
							demChan++;
							tongChan+=mangA[i][j];
						}
						else
						{
							
							demLe++;
							tongLe+=mangA[i][j];
						}
						if(mangA[i][j]>max)
						{
							max=mangA[i][j];
						}
						if(mangA[i][j] < min)
						{
							min = mangA[i][j];
						}
					}
					sb1.append("\n");
				}
				
				tbChan = (float)tongChan/demChan;
				
				tbLe = (float)tongLe/demLe;
				
				taMang.setText(sb1.toString());
				sb2.append("Số phần tử chẵn = " + demChan);
				sb2.append("\n");
				sb2.append(tb2);
				sb2.append("Số phần tử lẻ = " + demLe);
				sb2.append("\n");
				sb2.append("TB chẵn = " + tbChan);
				sb2.append("\n");
				sb2.append("TB lẻ = "+ tbLe);
				sb2.append("\n");
				sb2.append("GT Max = " + max);
				sb2.append("\n");
				sb2.append("GT Min = " + min);
				taKQ.setText(sb2.toString());
			}
		});
		btnPSVaXL.setBounds(155, 83, 165, 23);
		contentPane.add(btnPSVaXL);
		
		JLabel lblNewLabel_1 = new JLabel("M\u1EA3ng \u0111\u01B0\u1EE3c ph\u00E1t sinh");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(10, 140, 109, 14);
		contentPane.add(lblNewLabel_1);
		
		
		
		JLabel lblKtQuX = new JLabel("K\u1EBFt qu\u1EA3 x\u1EED l\u00FD");
		lblKtQuX.setHorizontalAlignment(SwingConstants.LEFT);
		lblKtQuX.setBounds(10, 235, 109, 14);
		contentPane.add(lblKtQuX);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(155, 313, 325, -64);
		contentPane.add(scrollPane);
		
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(137, 345, 314, -99);
		contentPane.add(scrollPane_1);
	}
}
