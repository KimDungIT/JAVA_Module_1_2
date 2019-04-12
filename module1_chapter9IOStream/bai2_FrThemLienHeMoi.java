package module1_chapter9IOStream;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.imageio.stream.FileCacheImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

public class bai2_FrThemLienHeMoi extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoTen;
	private JTextField txtDienThoai;
	private JTextField txtHinhAnh;
	private JLabel lblImage;
	private JLabel lblRead;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai2_FrThemLienHeMoi frame = new bai2_FrThemLienHeMoi();
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
	public bai2_FrThemLienHeMoi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Thêm mới liên hệ");
		label.setBounds(10, 23, 144, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Họ tên");
		label_1.setBounds(10, 48, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Điện thoại");
		label_2.setBounds(10, 76, 75, 14);
		contentPane.add(label_2);
		
		txtHoTen = new JTextField();
		txtHoTen.setColumns(10);
		txtHoTen.setBounds(75, 40, 177, 20);
		contentPane.add(txtHoTen);
		
		txtDienThoai = new JTextField();
		txtDienThoai.setColumns(10);
		txtDienThoai.setBounds(75, 73, 177, 20);
		contentPane.add(txtDienThoai);
		
		txtHinhAnh = new JTextField();
		txtHinhAnh.setColumns(10);
		txtHinhAnh.setBounds(75, 109, 177, 20);
		contentPane.add(txtHinhAnh);
		
		JLabel label_3 = new JLabel("Hình ảnh");
		label_3.setBounds(10, 117, 55, 14);
		contentPane.add(label_3);
		
		JButton btnChooseFile = new JButton("...");
		btnChooseFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser file_chooser = new JFileChooser();
				file_chooser.setCurrentDirectory(new File("/User/alvinreyes"));
		         
		        int result = file_chooser.showOpenDialog(new JFrame());
		     
		     //goi open dialog, approve_opton: la 1 hang so
		        if (result == JFileChooser.APPROVE_OPTION) {
		            File selectedFile = file_chooser.getSelectedFile();
		            txtHinhAnh.setText(selectedFile.getAbsolutePath());//lay duong dan
		        }
		       
			
				
			}
		});
		btnChooseFile.setBounds(262, 108, 37, 23);
		contentPane.add(btnChooseFile);
		
		JButton btnThemLienHe = new JButton("Thêm liên hệ");
		btnThemLienHe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hoTen =txtHoTen.getText().trim();
				String dtdd = txtDienThoai.getText().trim();
				String hinhAnh = txtHinhAnh.getText().trim();
				
				ImageIcon icon = new ImageIcon(hinhAnh);
				Image img = icon.getImage();
				Image newImg = img.getScaledInstance(lblImage.getWidth(),lblImage.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon image = new ImageIcon(newImg);
				lblImage.setIcon(image);
				
				//lay hinh anh duoc chon bo vao thu muc
				File f =new File (txtHinhAnh.getText());
				String path = "src/img/";
				String duong_dan = path + f.getName();
				
				try{
					Files.copy(f.toPath(), (new File(path + f.getName())).toPath(),
							StandardCopyOption.REPLACE_EXISTING);
					System.out.println("Da dua hinh len thu muc");
				}
				catch(IOException ex){
					 Logger.getLogger(bai1_FrTongKetNamHoc.class.getName()).log(Level.SEVERE, null, ex);					
				}
				
				LienHe lh = new LienHe(hoTen, dtdd, hinhAnh);
				ObjectOutputStream out;
				try {
					
					out = new ObjectOutputStream(new FileOutputStream("src/LienHe.txt", true)){
						@Override
						 protected void writeStreamHeader() throws IOException {
						 reset();
						 }
					};
					out.writeObject(lh);
					out.close();
					JOptionPane.showMessageDialog(rootPane, "Đã thêm liên hệ: "+lh.getHoten()+" "+lh.getDtdd() +" "+lh.getHinhAnh());
				}  catch (FileNotFoundException ex) {
					Logger.getLogger(bai2_FrThemLienHeMoi.class.getName()).log(Level.SEVERE, null, ex);
				 } catch (IOException ex) {
				Logger.getLogger(bai2_FrThemLienHeMoi.class.getName()).log(Level.SEVERE, null, ex);
				 }
				
				
				LienHe lh1 = new LienHe();
				
				try(DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/LienHe.txt"))))
				{
					 
					 while(true)
					 {
						//lh1=(LienHe)in.readObject();
						lblRead.setText(lh1.toString());
					 }
					
					
				}  catch (FileNotFoundException ex) {
					Logger.getLogger(bai2_FrThemLienHeMoi.class.getName()).log(Level.SEVERE, null, ex);
				 } catch (IOException ex) {
				Logger.getLogger(bai2_FrThemLienHeMoi.class.getName()).log(Level.SEVERE, null, ex);
				 } 
				
				
				
			}
		});
		btnThemLienHe.setBounds(116, 174, 123, 23);
		contentPane.add(btnThemLienHe);
		
		lblImage = new JLabel("");
		lblImage.setBounds(311, 23, 211, 210);
		contentPane.add(lblImage);
		
		lblRead = new JLabel("");
		lblRead.setBounds(143, 208, 339, 129);
		contentPane.add(lblRead);
	}
}
