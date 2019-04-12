package module1_chapter8LopLongCap;

public class RIOuter {
	
	//Bien thuc the
	private String x ="Hello";
	//method
	public void printOuter()
	{
		System.out.println(x+" Outer Class.");
		Inner in = new Inner();
		in.printInner();
		class Local{
			void call()
			{
				System.out.println(x + " Local class");
			}
		}
		
		Local local = new Local();
		local.call();
		
	}
	/*Modifier*/ class Inner{
		public void printInner()
		{
			System.out.println(x + " Inner Class");
		}
	}
	class Pop
	{
		Inner inner = new Inner(){
			public void printInner()
			{
				System.out.println(x + " Pop Class");
			}
		};
		
	}

}
