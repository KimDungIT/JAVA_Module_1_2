package module2_Chapter1Lamda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Bai3_TinhDienTich {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Nhap ban kinh r:");
		double r = Double.parseDouble(input.readLine());
		
		Area circle = (x1, x2) ->x1+ Math.pow(x2, 2);
		double kq = circle.calArea(Math.PI, r);
		DecimalFormat df = new DecimalFormat("###.##");
		kq = Double.parseDouble(df.format(kq));
		System.out.println("S = PI * R*R = " + kq);
		
		System.out.println("Nhap chieu dai:");
		double dai = Double.parseDouble(input.readLine());
		System.out.println("Nhap chieu rong:");
		double rong = Double.parseDouble(input.readLine());
		Area rectange = (x3, x4) -> x3*x4;
		System.out.println("S = dai * rong = "+ rectange.calArea(dai, rong));
		
		
		
		
	}

}
