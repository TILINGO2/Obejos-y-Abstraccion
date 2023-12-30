package ec.edu.puce.interfaces;

public class Main {

    public static void main(String[] args) {

      
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setBase(7);
        rectangulo.setAltura(15);

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(6);
        triangulo.setAltura(8);

        Circulo circulo = new Circulo();
        circulo.setRadio(5);

 
        System.out.println("Área del Rectangulo: " + rectangulo.calcularArea());
        System.out.println("Área del Triangulo: " + triangulo.calcularArea());
        System.out.println("Área del Circulo: " + circulo.calcularArea());

 
        System.out.println("\nÁrea del Rectangulo es mayor que el Triangulo: " + rectangulo.mayorQue(triangulo));
        
        

        System.out.println("\nTransformados a string");
        System.out.println(rectangulo.toString());
        System.out.println(triangulo.toString());
        System.out.println(circulo.toString());
    }
}
