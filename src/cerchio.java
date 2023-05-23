public class cerchio {
	
	double diametro;
	double area;
	double perimetro;
	
	
	public cerchio(double diametro, double area, double perimetro) {
		
		this.diametro=diametro;
		this.area=area;
		this.perimetro=perimetro;
		
	}
	
	
	public void calcoloDiametro(double r) {
	
		diametro=r*2;
		
	}
	
	public void calcoloArea(double r) {
		
		area=r*r*3.14;
			
	}
	
	public void calcoloPerimetro(double r) {
		
		perimetro=2*3.14*r;
			
	}
	
	public void stampa() {
		
		System.out.println("diamtero: "+diametro);
		System.out.println("area: "+area);
		System.out.println("perimetro: "+perimetro+"\n");
		
	}
}