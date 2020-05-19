package com.in28minutes.spring.basics.springin5steps.basics;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int [] numbers) {
		System.out.println("quick-sort");
		return numbers;
	}
}
