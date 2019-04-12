package vd1;

import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hello";
		String s4 ="Hello";
		//s4.concat("world"); tra ve "Hello"
		s4 = s4.concat("world");
		System.out.println(s4);
		
		//StringTokenizer
		String email="kimdung@gmail.com";
		StringTokenizer st = new StringTokenizer(email, "@");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		//
		String str = "Lap Trinh Java";
		StringTokenizer st2 = new StringTokenizer(str);
		//duyet cac token
		System.out.println(st2.countTokens());
		
		//ko nen dung vong lap for
		//i=0, c=3, nextToken() ->Lap
		//i=1, c=2, nextToken() ->Trinh
		//i=2, c=1 ->thoat vong lap
		/*for(int i=0;i<st2.countTokens();i++)
		{
			System.out.println(st2.nextToken());
		}*/
		while(st2.hasMoreTokens())
		{
			System.out.println(st2.nextToken());
		}
		
	}

}
