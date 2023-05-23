import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
    cerchio calcoloCerchio = new cerchio(0.0,0.0,0.0); 
    
    Scanner in1 = new Scanner(System.in);
    double vRaggio = in1.nextDouble();
    
    calcoloCerchio.calcoloDiametro(vRaggio); 
    calcoloCerchio.calcoloArea(vRaggio); 
    calcoloCerchio.calcoloPerimetro(vRaggio); 
    System.out.println("CERCHIO 1:"); 
    calcoloCerchio.stampa();
    
    double lungR = vRaggio;   
    double vRaggio2 = in1.nextDouble();
    lungR = vRaggio+vRaggio2;
    
    calcoloCerchio.calcoloDiametro(vRaggio2); 
    calcoloCerchio.calcoloArea(vRaggio2); 
    calcoloCerchio.calcoloPerimetro(vRaggio2); 
    System.out.println("CERCHIO 2:"); 
    calcoloCerchio.stampa();
    
    calcoloCerchio.calcoloDiametro(lungR); 
    calcoloCerchio.calcoloArea(lungR); 
    calcoloCerchio.calcoloPerimetro(lungR); 
    System.out.println("CERCHIO 3:"); 
    calcoloCerchio.stampa();
    
}  
}
