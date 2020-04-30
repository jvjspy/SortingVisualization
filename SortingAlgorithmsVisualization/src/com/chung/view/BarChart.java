package com.chung.view;

import java.awt.Color;
import java.awt.Graphics;


public class BarChart {
	private Bar[] bars;
	private int chartWidth,barWidth;
	private final Color[] colors={Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.BLUE,new Color(75,0,130),new Color(143,0,255)};
	public void setChartWidth(int w){
		chartWidth=w;
	}
	public BarChart(int cw,int bw){
		chartWidth=cw;
		barWidth=bw;
		bars=null;
	}
	public void setData(int [] data){
		int n=data.length;
		bars=new Bar[n];
		for(int i=0;i<n;i++){
			bars[i]=new Bar(data[i],barWidth,colors[data[i]%colors.length]);
		}
	}
	public void drawChart(Graphics g,int x,int y){
		if (bars != null) {
			int vgap = (chartWidth - barWidth * bars.length) / (bars.length + 1);
			g.setColor(Color.GREEN);
			y -= 5;
			g.fillRect(x, y, chartWidth, 5);
			x += vgap;
			bars[0].drawBar(g, x, y);
			x+=vgap+barWidth;
			for(int i=1;i<bars.length;i++){
				bars[i].drawBar(g, x, y);
				g.setColor(Color.RED);
				g.drawLine(x-vgap, y-bars[i-1].getValue(), x, y-bars[i].getValue());
				x+=vgap+barWidth;
			}
		}
	}
}

























