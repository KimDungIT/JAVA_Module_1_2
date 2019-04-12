package module1_chapter8LopLongCap;

public class TestClient {

	public static void main(String[] args) {
		RIOuter.Inner in1 = new RIOuter().new Inner();
		
		//cách 2
		RIOuter outer = new RIOuter();
		RIOuter.Inner in2 = outer.new Inner();
		
		in1.printInner();
		in2.printInner();
		
		outer.printOuter();
		
		RIOuter.Pop pop = new RIOuter().new Pop();
		
		
		
		

	}

}
