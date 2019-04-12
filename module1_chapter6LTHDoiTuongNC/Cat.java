package module1_chapter6LTHDoiTuongNC;

public class Cat extends Animal {

	 @Override
	 public String sayHello() {
	 return "Meo meo meo";
	 }
	 public Cat() {
	 }
	 public Cat(String name, String image) {
		 super(name, image);
	 }
}
