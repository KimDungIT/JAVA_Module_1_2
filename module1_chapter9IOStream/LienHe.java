package module1_chapter9IOStream;

import java.io.Serializable;

public class LienHe implements Serializable{
	
	private String hoten;
	private String dtdd;
	private String hinhAnh;
	
	public LienHe()
	{
		
	}

	public LienHe(String hoten, String dtdd, String hinhAnh) {
		super();
		this.hoten = hoten;
		this.dtdd = dtdd;
		this.hinhAnh = hinhAnh;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getDtdd() {
		return dtdd;
	}

	public void setDtdd(String dtdd) {
		this.dtdd = dtdd;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	
}
