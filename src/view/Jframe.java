package view;

import java.awt.Color; 
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;



public class Jframe extends JFrame
	{		
		private int height;
		private int width;		
		private Graphics g;
		
		 public Jframe() {
			 System.out.println(height);
			 System.out.println(width);
		        initUI();
		        
		        //this.height = Jframe.HEIGHT;
		        //this.width = Jframe.WIDTH;
		        //drawLigne(g);
		    }

		 private void initUI()  
		 {
			 GridLayout gl = new GridLayout();
		        gl.setColumns(4);
		        gl.setRows(4);
		        setTitle("Simple example");
		        setSize(700, 500);
		        setLocationRelativeTo(null);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //modifié pour autoriser la fermeture, mais laisser do nothing on close apres et executer une procedure de sauvegarde avant !
		        addWindowListener(new WindowAdapter() 
		        {
		        	@Override
		            public void windowClosing(WindowEvent event) { 
		                exitProcedure();
		                dispose();
		                System.exit(0);
		            }
		        });	       
		        this.setLayout(new GridLayout(4, 4));

		        //On ajoute le bouton au content pane de la JFrame

		        this.getContentPane().add(new JButton("1"));

		        this.getContentPane().add(new JButton("2"));

		        this.getContentPane().add(new JButton("3"));

		        this.getContentPane().add(new JButton("4"));

		        this.getContentPane().add(new JButton("5"));
		        this.getContentPane().add(new JButton("5"));
		        this.getContentPane().add(new JButton("5"));
		        this.getContentPane().add(new JButton("5"));
		        this.getContentPane().add(new JButton("5"));
		        this.getContentPane().add(new JButton("5"));
		        this.getContentPane().add(new JButton("5"));
		        this.getContentPane().add(new JButton("5"));
		        this.getContentPane().add(new JButton("5"));
		        this.getContentPane().add(new JButton("5"));
		        this.getContentPane().add(new JButton("5"));
		        this.getContentPane().add(new JButton("5"));

		        this.setVisible(true);
		 }
		 
		 		

		 			private void drawLigne(Graphics g){
		 			int	x1 = width-width +1;
		 			int	x2 = width;
		 			int	y1 = height - height +1;
		 			int	y2 = height;
		 			System.out.println(x1);
		 			System.out.println(x2);
		 			System.out.println(y1);
		 			System.out.println(y2);
		 				g.drawLine(x1,y1,x2,y2);
		 			}
		 
					private void exitProcedure()
					{
						// TODO Auto-generated method stub
						
					}
		                //ici nous mettrons les instructions effectuées avant la fermeture de la fenêtre
		            
		        }

		  


