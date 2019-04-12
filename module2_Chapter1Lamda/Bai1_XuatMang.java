package module2_Chapter1Lamda;

import java.util.Arrays;
import java.util.List;

public class Bai1_XuatMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		/*for(Integer e : list)
		{
			System.out.println(e);
		}*/
		list.forEach(e -> System.out.println(e));

	}

}
