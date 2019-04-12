package module2_Chapter2Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SreamInstance {
	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.of(1,2,3,4,5);
		Stream<Integer> s2= Arrays.stream(new Integer[]{1,2,3});
		s2.forEach(e ->System.out.println(e));
		
		List<Double> list = Arrays.asList(1.1,2.2,3.3);
		Stream<Double> s3 = list.stream();
		s3.forEach(e ->System.out.println(e));
		
		
		
	}

}
