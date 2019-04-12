package module1_chapter6LTHDoiTuongNC;

public class NhanVienHanhChinh extends NhanVien {
	
	private double phuCap;
	
	
	public NhanVienHanhChinh(double phuCap, double heSo) {
		super(heSo);
		this.phuCap = phuCap;
		
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	public NhanVienHanhChinh()
	{
		
	}
	
	@Override
	public double TinhLuong() {
		
		return super.TinhLuong()+this.phuCap;
	}

	

}
