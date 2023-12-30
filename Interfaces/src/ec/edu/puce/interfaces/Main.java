package ec.edu.puce.interfaces;

public class Main {
	public static void main(String [] args) {
		Rectangulo r1 = new Rectangulo();
		r1.setBase(7);
		r1.setAltura(15);	
		System.out.println("Rectangulo: "+ r1.calcularArea());
		
		Triangulo r2 = new Triangulo();
		r2.setBase(6);
		r2.setAltura(8);
		System.out.println("Triangulo: "+ r2.calcularArea());
		
		Circulo r3 = new Circulo();
		r3.setRadio(5);
		System.out.println("Circulo: "+ r3.calcularArea());
    }

}
