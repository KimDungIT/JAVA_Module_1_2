package module2_Chapter1Lamda;

import java.util.ArrayList;
import java.util.List;

public class Bai5_SapXepDSChuoi {

	public static void main(String[] args) {
		
		//
		
		List<String> list = new ArrayList<>();
		list.add("Ngọc");
		list.add("Diễm phúc Hoàng");
		list.add("Kim Dung");
		
		// sap theo theo alphabet
		list.sort((x1, x2) -> x1.compareTo(x2));
		//list.forEach(e->System.out.println(e));
		list.forEach(System.out::println);
		System.out.println("\n");
		
		//sap xep theo chieu dai chuoi tu ngan nhat den dai nhat
		list.sort((x1, x2) -> x1.length() - x2.length());
		list.forEach(System.out::println);
		System.out.println("\n");
		//sap xep theo chieu dai chuoi tu dai nhat den ngan nhat
		list.sort((x1, x2) -> x2.length() - x1.length());
		list.forEach(System.out::println);

	}

}
