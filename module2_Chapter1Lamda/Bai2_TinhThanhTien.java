package module2_Chapter1Lamda;

import java.util.Arrays;
import java.util.List;

public class Bai2_TinhThanhTien {

	public static void main(String[] args) {


		List<Integer> soLuong = Arrays.asList(new Integer[]{2, 3, 5, 7});
		int donGia = 5200;
		
		soLuong.forEach(n -> System.out.println("Thanh tien = " + (n * donGia)+ " vnd"));

	}

}
