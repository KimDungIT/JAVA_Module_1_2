package module2_Chapter2Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bai2 {

	public static void main(String[] args) {
		//Tạo ra một List 1 kiểu Integer có 15 phần tử. In List 1 vừa tạo
		Integer[] list1 = {1, 2, 3, 4, 5, 6, 7, 8,9, 10, 11, 12, 13, 14,15};
		
		List<Integer> listText = Arrays.asList(list1);
		listText.forEach(e -> System.out.println(e));
		
		//Tạo ra List 2 từ List 1 mà giá trị mỗi phần tử của List 2 bằng bình phương giá trị phần tử của List 1.
		//In List 2 vừa tạo
		List<Integer> list2 = listText.stream().map(e ->e*e).collect(Collectors.toList());
		System.out.println("List 2:" + list2);
		
		int max = listText.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Phan tu max: "+max);
		
		int min = listText.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Phan tu min: "+min);
		
		int tong = listText.stream().reduce(0, Integer::sum);
		System.out.println("Tong cac phan tu: "+tong);
		
		//Trung bình của tất cả các phần tử trong List 2
		long sopt = listText.stream().count();
		float tb = tong/sopt; 
		System.out.println("TB cac phan tu: "+tb);
		
		//Tạo ra List 3 từ List 2 mà chỉ lấy các phần tử là số nguyên tố. In List 3 vừa tạo
		List<Integer> list3 = listText.stream().filter(e -> isPrimeNumber(e)).collect(Collectors.toList());
		System.out.println("List3: "+list3);
		
		List<Integer> list4 = listText.stream().filter(e -> isCP(e)).collect(Collectors.toList());
		System.out.println("List4: "+list4);
		

	}
	public static boolean isPrimeNumber(int n) {
		int dem=0;
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dem++;
            }
        }
        if(dem==2)
        {
        	return true;
        }
        else
        {
        	return true;
        }
        	
    }
	public static boolean isCP(int n)
	{
		for(int i=1;i<n;i++)
		{
			if(i*i==n)
			{
				return true;
			}
		}
		return false;
	}


}
