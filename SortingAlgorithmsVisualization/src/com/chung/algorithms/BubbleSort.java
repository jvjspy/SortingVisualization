package com.chung.algorithms;


public class BubbleSort extends Sort{

	@Override
	public void sort() {
		int n=data.length;
		for(int i=0;i<n;i++){
			for(int j=n-1;j>i;j--){
				if(data[j]<data[i]){
					int t=data[j];
					data[j]=data[i];
					data[i]=t;
					addState(data);
				}
			}
		}
	}

}

























