package com.chung.algorithms;
public class SortFactory {

	private static ISort selection = new SelectionSort(), bubble = new BubbleSort(),insertion=new InsertionSort(),quick=new QuickSort(),
		merge=new MergeSort(),heap=new HeapSort();
	public static ISort getSort(int id) {
		ISort product = null;
		switch (id) {
			case 0:
				product = selection;
				break;
			case 1:
				product = bubble;
				break;
			case 2:
				product=insertion;
				break;
			case 3:
				product=quick;
				break;
			case 4:
				product=merge;
				break;
			case 5:
				product=heap;
				break;
		}
		return product;
	}
}
