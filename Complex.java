package calcu;

public class Complex {
	protected double  re ; 
	protected double im ;
	public Complex(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	}
	
	public Complex() {
		// TODO Auto-generated constructor stub

	}
	public double getRe() {
		return re;
	}
	public void setRe(double re) {
		this.re = re;
	}
	public double getIm() {
		return im;
	}
	public void setIm(double im) {
		this.im = im;
	} 
	
	public Complex  aditionner (Complex autre)
	{
		Complex result = new Complex();
		result.re = re + autre .re ; 
		result.im = im  + autre.im ; 
		return result ; 
	}
	public Complex  soustraire (Complex autre)
	{
		Complex result = new Complex();
		result.re = re - autre .re ; 
		result.im = im  - autre.im ; 
		return result ; 
	}
	//Le module
			public double module() {
				
				return Math.sqrt(re*re+im*im);//2+3i=4+9i
			}
			static final double pi=3.14;
			
		//l'argument
			public double argument() {
				
				double result = 0;
				double r=module();
				double cos= re/r;
				double sin= im/r;
				if(sin==0 && cos==1) {
				result=0;
				
				}else if( sin==1/2 && cos==(Math.sqrt(3))/2) {
					result=6;
				}
				else if( sin==(Math.sqrt(2))/2 && cos==(Math.sqrt(2))/2) {
					result=4;}
				
				else if( sin==(Math.sqrt(3))/2 && cos==1/2) {
					result=3;}
				
				else if( sin==1 && cos==0 ) {
					result=2;}
				
				return result;
				
			}
			
			
		//multiplication (2+3i)*(3+4i)=6-12+8i+9i
			public Complex multiplication(Complex autre) {
				Complex result = new Complex();
				
				result.re=re*autre.re-im*autre.im;//2*3-3i*4i=6-12
				result.im=re*autre.im+im*autre.re;//2*4i+3i*3=8i+9i
				return result;
			}
			
			//division
			public Complex divid(Complex autre)
			{
				Complex result = new Complex();
				
				
				double a=re*autre.re+im*autre.im;
				double b =re*autre.im*(-1)+im*autre.re;
				
				result.re =a/(re+autre.im);
				result .im =b/(re+autre.im);
				return  result;
				}
			
			//algebriiiiiiq
			public Complex agebrique(Complex autre) {
				
				Complex result = new Complex();
				if((re !=0) && (im !=0) && (autre.re !=0) && (autre.im !=0) ) {
					double a=re*autre.re+im*autre.im;
					double b =re*autre.im*(-1)+im*autre.re;
					
					result.re =a/(re+autre.im);
					result .im =b/(re+autre.im);
					
				}
				
				return result;
				
			}
				//affichage
			
				public void afficher() {
					
					
					
					
						if(im>0)
						{System.out.println(re+"+ i"+im);}
					
					else
						{System.out.println(re+"- i"+im);}
						
					
					
					
					
				}
			}


