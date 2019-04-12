package module1_chapter5DoiTuong;

public class Phim {
	
	private String tenPhim;
	private String theLoai;
	private String ngayChieu;
	private String rap;
	private String duonDanHinh;
	public Phim(String tenPhim, String theLoai, String ngayChieu, String rap, String duonDanHinh) {
		super();
		this.tenPhim = tenPhim;
		this.theLoai = theLoai;
		this.ngayChieu = ngayChieu;
		this.rap = rap;
		this.duonDanHinh = duonDanHinh;
	}
	public Phim(){
		
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	public String getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(String ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	public String getRap() {
		return rap;
	}
	public void setRap(String rap) {
		this.rap = rap;
	}
	public String getDuonDanHinh() {
		return duonDanHinh;
	}
	public void setDuonDanHinh(String duonDanHinh) {
		this.duonDanHinh = duonDanHinh;
	}
	
	

}
