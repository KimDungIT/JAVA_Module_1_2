package module2_Chapter2Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Bai3 {

	public static void main(String[] args) {
		
		//Tạo ra một List kiểu Student có 10 phần tử. 
		//In List 1 vừa tạo
		
		//Create listStudent
		List<Student> listStudent = new ArrayList<Student>();

		//Create students
		Student student1 = new Student("Kim", "Dung", 21, 9, 9.5);
		Student student2 = new Student("Huong", "Dung", 20, 8, 8.5);
		Student student3 = new Student("Ngoc", "Anh", 19, 7, 6.5);
		Student student4 = new Student("Huong", "Chi", 18, 6, 7);
		Student student5 = new Student("Van", "Nam", 17, 5.5, 5);
		
		//add to listStudent
		listStudent.add(student1);
		listStudent.add(student2);
		listStudent.add(student3);
		listStudent.add(student4);
		listStudent.add(student5);
		System.out.println("List of Student:");
		System.out.println(listStudent);
		
		//Cho biết trong danh sách Student này có bao nhiêu bạn có tuổi >=18.
		
		Stream<List<Student>> s1 = Stream.of(listStudent);
		
		long matchingPerson = listStudent.stream().filter(p -> p.getAge()>=18).count();
		System.out.println("So ban co tuoi >=18: " +matchingPerson);
		
		//Cho biết trong danh sách này có bao nhiêu Student nào có firstName bắt đầu là “H”. 
		
		long firtNameStartH = listStudent.stream().filter(p -> p.getFirstName().startsWith("H")).count();
		System.out.println("So Student co firstName bat dau bang 'H': "+firtNameStartH);
		
		//In ra sinh viên đầu tiên trong danh sách có firstName bắt đầu là “H”.
		
		Optional<Student> firtNameStartH2 = listStudent.stream().filter(p->p.getFirstName().startsWith("H")).findFirst();
		System.out.println("Student co firstName bat dau bang 'H': "+"\n"+firtNameStartH2.get());
		
		//Điểm trung bình lớn nhất
		Student TBMax = listStudent.stream().max(Comparator.comparingDouble(Student::DiemTB)).get();
		System.out.println("DTB max: "+ TBMax.DiemTB());
		
		//Điểm trung bình nhỏ nhất
		Student TBMin = listStudent.stream().min(Comparator.comparingDouble(Student::DiemTB)).get();
		System.out.println("DTB min: "+ TBMin.DiemTB());
		
		//Trung bình của điểm các trung bình
		double tongDTB = listStudent.stream().mapToDouble(p ->p.DiemTB()).sum();
		long sopt = listStudent.stream().count();
		double TBDTB = (Double)tongDTB/sopt;
		System.out.println("TBDTB: "+ TBDTB);
		
		//Diem TB >=8
		List<Student> VeryGoodStudent = listStudent.stream().filter(p ->p.DiemTB()>=8).collect(Collectors.toList());
		System.out.println("Student co DTB >=8: "+VeryGoodStudent);
	}

	

	

}
