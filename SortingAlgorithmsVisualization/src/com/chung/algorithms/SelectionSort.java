package com.chung.algorithms;

public class SelectionSort extends Sort{

	@Override
	public void sort() {
		int n=data.length;
		for(int i=0;i<n;i++){
			int min=i;
			for(int j=i;j<n;j++){
				if(data[j]<data[min]){
					min=j;
				}
			}
			int tmp=data[i];
			data[i]=data[min];
			data[min]=tmp;
			addState(data);
		}
	}

}

























