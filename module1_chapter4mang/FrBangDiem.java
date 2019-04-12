package module1_chapter4mang;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.awt.event.ActionEvent;

public class FrBangDiem extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtScore;
	private JTextField txtFind;
	private String data[][] = new String[100][100];
	private int index=0;
	private JScrollPane scrollPane;
	private JList list;
	private JButton btnAdd;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrBangDiem frame = new FrBangDiem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public String[]mangLocal(String a, String b, int index)
	{
		data[index][0] = a;
		data[index][1] = b;
		index++;
		this.index++;
		String local[] = new String[index];
		for(int i=0;i<index;i++)
		{
			local[i]=data[i][0]+" "+data[i][1];
					
		}
		
		return local;
	}
	/**
	 * Create the frame.
	 */
	public FrBangDiem() {
		setTitle("Score board");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setBounds(66, 8, 128, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel txt = new JLabel("Score");
		txt.setBounds(204, 14, 46, 14);
		contentPane.add(txt);
		
		txtScore = new JTextField();
		txtScore.setColumns(10);
		txtScore.setBounds(260, 11, 128, 20);
		contentPane.add(txtScore);
		
		btnAdd = new JButton("Add");
		
		
		btnAdd.addActionListener(new ActionListener() {
			//mangLocal(a, b,index);
			
			public void actionPerformed(ActionEvent arg0) {
				//lay thong tin nguoi dung
				String name = txtName.getText().trim();
				String score = txtScore.getText().trim();
				//b2 Sắp xếp dữ liệu => mảng 2 chiều: cột name, cột birth
				//đưa dữ liệu nguoi dung vào data
				/*data[index][0] = name;
				data[index][1] = score;
				index++;
				String local[] = new String[index];
				for(int i=0;i<index;i++)
				{
					local[i]=data[i][0]+" "+data[i][1];
							
				}*/
				String[]local=mangLocal(name,score,index);//ham them ptu vao mang 1 chieu
				//hien thi ket qua
				DefaultListModel<String> model = (DefaultListModel<String>) list.getModel();
				model.clear();//xoa de them chuoi moi
				for(String row: local)
				{
					String indexVersion[]=row.split(" ");//cắt chuỗi khi gặp khoảng trắng.
					model.addElement(indexVersion[0]+ " "+ indexVersion[1]);
				}
				
			}
		});
		btnAdd.setBounds(439, 11, 128, 46);
		contentPane.add(btnAdd);
		
		JButton btnSortName = new JButton("Sort Name");
		
		btnSortName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String local[] = new String[index];
				for(int i=0;i<index;i++)
				{
					local[i]=data[i][0]+" "+data[i][1];
							
				}
				
				Arrays.sort(local);
				//hien thi ket qua
				DefaultListModel<String> model = (DefaultListModel<String>) list.getModel();
				model.clear();
				for(String row: local)
				{
					String indexVersion[]=row.split(" ");//cắt chuỗi khi gặp khoảng trắng.
					model.addElement(indexVersion[0]+ " "+ indexVersion[1]);
				}
				
				
			}
		});
		btnSortName.setBounds(439, 76, 128, 46);
		contentPane.add(btnSortName);
		
		JButton btnSortScore = new JButton("Sort Score");
		btnSortScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String min = data[0][1];
				String local[] = new String[index];
				for(int ii=0;ii<index-1;ii++)
				{
					for(int i=ii+1;i<index;i++)
					{
						if(Integer.parseInt(data[ii][1])> Integer.parseInt(data[i][1]))
						{
							 String temp = data[ii][1];
			                 String temp2 = data[ii][0];
			                 data[ii][1] = data[i][1];
			                 data[ii][0] = data[i][0];
			                 data[i][1] = temp; 
			                 data[i][0] = temp2;
			                 
						}
						
					}
				}
				for(int j=0;j<index;j++)
				{
					local[j]=data[j][0]+" "+data[j][1];
				}
				
				//hien thi ket qua
				DefaultListModel<String> model = (DefaultListModel<String>) list.getModel();
				model.clear();
				for(String row: local)
				{
					String indexVersion[]=row.split(" ");//cắt chuỗi khi gặp khoảng trắng.
					model.addElement(indexVersion[0]+ " "+ indexVersion[1]);
				}
			}
		});
		btnSortScore.setBounds(439, 142, 128, 46);
		contentPane.add(btnSortScore);
		
		txtFind = new JTextField();
		txtFind.setColumns(10);
		txtFind.setBounds(439, 207, 128, 20);
		contentPane.add(txtFind);
		
		JButton btnFind = new JButton("Find");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String timChuoi = txtFind.getText().trim();
				String local[] = new String[index];
				int dem = 0;
				for(int i=0;i<index;i++)
				{
					
					if(data[i][0].contains(timChuoi)||data[i][1].contains(timChuoi))
					{
							local[dem]=data[i][0]+" "+data[i][1];
							dem++;
						
						
					}
					
				}
				if(dem>0)
				{
					//hien thi ket qua
					DefaultListModel<String> model = (DefaultListModel<String>) list.getModel();
					model.clear();
					for(String row: local)
					{
						String indexVersion[]=row.split(" ");//cắt chuỗi khi gặp khoảng trắng.
						model.addElement(indexVersion[0]+ " "+ indexVersion[1]);
					}
				}
				else
				{
					DefaultListModel<String> model = (DefaultListModel<String>) list.getModel();
					model.clear();
					model.addElement("Khong ton tai");
					
				}
				
			}
		});
		btnFind.setBounds(439, 251, 128, 46);
		contentPane.add(btnFind);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 391, 291);
		contentPane.add(scrollPane);
		
		list = new JList();
		list.setModel(new DefaultListModel<String>());
		scrollPane.setViewportView(list);
	}
}
