package module1_chapter5DoiTuong;

import module1_chapter5DoiTuong.Phim;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class FrPhimChieuRap extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenPhim;
	private JTextField txtTheLoai;
	private JTextField txtNgayChieu;
	private JTextField txtRap;
	public Phim[] phim = new Phim[5];
	public int flag=0;
	private JLabel lblHinhAnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrPhimChieuRap frame = new FrPhimChieuRap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//ham set hinh anh
	
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
	/**
	 * Create the frame.
	 */
	
	public FrPhimChieuRap() {
		
		setTitle("Phim chieu rap");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTruoc = new JButton("");
		ImageIcon icon1 = new ImageIcon("./src/img/back.png");	
		Image img1 = icon1.getImage() ;  
		Image newimg1 = img1.getScaledInstance( 40, 40, java.awt.Image.SCALE_SMOOTH ) ;  
		icon1 = new ImageIcon( newimg1);
		btnTruoc.setIcon(icon1);
		
		btnTruoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(flag==0)
				{
					JOptionPane.showMessageDialog(rootPane, "Đây là phim đầu tiên. Vui lòng nhấn => để xem các phim phía sau!");
				}
				else
				{
					flag--;
					txtTenPhim.setText(phim[flag].getTenPhim());
					
					txtTheLoai.setText(phim[flag].getTheLoai());

					txtNgayChieu.setText(phim[flag].getNgayChieu());
					
					txtRap.setText(phim[flag].getRap());

					XuLyAnh(lblHinhAnh, phim[flag].getDuonDanHinh());
				}
				
			}
		});
		btnTruoc.setBounds(10, 155, 59, 23);
		contentPane.add(btnTruoc);
		
		JButton btnSau = new JButton("");
		//XuLyAnh(btnSau, "./src/img/next.jpg");
		btnSau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag < 4)
				{
					flag++;
					txtTenPhim.setText(phim[flag].getTenPhim());
					
					txtTheLoai.setText(phim[flag].getTheLoai());

					txtNgayChieu.setText(phim[flag].getNgayChieu());
					
					txtRap.setText(phim[flag].getRap());

					XuLyAnh(lblHinhAnh, phim[flag].getDuonDanHinh());
				}
				else {
					 JOptionPane.showMessageDialog(rootPane, "Đã hết phim. Vui lòng nhấn <= để xem"
					+" các phim phía trước!");
					 }
			}
		});
		btnSau.setBounds(495, 155, 59, 23);
		contentPane.add(btnSau);
		ImageIcon icon = new ImageIcon("./src/img/next.jpg");	
		Image img = icon.getImage() ;  
		Image newimg = img.getScaledInstance( 40, 40, java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );
		btnSau.setIcon(icon);
		lblHinhAnh = new JLabel("");
		lblHinhAnh.setBounds(87, 35, 186, 222);
		contentPane.add(lblHinhAnh);
		
		txtTenPhim = new JTextField();
		txtTenPhim.setBackground(Color.WHITE);
		txtTenPhim.setBounds(285, 35, 200, 20);
		contentPane.add(txtTenPhim);
		txtTenPhim.setColumns(10);
		
		txtTheLoai = new JTextField();
		txtTheLoai.setColumns(10);
		txtTheLoai.setBounds(285, 84, 200, 20);
		contentPane.add(txtTheLoai);
		
		txtNgayChieu = new JTextField();
		txtNgayChieu.setColumns(10);
		txtNgayChieu.setBounds(283, 141, 202, 20);
		contentPane.add(txtNgayChieu);
		
		txtRap = new JTextField();
		txtRap.setColumns(10);
		txtRap.setBounds(283, 199, 202, 20);
		contentPane.add(txtRap);
		
		Phim p1 = new Phim("Doreamon", "Hoạt hình", "29/3/2019", "CGV", "./src/img/phimdoreamon.jpg");
		Phim p2 = new Phim("Gấu pooth", "Hoạt hình", "05/4/2019", "CGV", "./src/img/phimgaupoo.jpg");
		Phim p3 = new Phim("Hàng xóm tôi là Totoro", "Hoạt hình", "01/4/2019", "CGV", "./src/img/phimhangxomtoilatotoro.jpg");
		Phim p4 = new Phim("Minion", "Hoạt hình", "30/3/2019", "CGV", "./src/img/phimminion.jpg");
		Phim p5 = new Phim("Tom và Jerry", "Hoạt hình", "29/3/2019", "CGV", "./src/img/gaupanda.jpg");
		
		phim[0] = p1;
		phim[1] = p2;
		phim[2] = p3;
		phim[3] = p4;
		phim[4] = p5;
		
		txtTenPhim.setBackground(Color.yellow);
		txtTenPhim.setText(phim[0].getTenPhim());
		
		txtTheLoai.setBackground(Color.BLUE);
		txtTheLoai.setText(phim[0].getTheLoai());
		
		txtNgayChieu.setBackground(Color.CYAN);
		txtNgayChieu.setText(phim[0].getNgayChieu());
		
		txtRap.setBackground(Color.GRAY);
		txtRap.setText(phim[0].getRap());
		
		XuLyAnh(lblHinhAnh, phim[0].getDuonDanHinh());
	}
}
