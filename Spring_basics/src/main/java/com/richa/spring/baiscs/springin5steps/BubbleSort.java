package com.richa.spring.baiscs.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class BubbleSort implements SortAlgorithm {
	
public int [] sort(int a[],int low,int high) {
	for(int i=0;i<high-1;i++)
		for(int j=0;j<high-i-1;j++)
			if(a[j]>a[j+1]) {
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
	return a;
}
}
