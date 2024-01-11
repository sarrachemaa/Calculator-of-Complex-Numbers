package calcu;
import java.util.Scanner;
public class Prog {

	public static void main(String[] args) {
		
	 Scanner sc= new Scanner (System.in);
	System.out.println("Entre la  partier reel du nombre 1");
	 double n1re = sc.nextDouble();
	 
	 Scanner ss= new Scanner (System.in);
		System.out.println("Entre la  partier imaginer du nombre 1 ");
		 double n1im = ss.nextDouble();
		 
		  Complex c1= new Complex(n1re, n1im);
		  
		  
		  
		  
		  Scanner se= new Scanner (System.in);
			System.out.println("Entre la  partier reel du nombre 2");
			 double n2re = se.nextDouble();
			 
			 Scanner sd= new Scanner (System.in);
				System.out.println("Entre la  partier imaginer du nombre 2 ");
				 double n2im = sd.nextDouble();
				 
				  Complex c2= new Complex(n2re, n2im);
				  
				  Complex c3=new Complex() ;
				  Complex c4= new Complex();

				 // c3=c1.aditionner(c2);
				//  c4=c1. multiplication(c2);
				//  c3.afficher();
				//  c4.afficher();

				  
				  Scanner sa= new Scanner (System.in);
					System.out.println(" choisi un nbr , 1:add ,2:multiplication ");
					double s = sa.nextDouble();
			        
					if(s==1 ) 
						{
							c3=c1.aditionner(c2);
							c3.afficher();
						}
						 
					else if(s==2) {
						c4=c1. multiplication(c2);
						 c4.afficher();
					}
						

	}

}
