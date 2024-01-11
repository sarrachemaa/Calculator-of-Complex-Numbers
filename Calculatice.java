package calcu;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Calculatice extends JFrame {
	
	
	JButton b1 ; 
	JButton b2 ; 
	
	
	JButton b3 ; 
	JButton b4 ;
	
	JButton b5 ; 
	JButton b6 ;
	
	JTextField t1re ; 
	JTextField t1im ; 
	JTextField t2re ; 
	JTextField t2im ; 
	JTextField trre ; 
	JTextField trim ;
	JTextField targ ; 
	
	JLabel l0;//arg
	JLabel L3 ;//pi
	JLabel l1 ; //nbr1
	JLabel l3 ; //nbr2
	JLabel l5 ;// res
	JLabel L10 ;//i nbr 1
	JLabel L11 ;//i res
	JLabel L12 ;//i nbr 2
	

	
	JPanel pOperation  ; 
	JPanel pSaisi;
	JPanel p1re, p1im , p2re, p2im ,prre , prim, parg ; 
    
	
	
	
	
	
	
	public Calculatice()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1 = new JButton(" + "); 
		b2  = new JButton("-" ) ;
		
		b3  = new JButton("module" ) ;
		b4  = new JButton("argument" ) ;
		
		b5  = new JButton("*" ) ;
		b6 = new JButton("/" ) ;
		
		t1im = new JTextField(5) ; 
		t1re = new JTextField(5) ; 
		t2im = new JTextField(5) ; 
		t2re = new JTextField(5) ; 
		trre = new JTextField(5) ; 
		trim = new JTextField(5) ; 
		targ = new JTextField(5) ; 
		
		l0= new JLabel("l argument : ") ;
		L3= new JLabel("pi / ") ;
		l1 = new JLabel("The first complex nember") ;  
		L10 = new JLabel("i") ; 
		l3 = new JLabel("The second complex nember") ; 
		L12 = new JLabel("i") ;
		l5 = new JLabel("The resulting complex number") ; 
		L11 = new JLabel("i ") ; 
		p1im = new JPanel() ; 
		p1re = new JPanel() ; 
		pOperation  = new JPanel() ; 
		pSaisi = new JPanel() ; 
		p2im = new JPanel() ; 
		p2re = new JPanel() ;
		prim = new JPanel() ; 
		prre = new JPanel() ; 
		parg = new JPanel() ; 
		
		
		//
		p1re.setLayout(new FlowLayout());  // pardefaut
		
		p1re.add(l1); 
		p1re.add(t1re) ;
		p1re.add(L10); 
		p1re.add(t1im) ;
		
		p2re.add(l3); 
		p2re.add(t2re) ;
		p2re.add(L12); 
		p2re.add(t2im) ;
		
		prre.add(l5); 
		prre.add(trre) ;
		prre.add(L11); 
		prre.add(trim) ;
		
		parg.add(l0);
		parg.add(L3);
		parg.add(targ);
		
		
		//pSaisi.setLayout(new BoxLayout(pSaisi, BoxLayout.Y_AXIS));
		pSaisi.setLayout(new GridLayout(6,1));
		
		pSaisi.add(p1re);
		pSaisi.add(p1im);
		
		pSaisi.add(p2re);
		pSaisi.add(p2im);
		
		pSaisi.add(prre);
		pSaisi.add(prim);
		
		pSaisi.add(parg);
		
		pOperation.add(b1);
		pOperation.add(b2) ; 
		pOperation.add(b3) ; 
		pOperation.add(b4) ;
		pOperation.add(b5) ; 
		pOperation.add(b6) ;
		
		setLayout(new FlowLayout());
		add(pSaisi) ; 
		add(pOperation);
		
		//***********leeees oooperaaaatioooon*****************************************************************************************
		
	//******************************************************************************************************************************************	
		// laditionnnnnnnnnnnnnnnnnn
		
		b1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
				Complex c1,c2,c3; 
				
				// creation du 1er nombre 
				double n1re,n1im ;
				String s1  = t1re.getText() ; 
				n1re = Double.parseDouble(s1);
				String s2  = t1im.getText() ; 
				n1im = Double.parseDouble(s2);
				c1= new Complex(n1re ,n1im ); // ccc
				
				// creation du 2eme nombre 
				double n2re,n2im ;
				String s3  = t2re.getText() ; 
				n2re = Double.parseDouble(s3);
				String s4  = t2im.getText() ; 
				n2im = Double.parseDouble(s4);
				c2= new Complex(n2re ,n2im ); // ccc
				
				
				c3 = c1.aditionner(c2);
				double nrre , nrim;  
				nrre = c3.getRe();
				nrim = c3.getIm();
				String ss1 ,ss2 ;
				ss1 = Double.toString(nrre);
				ss2 = Double.toString(nrim);
				trre.setText(ss1);
				trim.setText(ss2);
			}
		});
		
		b1.addMouseListener(new MouseListener() {
			
			
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			
			public void mouseExited(MouseEvent e) {
				
				b1.setBackground(Color.green);
			}
			
			
			public void mouseEntered(MouseEvent e) {
				
				b1.setBackground(Color.cyan);
			}
			
			
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		pack() ; 
		
		//soustraaaa
//********************************************************************************************************************************************		
		b2.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				Complex c4,c5,c6; 
				
				// creation du 1er nombre 
				double n1re,n1im ;
				String s1  = t1re.getText() ; 
				n1re = Double.parseDouble(s1);
				String s2  = t1im.getText() ; 
				n1im = Double.parseDouble(s2);
				c4= new Complex(n1re ,n1im ); // ccc
				
				// creation du 2eme nombre 
				double n2re,n2im ;
				String s3  = t2re.getText() ; 
				n2re = Double.parseDouble(s3);
				String s4  = t2im.getText() ; 
				n2im = Double.parseDouble(s4);
				c5= new Complex(n2re ,n2im ); // ccc
				
				
				c6 = c4.soustraire(c5);
				
				double nrre , nrim;  
				nrre = c6.getRe();
				nrim = c6.getIm();
				String ss1 ,ss2 ;
				ss1 = Double.toString(nrre);
				ss2 = Double.toString(nrim);
				trre.setText(ss1);
				trim.setText(ss2);
			}
		});
		
		b2.addMouseListener(new MouseListener() {
			
			
			
			
			
				
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			
			public void mouseExited(MouseEvent e) {
			
				b2.setBackground(Color.green);
			}
			
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				b1.setBackground(Color.cyan);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		pack() ; 
		//le moduuuuuule
//************************************************************************************************************************************************************		
		b3.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				Complex c7; 
				
				// creation du 1er nombre 
				double n1re,n1im ;
				String s1  = t1re.getText() ; 
				n1re = Double.parseDouble(s1);
				
				String s2  = t1im.getText() ; 
				n1im = Double.parseDouble(s2);
				
				c7= new Complex(n1re ,n1im ); // ccc
				
				 double c9 = c7.module();
				
				
				
				double nrre;  
				
				String ss1 ,ss2 ;
				ss1 = Double.toString(c9);
				;
				trre.setText(ss1);
				
			}
		});
		
		b3.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				b1.setBackground(Color.green);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				b1.setBackground(Color.cyan);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		pack() ; 
		//***************************************************************************************************************
		//***************************argument
b4.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				Complex c7; 
				
				// creation du 1er nombre 
				double n1re,n1im ;
				String s1  = t1re.getText() ; 
				n1re = Double.parseDouble(s1);
				
				String s2  = t1im.getText() ; 
				n1im = Double.parseDouble(s2);
				
				c7= new Complex(n1re ,n1im ); // ccc
				
				
				 double c9 = c7.argument();
				
				
				
				double nrre;  
				
				String ss1 ,ss2 ;
				ss1 = Double.toString(c9);
				;
				targ.setText(ss1);
				
			}
		});
		
		b4.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				b1.setBackground(Color.green);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				b1.setBackground(Color.cyan);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		pack() ;
		//**************************************************************************************************************
		//la multiplication
b5.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				Complex c1,c2,c3; 
				
				// creation du 1er nombre 
				double n1re,n1im ;
				String s1  = t1re.getText() ; 
				n1re = Double.parseDouble(s1);
				String s2  = t1im.getText() ; 
				n1im = Double.parseDouble(s2);
				c1= new Complex(n1re ,n1im ); // ccc
				
				// creation du 2eme nombre 
				double n2re,n2im ;
				String s3  = t2re.getText() ; 
				n2re = Double.parseDouble(s3);
				String s4  = t2im.getText() ; 
				n2im = Double.parseDouble(s4);
				c2= new Complex(n2re ,n2im ); // ccc
				
				
				c3 = c1.multiplication(c2);
				double nrre , nrim;  
				nrre = c3.getRe();
				nrim = c3.getIm();
				String ss1 ,ss2 ;
				ss1 = Double.toString(nrre);
				ss2 = Double.toString(nrim);
				trre.setText(ss1);
				trim.setText(ss2);
			}
		});
		
		b5.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				b5.setBackground(Color.green);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				b5.setBackground(Color.cyan);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		pack() ; 
		
		
		//******************************************************************
		//divi
		
		b6.addActionListener(new ActionListener() {
					
					
					public void actionPerformed(ActionEvent e) {
						
						Complex c1,c2,c3,c4; 
						
						// creation du 1er nombre 
						double n1re,n1im ;
						String s1  = t1re.getText() ; 
						n1re = Double.parseDouble(s1);
						String s2  = t1im.getText() ; 
						n1im = Double.parseDouble(s2);
						c1= new Complex(n1re ,n1im ); // ccc
						
						// creation du 2eme nombre 
						double n2re,n2im ;
						String s3  = t2re.getText() ; 
						n2re = Double.parseDouble(s3);
						String s4  = t2im.getText() ; 
						n2im = Double.parseDouble(s4);
						c2= new Complex(n2re ,n2im ); // ccc
						
						
						
						c3 = c1.divid(c2);
						double nrre , nrim;  
						nrre = c3.getRe();
						nrim = c3.getIm();
						String ss1 ,ss2 ;
						ss1 = Double.toString(nrre);
						ss2 = Double.toString(nrim);
						trre.setText(ss1);
						trim.setText(ss2);
					}
				});
		
		
				
				b6.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						b5.setBackground(Color.green);
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						b6.setBackground(Color.cyan);
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				
				pack() ; 
				
				
				
		
		
		
	}
	public static void main(String[] args) {
		
		Calculatice c1 = new Calculatice() ; 
		Calculatice c4 = new Calculatice() ; 
		c4.setVisible(true);
		c1.setVisible(true);
		
		
	}}
	
	