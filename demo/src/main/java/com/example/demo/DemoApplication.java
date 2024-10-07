package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Integer array[] = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		System.out.print(binarySearch(17, 0, 20, array));
	}

	public static String binarySearch(Integer target, Integer start, Integer end, Integer[] array) {
		if (start > end) {
			return "not Found";
		}

		int middle = (int) Math.floor((start + end) / 2);
		System.out.println("running" + middle);

		if (array[middle] == target) {
			return "target found" + target + "in index " + array[middle];
		}

		if (array[middle] > target) {
			return binarySearch(target, start, middle - 1, array);
		}

		if (array[middle] < target) {
			return binarySearch(target, middle + 1, end, array);
		}

		return "aasd";
	}

}
