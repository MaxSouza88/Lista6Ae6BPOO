public class Triangulo implements FiguraGeometrica{

    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = (base * altura) / 2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        return calcularPerimetro();
    }
}
