package co.methods;

import java.util.Arrays;
import java.util.List;

public class SecondLargestElement {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10,20,30,40,50);
		//int res = num.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
		int res = num.stream().sorted().skip(num.size()-2).findFirst().get();
		System.out.println("The second largest num is "+res);
	}

}
