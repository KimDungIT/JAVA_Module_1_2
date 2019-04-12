package module1_chapter3GiaoDien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class FrMenuBar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrMenuBar frame = new FrMenuBar();
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
	public FrMenuBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 450, 21);
		contentPane.add(menuBar);
		
		JMenu mnBai1 = new JMenu("B\u00E0i 1");
		menuBar.add(mnBai1);
		
		JMenu mnBai2 = new JMenu("B\u00E0i 2");
		menuBar.add(mnBai2);
		
		JMenu mnBai3 = new JMenu("B\u00E0i 3");
		menuBar.add(mnBai3);
		
		JMenu mnBai4 = new JMenu("B\u00E0i 4");
		menuBar.add(mnBai4);
		
		JMenu mnBai5 = new JMenu("B\u00E0i 5");
		menuBar.add(mnBai5);
		
		JMenu mnBai6 = new JMenu("B\u00E0i 6");
		menuBar.add(mnBai6);
		
		JMenu mnBai7 = new JMenu("B\u00E0i 7");
		menuBar.add(mnBai7);
		
		JMenu mnBai8 = new JMenu("B\u00E0i 8");
		menuBar.add(mnBai8);
		
		JMenu mnBai9 = new JMenu("B\u00E0i 9");
		menuBar.add(mnBai9);
	}
}
