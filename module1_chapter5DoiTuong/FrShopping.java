package module1_chapter5DoiTuong;

//import module1_chapter5DoiTuong.Prroduct;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrShopping extends JFrame {

	private JPanel contentPane;
	private Prroduct listOfProduct[] = new Prroduct[4];
	private int listOfSelect[] = new int[4] ;

	/**
	 * Launch the application.
	 */
	private void listProduct()
	{
		listOfProduct[0] = new Prroduct("Cocacola", 20);
		listOfProduct[1] = new Prroduct("Nuoc ep cam teppy", 40);
		listOfProduct[2] = new Prroduct("Nuoc ep nho", 50);
		listOfProduct[3] = new Prroduct("Nuoc ngot fanta", 20);
	}
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrShopping frame = new FrShopping();
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
	
	public FrShopping() {
		setTitle("Click to buy");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		listProduct();
		JLabel lblPic1 = new JLabel("");
		lblPic1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(listOfSelect[0] == 0)
				{
					listOfSelect[0] = 1;
				}
				
			}
		});
		
		ImageIcon icon = new ImageIcon("./src/img/nuoc_cocacola.jpg");	
		Image img = icon.getImage() ;  
		Image newimg = img.getScaledInstance( 150, 150, java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );
		lblPic1.setIcon(icon);
		lblPic1.setBounds(0, 11, 170, 139);
		contentPane.add(lblPic1);
		
		JLabel lblPic2 = new JLabel("");
		lblPic2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(listOfSelect[1] == 0)
				{
					listOfSelect[1] = 1;
				}
				
			}
		});
		ImageIcon icon2 = new ImageIcon("./src/img/nuoc_ep_cam_teppy.jpg");	
		Image img2 = icon2.getImage() ;  
		Image newimg2 = img2.getScaledInstance( 150, 150,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon2 = new ImageIcon( newimg2 );
		lblPic2.setIcon(icon2);
		lblPic2.setBounds(210, 11, 178, 139);
		contentPane.add(lblPic2);
		
		JLabel lblPic3 = new JLabel("");
		lblPic3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(listOfSelect[2] == 0)
				{
					listOfSelect[2] = 1;
				}
				
			}
		});
		ImageIcon icon3 = new ImageIcon("./src/img/nuoc_ep_nho.jpg");	
		Image img3 = icon3.getImage() ;  
		Image newimg3 = img3.getScaledInstance( 150, 150,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon3 = new ImageIcon( newimg3 );
		lblPic3.setIcon(icon3);
		lblPic3.setBounds(0, 161, 175, 130);
		contentPane.add(lblPic3);
		
		JLabel lblPic4 = new JLabel("");
		lblPic4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(listOfSelect[3] == 0)
				{
					listOfSelect[3] = 1;
				}
				
			}
		});
		ImageIcon icon4 = new ImageIcon("./src/img/nuoc_ngot_fanta.jpg");	
		Image img4 = icon4.getImage() ;  
		Image newimg4 = img4.getScaledInstance( 150, 150,  java.awt.Image.SCALE_SMOOTH );  
		icon4 = new ImageIcon( newimg4 );
		lblPic4.setIcon(icon4);
		lblPic4.setBounds(210, 161, 175, 130);
		contentPane.add(lblPic4);
		
		JButton btnCart = new JButton("Cart");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*if(!isSelect())
				{
					JOptionPane.showMessageDialog(null, "Please select any product!");
					return ;
				}*/
				String name="";
				for(int i=0;i<4;i++)
				{
					if(listOfSelect[i]==1)
					{
						System.out.println("product dc click: "+listOfSelect[i]);
						name +=listOfProduct[i].getName()+"," ;
						System.out.println(name);
					}
				}
				if(name=="")
				{
					JOptionPane.showMessageDialog(null, "Please select any product!");
					return;
				}
				else
				{
					if(JOptionPane.showConfirmDialog(null, "Do you want to buy?"+name) == JOptionPane.YES_OPTION)
					{
						
						FrInCarts frm = new FrInCarts();
						frm.setListOfProduct(listOfProduct);
						frm.setListOfSelect(listOfSelect);
						//frm.loadDataTable();
						frm.setVisible(true);
						
					}
				}
				
			}
		});
		ImageIcon iconCart = new ImageIcon("./src/img/cart_icon.png");
		Image imgCart = iconCart.getImage() ;
		Image newimgCart = imgCart.getScaledInstance( 40, 40,  java.awt.Image.SCALE_SMOOTH ); 
		iconCart = new ImageIcon( newimgCart );
		
		btnCart.setIcon(iconCart);
		btnCart.setBounds(0, 302, 378, 35);
		contentPane.add(btnCart);
		
	}
	protected boolean isSelect()
	{
		for(int element:listOfSelect)
		{
			if(element ==1)
			{
				return true;
			}
		}
		return false;
	}
	
}
