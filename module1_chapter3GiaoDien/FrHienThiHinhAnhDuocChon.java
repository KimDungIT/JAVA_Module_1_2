package module1_chapter3GiaoDien;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrHienThiHinhAnhDuocChon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrHienThiHinhAnhDuocChon frame = new FrHienThiHinhAnhDuocChon();
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
	public FrHienThiHinhAnhDuocChon() {
		setTitle("Image View");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
	
		JLabel lblImage = new JLabel("");
		lblImage.setBounds(158, 11, 285, 309);
		contentPane.add(lblImage);
		JButton btnPic1 = new JButton("");
		btnPic1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ImageIcon myImageIcon= new
						ImageIcon("./src/img/doreamon.jpg");
				
				Image imgPic1 = myImageIcon.getImage() ;  
				Image newimgPic1 = imgPic1.getScaledInstance( 250, 270, java.awt.Image.SCALE_SMOOTH ) ;  
				myImageIcon = new ImageIcon( newimgPic1);
				lblImage.setIcon(myImageIcon);
				
						
			}
		});
		ImageIcon icon = new ImageIcon("./src/img/doreamon.jpg");	
		Image img = icon.getImage() ;  
		Image newimg = img.getScaledInstance( 90, 70, java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );
		btnPic1.setIcon(icon);
		btnPic1.setBounds(10, 11, 89, 72);
		contentPane.add(btnPic1);
		
		JButton btnPic2 = new JButton("");
		btnPic2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon myImageIcon= new
						ImageIcon("./src/img/nobita.jpg");
				
				Image imgPic1 = myImageIcon.getImage() ;  
				Image newimgPic1 = imgPic1.getScaledInstance( 250, 270, java.awt.Image.SCALE_SMOOTH ) ;  
				myImageIcon = new ImageIcon( newimgPic1);
				lblImage.setIcon(myImageIcon);
			}
		});
		
		ImageIcon icon2 = new ImageIcon("./src/img/nobita.jpg");	
		Image img2 = icon2.getImage() ;  
		Image newimg2 = img2.getScaledInstance( 90, 70,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon2 = new ImageIcon( newimg2 );
		btnPic2.setIcon(icon2);
		btnPic2.setBounds(10, 119, 89, 72);
		contentPane.add(btnPic2);
		
		JButton btnPic3 = new JButton("");
		btnPic3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon myImageIcon= new
						ImageIcon("./src/img/xuka.png");
				
				Image imgPic1 = myImageIcon.getImage() ;  
				Image newimgPic1 = imgPic1.getScaledInstance( 250, 270, java.awt.Image.SCALE_SMOOTH ) ;  
				myImageIcon = new ImageIcon( newimgPic1);
				lblImage.setIcon(myImageIcon);
			}
		});
		ImageIcon icon3 = new ImageIcon("./src/img/xuka.png");	
		Image img3 = icon3.getImage() ;  
		Image newimg3 = img3.getScaledInstance( 90, 70,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon3 = new ImageIcon( newimg3 );
		btnPic3.setIcon(icon3);
		btnPic3.setBounds(10, 220, 89, 72);
		contentPane.add(btnPic3);
		
		
	}

}
