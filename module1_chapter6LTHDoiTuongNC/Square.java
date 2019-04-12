package module1_chapter6LTHDoiTuongNC;

public class Square extends Shape {
	
	private double canh;
	

	public Square()
	{
		
	}
	public Square(double canh) {
		
		this.canh = canh;
	}

	
	public double getCanh() {
		return canh;
	}
	public void setCanh(double canh) {
		this.canh = canh;
	}
	@Override
	public double TinhCV() {
		// TODO Auto-generated method stub
		return this.canh*4;
	}

	@Override
	public double TinhDT() {
		// TODO Auto-generated method stub
		return this.canh*this.canh;
	}

}
