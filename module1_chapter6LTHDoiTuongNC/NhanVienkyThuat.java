package module1_chapter6LTHDoiTuongNC;

public class NhanVienkyThuat extends NhanVien {
	
	private int soDA ;

	public NhanVienkyThuat() {
		
	}

	public NhanVienkyThuat(int soDA, double heSo) {
		super(heSo);
		this.soDA = soDA;
	}

	@Override
	public double TinhLuong() {
		// TODO Auto-generated method stub
		return super.TinhLuong()+(soDA * 1000000);
	}
	
	
	

}
