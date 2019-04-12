package module1_chapter6LTHDoiTuongNC;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;

public class Bai6_1_FrAnimalSayHello extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JLabel lblHello;
	private JLabel lblImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai6_1_FrAnimalSayHello frame = new Bai6_1_FrAnimalSayHello();
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
	public Bai6_1_FrAnimalSayHello() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 11, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblAnimal = new JLabel("Animal");
		lblAnimal.setBounds(10, 59, 46, 14);
		contentPane.add(lblAnimal);
		
		txtName = new JTextField();
		txtName.setBounds(89, 8, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cat", "Dog", "Pig"}));
		comboBox.setBounds(89, 56, 86, 20);
		contentPane.add(comboBox);
		
		lblImage = new JLabel("");
		lblImage.setBounds(237, 11, 189, 202);
		contentPane.add(lblImage);
		
		JButton btnSayHello = new JButton("Say Hello");
		btnSayHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String name = txtName.getText();
				String imagePath = "./src/img/";
				//ImageIcon img = null;
				
				switch(comboBox.getSelectedItem().toString())
				{
				case "Dog":
					Dog d = new Dog(name, "dog.jpg");
					lblHello.setText(name + " "+"says"+" " + d.sayHello());
					//img = new ImageIcon(imagePath+d.getImage());
					//lblImage.setIcon(img);
					XuLyAnh(lblImage,imagePath+d.getImage());
					break;
				case "Cat":
					Cat c = new Cat(name, "cat.png");
					lblHello.setText(name+ " says "+ c.sayHello());
					XuLyAnh(lblImage,imagePath+c.getImage());
					break;
				case "Pig":
					Pig p = new Pig (name, "pig.jpg");
					lblHello.setText(name +" says "+p.sayHello());
					XuLyAnh(lblImage,imagePath+p.getImage());
					break;
				}
					
			}
		});
		btnSayHello.setBounds(65, 119, 89, 23);
		contentPane.add(btnSayHello);
		
		lblHello = new JLabel("");
		lblHello.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHello.setBounds(10, 184, 189, 29);
		contentPane.add(lblHello);
	}
	
	public void XuLyAnh(JLabel lab, String duongDan) {
		try {
			BufferedImage img = ImageIO.read(new File(duongDan));
			int x = lab.getSize().width;
			int y = lab.getSize().height;
			int ix = img.getWidth();
			int iy = img.getHeight();
			int dx=0;
			int dy=0;
			
			if(x/y > ix/iy) {
				dy = y;
				dx = dy*ix/iy;
			}
			else {
				dx = x;
				dy = dx*iy/ix;
			}
			ImageIcon icon = new ImageIcon(img.getScaledInstance(dx, dy, img.SCALE_SMOOTH));
			lab.setIcon(icon);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
