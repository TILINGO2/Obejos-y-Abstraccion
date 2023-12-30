package ec.edu.puce.interfaces;

public abstract class figuraGeometrica {

    public abstract double calcularArea();

    public boolean mayorQue(figuraGeometrica otraFigura) {
        return this.calcularArea() > otraFigura.calcularArea();
    }

    @Override
    public String toString() {
        return "Área: " + this.calcularArea();
    }
}

