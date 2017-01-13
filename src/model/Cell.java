package model;

import java.awt.Color;


public class Cell
	{
		private int myValue;
		private int myPos_x;
		private int myPos_y;
		private Color myColor;
		private Boolean isZero;
		
		public Cell(){
			this.myValue = 0 ;
			this.myPos_x = 0 ;
			this.myPos_y = 0 ;
			this.myColor = Color.GRAY;
			this.isZero = null;
		}
		
		//GETTERS
		
		public int getValue(){
			return myValue;
		}
		
		public int getPos_x(){
			return myPos_x;
		}
		
		public int getPos_y(){
			return myPos_y;
		}
		
		public Color getColor(){
			return myColor;
		}
		
		public boolean getIsZero(){
			return isZero;
		}
		
		// SETTERS
		
		public void setValue(int value){
			this.myValue = value;
		}
		
		public void setPos_x(int pos_x){
			this.myPos_x = pos_x;
		}
		
		public void setPos_y(int pos_y){
			this.myPos_y = pos_y;
		}
		
		public void setColor(Color color){
			this.myColor = color;
		}
		
		public void setIsZero(boolean isZero){
			this.isZero = isZero;
		}
		
		
	}
