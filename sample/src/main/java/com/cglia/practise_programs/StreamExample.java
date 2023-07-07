package com.cglia.practise_programs;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		long start = System.currentTimeMillis();

		int sum = numbers.stream().mapToInt(x -> x).sum();

		long end = System.currentTimeMillis();

		System.out.println("Sum = " + sum);

		System.out.println("Time taken = " + (end - start) + " milliseconds");

	}
}
