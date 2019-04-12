package module1_chapter6LTHDoiTuongNC;

public class NhacCuCoDay extends NhacCu {

	
	private int soDay;
	
	public NhacCuCoDay()
	{
		
	}
	
	public NhacCuCoDay(int soDay, String tenNhacCu,String tenHinh) {
		super(tenNhacCu, tenHinh);
		this.soDay = soDay;
	}

	public int getSoDay() {
		return soDay;
	}

	public void setSoDay(int soDay) {
		this.soDay = soDay;
	}

	@Override
	public String ChoiNhac() {
		
		return this.getTenNhacCu()+" có "+this.getSoDay()+" dây";
	}

}
