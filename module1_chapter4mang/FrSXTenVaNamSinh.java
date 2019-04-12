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
import java.awt.List;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class FrSXTenVaNamSinh extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtBirth;
	private String data[][]= new String[100][100];
	private int indexRow=0;//đánh dấu dòng nào đang được thêm vào mảng data
	private JScrollPane scrollPane;
	private JList list_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrSXTenVaNamSinh frame = new FrSXTenVaNamSinh();
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
	public FrSXTenVaNamSinh() {
		setTitle("Sort by age");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setBounds(104, 8, 144, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblBirth = new JLabel("Birth");
		lblBirth.setBounds(10, 55, 46, 14);
		contentPane.add(lblBirth);
		
		txtBirth = new JTextField();
		txtBirth.setColumns(10);
		txtBirth.setBounds(104, 52, 144, 20);
		contentPane.add(txtBirth);
		
		JList list = new JList();
		list.setModel(new DefaultListModel<String>());
		//scrollPane.setViewportView(list);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//b1 Lấy thông tin người dùng nhập
				String name = txtName.getText().trim();
				//int birth = Integer.parseInt(txtBirth.getText().trim());
				String birth = txtBirth.getText().trim();
				
				//b2 Sắp xếp dữ liệu => mảng 2 chiều: cột name, cột birth
				//đưa dữ liệu B1 vào data
				data[indexRow][0]=name;
				data[indexRow][1]=birth;
				indexRow++;
				
				//sắp xếp tập data: copy các pt có giá trị ra mảng để sắp xếp -> tạm nhằm loại bỏ ptu null
				
				/*String local[][] = new String[indexRow][2];
				for(int i=0;i<indexRow;i++)
				{
					local[i][0] = data[i][0];
					local[i][1] = data[i][1];
				}*/
				
				String local[] = new String[indexRow];
				for(int i=0;i<indexRow;i++)
				{
					local[i]=data[i][1]+" "+data[i][0];
							
				}
				Arrays.sort(local);
				
				//b3 hiển thị kết quả lên JList, dữ liệu trong list gọi là model(abstract class -> fai khai báo là DefaultListModel
				DefaultListModel<String> model = (DefaultListModel<String>) list_1.getModel();
				model.clear();
				for(String row: local)
				{
					String indexVersion[]=row.split(" ");//cắt chuỗi khi gặp khoảng trắng.
					model.addElement(indexVersion[1]+ " "+ indexVersion[0]);
				}
			}
			//suy nghĩ sort trên mảng 2 chiều
		});
		btnAdd.setBounds(268, 8, 144, 68);
		contentPane.add(btnAdd);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 95, 397, 155);
		contentPane.add(scrollPane);
		
		list_1 = new JList();
		list_1.setModel(new DefaultListModel<String>());
		scrollPane.setViewportView(list_1);
		
		
	}
}
