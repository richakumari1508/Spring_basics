package com.richa.spring.baiscs.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		//BinarySearch b=new BinarySearch(new BubbleSort());
		int a[]=new int[] {1,2,7,5,3,10};
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearch binarySearch=applicationContext.getBean(BinarySearch.class);
		int r=binarySearch.binarySearch(a, 0, a.length, 5);
		System.out.println(r);
	}

}
