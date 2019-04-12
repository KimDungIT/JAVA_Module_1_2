package module1_chapter6LTHDoiTuongNC;

public class Rectangle extends Shape {
	
	private double chieuDai;
	private double chieuRong;
	
	

	public Rectangle() {
		
	}

	
	public Rectangle(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	

	public double getChieuDai() {
		return chieuDai;
	}


	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}


	public double getChieuRong() {
		return chieuRong;
	}


	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}


	@Override
	public double TinhCV() {
		// TODO Auto-generated method stub
		return (this.chieuDai+this.chieuRong)*2;
	}

	@Override
	public double TinhDT() {
		// TODO Auto-generated method stub
		return this.chieuDai*this.chieuRong;
	}

}
