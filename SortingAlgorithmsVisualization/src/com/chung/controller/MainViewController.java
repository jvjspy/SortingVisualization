package com.chung.controller;


import com.chung.model.StateModel;
import com.chung.view.MainView;
import com.chung.algorithms.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MainViewController implements PropertyChangeListener{

	private MainView view;
	private StateModel model;
	private Timer timer;
	public MainViewController(MainView v,StateModel m){
		view=v;
		model=m;
		timer =new Timer(500, (e)->model.nextState());
		model.addChangeListener(this);
	}
	public void onImportClick(){
		String s=view.getData()+",";
		if(s.matches("(\\d+,)+")){
			int data[]=Arrays.stream(s.split(",")).mapToInt(Integer::parseInt).toArray();
			int id=view.getSelectedId();
			model.setData(data);
			model.setAlgo(SortFactory.getSort(view.getSelectedId()));
			model.sort();
		}else{
			JOptionPane.showMessageDialog(view, "Illegal Data!","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
	public void onGenerateClick(){
		int[] data=new int[40];
		for(int i=0;i<40;i++){
			data[i]=ThreadLocalRandom.current().nextInt(10,view.getVisualizePanel().getHeight());
		}
		model.setData(data);
		model.setAlgo(SortFactory.getSort(view.getSelectedId()));
		model.sort();
	}
	public void onChangeAlgo(){
		model.setAlgo(SortFactory.getSort(view.getSelectedId()));
	}
	public void onPlayClick(){
		timer.start();
		view.getPlaybtn().setEnabled(false);
		view.getStopbtn().setEnabled(true);
	}
	public void onStopClick(){
		timer.stop();
		view.getPlaybtn().setEnabled(true);
		view.getStopbtn().setEnabled(false);
	}
	public void onNextClick(){
		model.nextState();
		if(!model.hasNext()){
			view.getNextbtn().setEnabled(false);
		}
	}
	public void onPrevClick(){
		model.prevState();
		if(!model.hasPrev()){
			view.getPrevbtn().setEnabled(false);
		}
	}
	public void onSpeedChanged(int delay){
		timer.setDelay(delay*10);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		String name=evt.getPropertyName();
		if(name.equals("state")){
			view.getVisualizePanel().importData(model.getCurrentState());
			if(model.hasNext()){
				view.getNextbtn().setEnabled(true);
			}else{
				view.getNextbtn().setEnabled(false);
			}
			if(model.hasPrev()){
				view.getPrevbtn().setEnabled(true);
			}else{
				view.getPrevbtn().setEnabled(false);
			}
		}else if(name.equals("data")){
			view.getVisualizePanel().importData(model.getData());
			view.getPlaybtn().setEnabled(true);
			view.getStopbtn().setEnabled(true);
			view.getNextbtn().setEnabled(true);
			view.getPrevbtn().setEnabled(true);
		}else if(name.equals("algo")&&model.getData()!=null){
			view.getVisualizePanel().importData(model.getData());
			model.sort();
			view.getNextbtn().setEnabled(true);
			timer.stop();
			view.getPlaybtn().setEnabled(true);
			view.getStopbtn().setEnabled(false);
		}else if(name.equals("done")){
			view.getStopbtn().setEnabled(false);
			timer.stop();
		}
	}
}

























