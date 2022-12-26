package com.java;

import java.util.Arrays;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(11, 20, 30, 10, 40, 30);

		list.stream().map(p -> p % 2 == 0).forEach(System.out::println);

	}
}