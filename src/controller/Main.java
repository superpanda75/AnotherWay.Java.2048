package controller;



import model.Cell;
import view.Jframe;

import java.awt.EventQueue;

import javax.swing.SwingUtilities;

import model.Cell;
import view.Jframe;
import controller.Main;
import model.Grid;

public class Main implements Runnable
	{
		private Cell maCellule = new Cell();
		private Jframe myFrame = new Jframe();
		
		@Override
	    public void run() {
	        new Cell();
	        new Jframe();
	        new Grid();
	    }

		public static void main(String[] args)
		{
			EventQueue.invokeLater(() -> {
	            Jframe ex = new Jframe();
	            
	            ex.setVisible(true);
	        });

		}

	}
