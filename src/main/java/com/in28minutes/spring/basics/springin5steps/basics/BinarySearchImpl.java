package com.in28minutes.spring.basics.springin5steps.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm quickSortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {	
		
		int[] sortedNumbers = quickSortAlgorithm.sort(numbers);
		System.out.println(sortedNumbers);
		
		return 3;
	}
	
	//sorting an array
	//search the array
	//return the result
}
