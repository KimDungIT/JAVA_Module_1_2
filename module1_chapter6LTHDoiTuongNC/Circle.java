package module1_chapter6LTHDoiTuongNC;

public class Circle extends Shape {
	
	
	private double R;
	
	public Circle()
	{
		
	}

	public Circle(double r) {
		super();
		R = r;
	}

	public double getR() {
		return R;
	}

	public void setR(double r) {
		R = r;
	}

	@Override
	public double TinhCV() {
		// TODO Auto-generated method stub
		return Math.PI*2*this.R;
	}

	@Override
	public double TinhDT() {
		// TODO Auto-generated method stub
		return Math.PI*this.R*this.R;
	}
	
	

}
