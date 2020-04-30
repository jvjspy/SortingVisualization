package com.chung.view;

import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class VisualizePanel extends JPanel{

	private BarChart chart;
	public void importData(int [] data){
		chart.setData(data);
	}
	public VisualizePanel() {
		chart=new BarChart(0, 10);
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				chart.setChartWidth(getWidth());
			}
		});
		new Timer(100,(e)->repaint()).start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); 
		chart.drawChart(g, 0, getHeight());
	}
}

























