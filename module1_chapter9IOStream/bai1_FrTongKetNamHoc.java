package module1_chapter9IOStream;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.jws.soap.SOAPMessageHandlers;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class bai1_FrTongKetNamHoc extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoTen;
	private JTextField txtTBKH1;
	private JTextField txtTBHK2;
	private JButton btnDocDanhSach;
	private JButton btnThongKe;
	private JTable table;
	private JComboBox cbbKhoi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai1_FrTongKetNamHoc frame = new bai1_FrTongKetNamHoc();
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
	public bai1_FrTongKetNamHoc() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 508, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHojVaf = new JLabel("H\u1ECD v\u00E0 t\u00EAn");
		lblHojVaf.setBounds(10, 22, 73, 14);
		contentPane.add(lblHojVaf);
		
		JLabel lblKhiLp = new JLabel("Kh\u1ED1i l\u1EDBp");
		lblKhiLp.setBounds(10, 62, 73, 14);
		contentPane.add(lblKhiLp);
		
		JLabel lblTbHk = new JLabel("TB HK1");
		lblTbHk.setBounds(10, 98, 73, 14);
		contentPane.add(lblTbHk);
		
		JLabel lblTbHk_1 = new JLabel("TB HK2");
		lblTbHk_1.setBounds(10, 136, 73, 14);
		contentPane.add(lblTbHk_1);
		
		txtHoTen = new JTextField();
		txtHoTen.setBounds(108, 19, 174, 20);
		contentPane.add(txtHoTen);
		txtHoTen.setColumns(10);
		
		txtTBKH1 = new JTextField();
		txtTBKH1.setColumns(10);
		txtTBKH1.setBounds(108, 95, 174, 20);
		contentPane.add(txtTBKH1);
		
		txtTBHK2 = new JTextField();
		txtTBHK2.setColumns(10);
		txtTBHK2.setBounds(108, 133, 174, 20);
		contentPane.add(txtTBHK2);
		
		cbbKhoi = new JComboBox();
		cbbKhoi.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		cbbKhoi.setBounds(108, 59, 174, 20);
		contentPane.add(cbbKhoi);
		
		JButton btnThemMoi = new JButton("Th\u00EAm m\u1EDBi");
		btnThemMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String hoten = txtHoTen.getText().trim();
				int khoi = (Integer.parseInt(cbbKhoi.getSelectedItem().toString()));
				double tbkh1 = Double.parseDouble(txtTBKH1.getText().trim());
				double tbkh2 = Double.parseDouble(txtTBHK2.getText().trim());
				
				//DataOutputStream: ghi dữ liệu kiểu cơ sở và string
				//BufferedOutputStream: đọc dữ liệu từ vùng đệm, ghi dữ liệu vào vùng đệm
				//FileOutputStream: ghi 
				try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/tongketnamhoc.txt", true))))
				{
					
					out.writeUTF(hoten);
					out.writeInt(khoi);
					out.writeDouble(tbkh1);
					out.writeDouble(tbkh2);
					JOptionPane.showMessageDialog(rootPane, "Kết quả của học sinh đã được ghi.");
					out.close();
				} catch (EOFException ev) {
				 } 
				catch (FileNotFoundException ex) {
					 Logger.getLogger(bai1_FrTongKetNamHoc.class.getName()).log(Level.SEVERE, null, ex);
					  } 
				catch (IOException ex) {
					 Logger.getLogger(bai1_FrTongKetNamHoc.class.getName()).log(Level.SEVERE, null, ex);
					  }
				
			}
		});
		btnThemMoi.setBounds(326, 18, 133, 23);
		contentPane.add(btnThemMoi);
		
		JButton btnTiepTuc = new JButton("Ti\u1EBFp t\u1EE5c");
		btnTiepTuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtHoTen.setText("");
				cbbKhoi.setSelectedItem("10");
				txtTBKH1.setText("");
				txtTBHK2.setText("");
			}
		});
		btnTiepTuc.setBounds(326, 58, 133, 23);
		contentPane.add(btnTiepTuc);
		
		btnDocDanhSach = new JButton("\u0110\u1ECDc danh s\u00E1ch");
		btnDocDanhSach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hoten;
				double tbhk1;
				double tbhk2;
				int khoi;
				double tbcn;
				
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("Họ tên");
				model.addColumn("Khối");
				model.addColumn("TB HK1");
				model.addColumn("TB HK2");
				model.addColumn("TB cả năm");
				
				try(DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/tongketnamhoc.txt"))))
				{
					
					while(true)
					{
						hoten = in.readUTF();
						khoi = in.readInt();
						tbhk1 = in.readDouble();
						tbhk2 = in.readDouble();
						tbcn = (tbhk1 + (tbhk2*2))/3;
						DecimalFormat df = new DecimalFormat("###.##");
						tbcn = Double.parseDouble(df.format(tbcn));
						model.addRow(new Object[]{hoten, khoi, tbhk1, tbhk2, tbcn});
						
					}
					
				}catch (EOFException ev) {
				 } 
				catch (FileNotFoundException ex) {
					 Logger.getLogger(bai1_FrTongKetNamHoc.class.getName()).log(Level.SEVERE, null, ex);
					  } 
				catch (IOException ex) {
					 Logger.getLogger(bai1_FrTongKetNamHoc.class.getName()).log(Level.SEVERE, null, ex);
					  }

				table.setModel(model);
			}
		});
		btnDocDanhSach.setBounds(326, 94, 133, 23);
		contentPane.add(btnDocDanhSach);
		
		btnThongKe = new JButton("Th\u1ED1ng k\u00EA");
		btnThongKe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hoten;
				double tbhk1;
				double tbhk2;
				int khoi;
				double tbcn;
				
				int soHSGioi=0;
				int soHSKha=0;
				int soHSKhaTB=0;
				int soHSYeuKem=0;
				
				
				try(DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/tongketnamhoc.txt"))))
				{
					
					while(true)
					{
						hoten = in.readUTF();
						khoi = in.readInt();
						tbhk1 = in.readDouble();
						tbhk2 = in.readDouble();
						tbcn = (tbhk1 + (tbhk2*2))/3;
						if(tbcn >=8)
						{
							soHSGioi++;
						}
						else if(tbcn >=7 && tbcn<8 )
						{
							soHSKha++;
						}
						else if(tbcn >=5 && tbcn<7)
						{
							soHSKhaTB++;
						}
						else {
							soHSYeuKem++;
						}
					}
					 
				}catch (EOFException ev) {
				 } 
				catch (FileNotFoundException ex) {
					 Logger.getLogger(bai1_FrTongKetNamHoc.class.getName()).log(Level.SEVERE, null, ex);
					  } 
				catch (IOException ex) {
					 Logger.getLogger(bai1_FrTongKetNamHoc.class.getName()).log(Level.SEVERE, null, ex);
					  }
				String kq ="Số HS giỏi: "+ soHSGioi +"\n" +"Số HS khá: "+soHSKha+"\n"+"Số HS TB Khá và TB: "+
					  soHSKhaTB+ "\n"+"Số HS yếu kém: "+soHSYeuKem;
				JOptionPane.showMessageDialog(rootPane, kq, "Kết quả", 1);
			}
			
				
		});
		btnThongKe.setBounds(326, 132, 133, 23);
		contentPane.add(btnThongKe);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 171, 472, 135);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"H\u1ECD v\u00E0 t\u00EAn", "Khối", "TB HK1", "TB HK2", "TB Cả năm"
			}
		));
		scrollPane.setViewportView(table);
	}
}
