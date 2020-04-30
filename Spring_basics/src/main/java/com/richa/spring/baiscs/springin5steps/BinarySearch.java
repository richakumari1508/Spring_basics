package com.richa.spring.baiscs.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	@Autowired
private SortAlgorithm sortAlgorithm;
public BinarySearch(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
		System.out.println(sortAlgorithm);
	}
public int binarySearch(int a[],int l,int r,int x) {
	//BubbleSort b=new BubbleSort();
	int n[]=sortAlgorithm.sort(a,0,a.length);
	if(r>=l) {
		int m=l+(r-l)/2;
		if(n[m]==x)
			return m;
		if(n[m]>x)
			return binarySearch(n,l,m,x);
		return binarySearch(n,m+1,r,x);
	}
	return -1;
}
}
