package com.chung.algorithms;


import java.util.ArrayList;
import java.util.Arrays;


public abstract class Sort implements ISort{
	
	protected int [] data;
	private ArrayList<int[]> states;
	
	private void inits(int [] a){
		data=Arrays.copyOf(a, a.length);
		states=new ArrayList<>();
		states.add(data);
	}
	protected abstract void sort();
	protected void addState(int [] state){
		this.states.add(Arrays.copyOf(state, state.length));
	}

	@Override
	public ArrayList<int[]> sort(int[] data) {
		inits(data);
		sort();
		return states;
	}
}

























