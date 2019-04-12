
package module2_Chapter1Lamda;

public class Student {

	private int id;
	private double score;
	public Student(int id, double score) {
		super();
		this.id = id;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "="+ score;
	}
	
	
}
