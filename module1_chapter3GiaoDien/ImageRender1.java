package module1_chapter3GiaoDien;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ImageRender1 extends JLabel implements ListCellRenderer {
	
	public String daftar[];
	public ImageRender1(String gmb[])
	{
		daftar = gmb;
	}
	
	/*public void XuLyAnh(JLabel lab, String duongDan) {
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
			ImageIcon icon1 = new ImageIcon(img.getScaledInstance(dx, dy, img.SCALE_SMOOTH));
			lab.setIcon(icon1);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	
	@Override
	public Component getListCellRendererComponent(JList list,Object value, int index, boolean isSelected, boolean cellHasFocus  )
	{
		int idx = ((Integer)value).intValue();
		if(isSelected)
		{
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
			
		}
		else
		{
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}
		ImageIcon img = new ImageIcon("./src/img/"+daftar[idx].toLowerCase() + ".jpg");// load the image to a imageIcon
		Image image = img.getImage(); // transform it 
		Image newimg = image.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		img = new ImageIcon(newimg);  // transform it back
		
		String var = daftar[idx];
		
		setIcon(img);
		setText(var);
		
		setHorizontalAlignment(CENTER);
		return this;
	}

}
