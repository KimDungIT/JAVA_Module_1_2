package module1_chapter6LTHDoiTuongNC;

public class NhanVien {
	
	final double luongCD = 1550000;
	private double heSo;
	public NhanVien() {
		super();
	}
	public NhanVien(double heSo) {
		
		this.heSo = heSo;
	}
	public double getHeSo() {
		return heSo;
	}
	public void setHeSo(double heSo) {
		this.heSo = heSo;
	}
	
	public double TinhLuong()
	{
		return luongCD*this.heSo;
	}
	
	

}
