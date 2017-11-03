package gov.scdhhs.sample.java.app;

import java.util.Arrays;
import java.util.List;

public class MaxValue {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(15, 25, 57, 13, 26, 86, 42, 58, 46, 53, 96, 88, 41, 2, 24);
		
		Integer max = list.stream().reduce(Integer::max).get();

		System.out.println("Max value = " + max);
	}

}
