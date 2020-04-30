package com.chung.model;

import com.chung.algorithms.ISort;
import com.chung.algorithms.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class StateModel{
	private ArrayList<int[]> states;
	private int index;
	private int [] data;
	private ISort algo;
	public StateModel(){
		states=new ArrayList<>();
		index=-1;
		data=null;
		algo=new SelectionSort();
	}
	public ISort getAlgo(){
		return algo;
	}
	public void setAlgo(ISort s){
		ISort old=algo;
		algo=s;
		pcs.firePropertyChange("algo",old,algo);
	}
	public void setData(int [] data){
		this.data=data;
		pcs.firePropertyChange("data",1,2);
	}
	public int [] getData(){
		return data;
	}

	public void sort(){
		if (data != null) {
			states = algo.sort(data);
			index = 0;
		}
	}
	public void nextState(){
		if(index<states.size()-1){
			index++;
			pcs.firePropertyChange("state",1,2);
		}
		if(!hasNext())	pcs.firePropertyChange("done",1,2);
	}
	public void prevState(){
		if(index>0){
			index--;
			pcs.firePropertyChange("state",1,2);
		}
	}
	public int [] getCurrentState(){
		if(index>=0&&index<states.size()){
			return states.get(index);
		}
		return null;
	}
	public boolean hasNext(){
		return index>-1&&index<states.size()-1;
	}
	public boolean hasPrev(){
		return index>0;
	}
	private final PropertyChangeSupport pcs=new PropertyChangeSupport(this);
	public void addChangeListener(PropertyChangeListener listener){
		pcs.addPropertyChangeListener(listener);
	}
	public void removeChangeListener(PropertyChangeListener listener){
		pcs.removePropertyChangeListener(listener);
	}
	public ArrayList<int[]> getI(){
		return states;
	}
}

























