package module1_chapter6LTHDoiTuongNC;

public class NhanVienKinhDoanh extends NhanVien {

	private int soSP;

	public NhanVienKinhDoanh() {
		
	}
	public NhanVienKinhDoanh(int soSP, double heSo) {
		super(heSo);
		this.soSP = soSP;
	}
	@Override
	public double TinhLuong() {
		// TODO Auto-generated method stub
		return super.TinhLuong()+(this.soSP*20000);
	}
	
	
}
