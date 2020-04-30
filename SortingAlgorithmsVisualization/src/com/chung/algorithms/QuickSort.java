package com.chung.algorithms;


public class QuickSort extends Sort{

	@Override
	protected void sort() {
		sortHelper(data,0,data.length-1);
	}
	private void sortHelper(int[] data,int left,int right){
		if(left<right){
			int l=left,r=right,p=data[(l+r)/2];
			while(l<=r){
				while(data[l]<p)	l++;
				while(data[r]>p)	r--;
				if(l<=r){
					int t=data[l];
					data[l]=data[r];
					data[r]=t;
					addState(data);
					l++;
					r--;
				}
			}
			sortHelper(data, left,r);
			sortHelper(data, l, right);
		}
	}
	
}


























