package module1_chapter3GiaoDien;

import module1_chapter3GiaoDien.ReadOrWriteFile;
import module1_chapter3GiaoDien.ImageRender1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class FrDatveXemPhim1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtSeat;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrDatveXemPhim1 frame = new FrDatveXemPhim1();
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
	public FrDatveXemPhim1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 29, 46, 14);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(174, 26, 182, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblSeat = new JLabel("Seat");
		lblSeat.setBounds(10, 77, 46, 14);
		contentPane.add(lblSeat);
		
		txtSeat = new JTextField();
		txtSeat.setColumns(10);
		txtSeat.setBounds(174, 74, 182, 20);
		contentPane.add(txtSeat);
		
		JLabel lblMovies = new JLabel("Movies");
		lblMovies.setBounds(10, 154, 46, 14);
		contentPane.add(lblMovies);
		
		String data[] = getFilmList();
		
		
		ImageRender1 render = new ImageRender1(data);
		
		Integer[] idx = new Integer[data.length];
		for(int a=0;a<data.length;a++)
		{
			System.out.println("Mang la: "+data[a]);
			idx[a] = new Integer(a);
			System.out.println("Mang idx la: "+idx[a]);
		}
		
		//comboBox = new JComboBox();
		comboBox = new JComboBox(idx);
		comboBox.setRenderer(new ImageRender1(data));
		comboBox.setBackground(new Color(255,255,255));
		comboBox.setBounds(174, 133, 182, 142);
		contentPane.add(comboBox);
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String seats = txtSeat.getText();
				Integer n = Integer.parseInt(comboBox.getSelectedItem().toString());
				String movie = "";
				for(int i=0;i<data.length;i++)
				{
					if(n==i)
					{
						movie = data[i];
					}
				}	    
				
				JOptionPane.showMessageDialog(rootPane, "Seats: "+seats+"\n"+"Name: "+name+"\n"+"Movies: "+movie);
						 
			}
		});
		btnBook.setBounds(193, 307, 89, 23);
		contentPane.add(btnBook);
	}
	
	private void loadDataOfCbbMovie() {
		String[] data = getFilmList();
		Integer[] idx = new Integer[data.length];
		for (int i = 0; i < data.length; i++){
			idx[i] = i;
		}
		
		comboBox = new JComboBox(idx);
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(93, 61, 331, 20);
		
		
	}
	private String[] getFilmList()
	{
		File myFile = new File("./src/FilmList.txt");
		String s=null;
		try{
			s = ReadOrWriteFile.readTXT(myFile);
			String temps[] = s.split("\n");
			return temps;
		}
		catch (IOException e){
			JOptionPane.showMessageDialog(null, "File not found!", "Error!", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		return null;
	}

}
