package module1_chapter4mang;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class FrTinhTongVaTimKiemMang extends JFrame {

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
					FrTinhTongVaTimKiemMang frame = new FrTinhTongVaTimKiemMang();
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
	public FrTinhTongVaTimKiemMang() {
		setTitle("T\u00EDnh t\u1ED5ng v\u00E0 t\u00ECm ki\u1EBFm trong m\u1EA3ng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp n");
		lblNewLabel.setBounds(22, 23, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtN = new JTextField();
		txtN.setBounds(212, 20, 227, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		JLabel lblNhpX = new JLabel("Nh\u1EADp x");
		lblNhpX.setBounds(22, 54, 46, 14);
		contentPane.add(lblNhpX);
		
		txtX = new JTextField();
		txtX.setColumns(10);
		txtX.setBounds(212, 51, 227, 20);
		contentPane.add(txtX);
		
		JTextArea taMang = new JTextArea();
		taMang.setLineWrap(true);
		taMang.setBounds(212, 82, 359, 75);
		contentPane.add(taMang);
		
		JTextArea taKQ = new JTextArea();
		taKQ.setLineWrap(true);
		taKQ.setBounds(212, 168, 359, 154);
		contentPane.add(taKQ);
		
		JLabel lblMangr = new JLabel("M\u1EA3ng \u0111\u01B0\u1EE3c ph\u00E1t sinh");
		lblMangr.setBounds(22, 114, 130, 14);
		contentPane.add(lblMangr);
		
		JLabel lblTng = new JLabel("K\u1EBFt qu\u1EA3:");
		lblTng.setBounds(33, 245, 105, 14);
		contentPane.add(lblTng);
		
		JButton btnTimKiem = new JButton("T\u00ECm ki\u1EBFm");
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int n = Integer.parseInt(txtN.getText().trim());
				int x = Integer.parseInt(txtX.getText().trim());
				
				Random rd = new Random();
				StringBuilder sb = new StringBuilder("");
				StringBuilder sb2 = new StringBuilder("");
				int[]mang = new int[n];
				int tong = 0;
				boolean flag = false;
				int tam = -1;
				int tam2 = 1;
				
				//tao mang ngau nhien, xuat mang, tinh tong
				for(int i=0;i<n;i++)
				{
					int value= rd.nextInt(100);
					mang[i] = value;
					sb.append(value + " ");
					tong+=value;
					//kt xem x tim thay tai vi tri nao?
					if(!flag && x==value)
					{
						
						tam = i;
						sb2.append("Tìm thấy tại vị trí "+tam);
						sb2.append("\n");
					}
					if(x < mang[i])
					{
						tam2=-1;
						
					}
				}
				//kt x khong xuat hien trong mang
				if(flag==false)
				{
					sb2.append("X không xuất hiện trong mảng ");
					sb2.append("\n");
				}
				//kt x co lon hon tat ca so ko?
				if(tam2==-1)
				{
					sb2.append("X không lớn hơn các số trong mảng");
					sb2.append("\n");
				}
				else
				{
					sb2.append("X lớn hơn các số trong mảng");
					sb2.append("\n");
				}
				
				sb2.append("Tổng là:" +tong);
				sb2.append("\n");
				sb2.append("X nhỏ hơn: ");
				//x nho hon nhung so nao
				for(int j=0;j<n;j++)
				{
					if(x < mang[j])
					{
						sb2.append(mang[j]+ " ");
						
					}
				}
				taMang.setText(sb.toString());
				taKQ.setText(sb2.toString());
				
			}
		});
		btnTimKiem.setBounds(264, 333, 89, 23);
		contentPane.add(btnTimKiem);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(486, 114, -276, 64);
		contentPane.add(scrollPane);
		
		
	}
}
