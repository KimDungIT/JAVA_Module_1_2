package module1_chapter5DoiTuong;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class FrInCarts extends JFrame {

	private JPanel contentPane;
	private Prroduct listOfProduct[] = new Prroduct[4] ;
	private int listOfSelect[] = new int[4] ;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrInCarts frame = new FrInCarts();
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
	public FrInCarts() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPayment = new JButton("Payment");
		btnPayment.setBounds(147, 247, 164, 40);
		contentPane.add(btnPayment);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 428, 228);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"product", "Price"
			}
			
		));
		
		loadDataTable();
		table.getColumnModel().getColumn(0).setPreferredWidth(88);
		scrollPane.setViewportView(table);
	}
	public JTable getTable()
	{
		return table;
	}
	public void loadDataTable()
	{
		DefaultTableModel model =(DefaultTableModel)table.getModel();
		for(int i= 0;i<4;i++)
		{
			if(listOfSelect[i]==1)
			{
				Prroduct product = new Prroduct();
				model.addRow(new Object[]{product.getName(), product.getPrice()});
			}
		}
	}
	public void setListOfProduct(Prroduct[] listOfProduct) {
		this.listOfProduct = listOfProduct;
	}

	public void setListOfSelect(int[] listOfSelect) {
		this.listOfSelect = listOfSelect;
	}
	
}
