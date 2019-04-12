package module1_chapter6LTHDoiTuongNC;

public class TauThuy implements PhuongTienGiaoThong, DongCo {

	
	private double vanTocXuoi;
	private double vanTocNguoc;
	private double nhienLieuTieuHao;
	
	public TauThuy() {
		
	}

	public TauThuy(double vanTocXuoi, double vanTocNguoc, double nhienLieuTieuHao) {
		super();
		this.vanTocXuoi = vanTocXuoi;
		this.vanTocNguoc = vanTocNguoc;
		this.nhienLieuTieuHao = nhienLieuTieuHao;
	}

	
	public double getVanTocXuoi() {
		return vanTocXuoi;
	}

	public void setVanTocXuoi(double vanTocXuoi) {
		this.vanTocXuoi = vanTocXuoi;
	}

	public double getVanTocNguoc() {
		return vanTocNguoc;
	}

	public void setVanTocNguoc(double vanTocNguoc) {
		this.vanTocNguoc = vanTocNguoc;
	}

	public double getNhienLieuTieuHao() {
		return nhienLieuTieuHao;
	}

	public void setNhienLieuTieuHao(double nhienLieuTieuHao) {
		this.nhienLieuTieuHao = nhienLieuTieuHao;
	}

	@Override
	public double tinhTieuThuNhienLieu(double QuangDuong, double SoLit) {
		// TODO Auto-generated method stub
		return QuangDuong/(SoLit - this.nhienLieuTieuHao);
	}

	@Override
	public double tinhVanToc(double QuangDuong, double ThoiGian) {
		// TODO Auto-generated method stub
		return QuangDuong/ThoiGian + this.vanTocXuoi - this.vanTocNguoc;
	}

}
