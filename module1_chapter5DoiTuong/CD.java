package module1_chapter5DoiTuong;

public class CD {
	
	private String maCD;
	private String tenCD;
	private String tenCaSi;
	private int soBaiHat;
	private double giaThanh;
	public CD() {
		
	}
	public CD(String maCD, String tenCD, String tenCaSi, int soBaiHat, double giaThanh) {
		
		this.maCD = maCD;
		this.tenCD = tenCD;
		this.tenCaSi = tenCaSi;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String maCD) {
		this.maCD = maCD;
	}
	public String getTenCD() {
		return tenCD;
	}
	public void setTenCD(String tenCD) {
		this.tenCD = tenCD;
	}
	public String getTenCaSi() {
		return tenCaSi;
	}
	public void setTenCaSi(String tenCaSi) {
		this.tenCaSi = tenCaSi;
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return maCD+"-"+tenCD+"-"+tenCaSi+"-"+soBaiHat+"-"+giaThanh;
	}
	

}
