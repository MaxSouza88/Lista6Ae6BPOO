public class Retangulo implements FiguraGeometrica{

    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (base * altura) * 2;
        return perimetro;
    }
}
