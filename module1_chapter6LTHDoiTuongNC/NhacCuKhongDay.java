package module1_chapter6LTHDoiTuongNC;

public class NhacCuKhongDay extends NhacCu {
	
	private String suDung;
	
	public NhacCuKhongDay()
	{
		
	}

	
	public NhacCuKhongDay(String suDung, String tenNhacCu,String tenHinh) {
		super(tenNhacCu, tenHinh);
		this.suDung = suDung;
	}


	public String getSuDung() {
		return suDung;
	}


	public void setSuDung(String suDung) {
		this.suDung = suDung;
	}


	@Override
	public String ChoiNhac() {
		// TODO Auto-generated method stub
		return "Phát ra âm thanh khi tác động vào"+" "+this.getSuDung();
	}

}
