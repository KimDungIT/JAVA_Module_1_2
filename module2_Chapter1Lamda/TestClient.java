package module2_Chapter1Lamda;

import java.util.Arrays;
import java.util.List;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cach 1: tao lopimplement (tuong minh)
		Caculator cal = new CaculatorImpl();
		System.out.println(cal.operator(1, 2));
		
		//cach 2: dung annonymous
		Caculator cal2 =new Caculator(){

			@Override
			public int operator(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
			
		};
		System.out.println(cal2.operator(1, 2));
		Caculator cal3 = (a, b) -> a + b;
		System.out.println(cal3.operator(1, 2));
		Caculator cal4 = (a, b) -> a * b;
		System.out.println(cal4.operator(1, 2));
		
		
		//tao danh sach sinh vien
		Student st1 = new Student(1, 5);
		Student st2 = new Student(2, 6);
		Student st3 = new Student(3, 2);
		
		List<Student> students = Arrays.asList(st1, st2, st3);
		//t1-t2 <0 : t1<t2
		//		=0: t1=t2
		//		>: t1 >t2
		students.sort((t1, t2)->(int)( t1.getScore() - t2.getScore()));
		students.forEach(e->System.out.println(e));
		
	}

}
