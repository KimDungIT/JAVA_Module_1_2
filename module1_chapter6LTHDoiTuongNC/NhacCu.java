package module1_chapter6LTHDoiTuongNC;

public abstract class NhacCu {
	
	private String tenNhacCu;
	private String tenHinh;
	
	public NhacCu()
	{
		
	}

	public NhacCu(String tenNhacCu, String tenHinh) {
		super();
		this.tenNhacCu = tenNhacCu;
		this.tenHinh = tenHinh;
	}

	public String getTenNhacCu() {
		return tenNhacCu;
	}

	public void setTenNhacCu(String tenNhacCu) {
		this.tenNhacCu = tenNhacCu;
	}

	public String getTenHinh() {
		return tenHinh;
	}

	public void setTenHinh(String tenHinh) {
		this.tenHinh = tenHinh;
	}

	public abstract String ChoiNhac();
	
}
