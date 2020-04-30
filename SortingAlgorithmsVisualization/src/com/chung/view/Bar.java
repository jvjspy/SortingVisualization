package com.chung.view;

import java.awt.Color;
import java.awt.Graphics;


public class Bar {
	private int barWidth,value;
	private Color color;
	public Bar(int v,int bw,Color c){
		value=v;
		barWidth=bw;
		color=c;
	}
	public int getValue(){
		return value;
	}
	public void drawBar(Graphics g,int x,int y){
		g.setColor(color);
		y-=value;
		g.fillRect(x, y, barWidth, value);
		String str=String.valueOf(value);
		int w=g.getFontMetrics().stringWidth(str);
		g.setColor(Color.BLACK);
		g.drawString(str, x+(barWidth-w)/2, y-5);
	}
}

























