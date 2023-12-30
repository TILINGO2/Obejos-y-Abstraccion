package ec.edu.puce.interfaces;

public class Triangulo implements figuraGeometrica {
	
	private double base;
	private double altura;


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
