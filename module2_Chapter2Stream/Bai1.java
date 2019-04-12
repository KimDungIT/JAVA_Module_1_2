package module2_Chapter2Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tao ra danh sach co 15 phan tu (Mang tinh hoac Java List/)
		String[] list1 = {"Hello", "world", "aJava", "programing", "Language", "", "t3h", "pytho", "lambda", "stream"};
		//List<String> list1 = new ArrayList<String>()
		
		//cach 1
		for (String e : list1) {
				
			System.out.println(e);
		}
		System.out.println("============================");
		
		//cach 2: 
		
		List<String> listText = Arrays.asList(list1);
		listText.forEach(e ->System.out.println(e));
		
		//tao stream tu doi tuong mang
		Stream<String> s1 = Stream.of(list1);
		
		//Đếm xem có bao nhiêu phần tử có giá trị “”
		System.out.println("So luong ptu rong "+s1.filter(e -> e.isEmpty()).count());
		
		//Dem nhung phan tu >=5
		Stream<String> s2 = listText.stream();
		System.out.println("So luong nhung ptu co chieu dai >=5: "+s2.filter(e ->e.length()>=5).count());
		
		System.out.println("So luong nhung ptu bat dau bang a: "+ Stream.of(list1).filter(e ->e.startsWith("a")).count());
	
		System.out.println("So luong nhung ptu co gia tri chinh xac... : "+ Stream.of(list1).filter(e ->e.contains("lambda")).count());
		
		//Tao 1 list2 tu list 1
		List<String> list2 = listText.stream().filter(e->!e.isEmpty()).collect(Collectors.toList());
		
		//chuyen list2 sang stream
		//list2.forEach(e ->System.out.println(e));
		list2.stream().forEach(e ->System.out.println(e));
		
		//Tao mot list3 
		
		String list3 = listText.stream().filter(e->e.length()>=3 && e.length()<=6).collect(Collectors.joining(","));
		System.out.println("-----------------------------------------");
		System.out.println(list3);

		//list4
		List<String> list4 =  listText.stream().map(e ->e + "happy").collect(Collectors.toList());
		System.out.println(list4);
		
		
	}

}
