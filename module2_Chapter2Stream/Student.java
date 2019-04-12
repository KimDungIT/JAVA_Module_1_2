package module2_Chapter2Stream;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private double mark1;
	private double mark2;
	
	public Student()
	{
		
	}

	public Student(String firstName, String lastName, int age, double mark1, double mark2) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}

	public double DiemTB()
	{
		return (mark1+mark2)/2;
	}
	@Override
	public String toString() {
		
		return "First name: "+this.getFirstName() +", "+"Last Name: "+this.lastName +", "+"Age: "+this.getAge()+", "+
				"Mark1: "+this.getMark1()+", "+"Mark2: "+this.getMark2()+", "+"TB: "+this.DiemTB()+"\n";
	}
	
}
