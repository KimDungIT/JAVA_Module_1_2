package module1_chapter3GiaoDien;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class FrThemMoiLienHe extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtPic;
	private String[][]data = new String[100][100];
	private int index=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrThemMoiLienHe frame = new FrThemMoiLienHe();
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
	public FrThemMoiLienHe() {
		setTitle("Th\u00EAm m\u1EDBi li\u00EAn h\u1EC7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Th\u00EAm m\u1EDBi li\u00EAn h\u1EC7");
		lblNewLabel.setBounds(10, 11, 144, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("H\u1ECD t\u00EAn");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtName = new JTextField();
		txtName.setBounds(75, 28, 177, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblinThoi = new JLabel("\u0110i\u1EC7n tho\u1EA1i");
		lblinThoi.setBounds(10, 64, 75, 14);
		contentPane.add(lblinThoi);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(75, 56, 177, 20);
		contentPane.add(txtPhone);
		
		JLabel lblHnhnh = new JLabel("H\u00ECnh \u1EA3nh");
		lblHnhnh.setBounds(10, 105, 55, 14);
		contentPane.add(lblHnhnh);
		
		txtPic = new JTextField();
		txtPic.setColumns(10);
		txtPic.setBounds(75, 97, 177, 20);
		contentPane.add(txtPic);
		JList list = new JList();
		list.setModel(new DefaultListModel<String>());
		list.setBounds(52, 223, 413, 104);
		contentPane.add(list);
		
		JButton btnFileChoose = new JButton("...");
		btnFileChoose.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				JFileChooser file_chooser = new JFileChooser();
				file_chooser.setCurrentDirectory(new File("/User/alvinreyes"));
		         
		        int result = file_chooser.showOpenDialog(new JFrame());
		     
		     //goi open dialog, approve_opton: la 1 hang so
		        if (result == JFileChooser.APPROVE_OPTION) {
		            File selectedFile = file_chooser.getSelectedFile();
		            txtPic.setText(selectedFile.getAbsolutePath());//lay duong dan
		        }
		       
			}
		});
		btnFileChoose.setBounds(149, 128, 37, 23);
		contentPane.add(btnFileChoose);
		
		JLabel lbPic = new JLabel("");
		lbPic.setBounds(311, 11, 211, 207);
		contentPane.add(lbPic);
		
		JButton btnThemLienHe = new JButton("Th\u00EAm li\u00EAn h\u1EC7");
		btnThemLienHe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			        
				String pic = txtPic.getText().trim();
				ImageIcon icon = new ImageIcon(pic);
				Image img = icon.getImage();
				Image newImg = img.getScaledInstance(lbPic.getWidth(),lbPic.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon image = new ImageIcon(newImg);
				lbPic.setIcon(image);
				
				
			}
		});
		btnThemLienHe.setBounds(116, 162, 123, 23);
		contentPane.add(btnThemLienHe);
		
		
		
		
	}
}
