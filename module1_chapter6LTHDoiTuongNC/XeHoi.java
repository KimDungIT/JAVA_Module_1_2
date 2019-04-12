package module1_chapter6LTHDoiTuongNC;

public class XeHoi implements DongCo, PhuongTienGiaoThong {
	private String tenXe;
	private String hangSX;
	
	

	public XeHoi() {
		
	}

	public XeHoi(String tenXe, String hangSX) {
		super();
		this.tenXe = tenXe;
		this.hangSX = hangSX;
	}

	
	public String getTenXe() {
		return tenXe;
	}

	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}

	public String getHangSX() {
		return hangSX;
	}

	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}

	@Override
	public double tinhVanToc(double QuangDuong, double ThoiGian) {
		// TODO Auto-generated method stub
		return QuangDuong/ThoiGian;
	}

	@Override
	public double tinhTieuThuNhienLieu(double QuangDuong, double SoLit) {
		// TODO Auto-generated method stub
		return QuangDuong/SoLit;
	}
	
	

}
