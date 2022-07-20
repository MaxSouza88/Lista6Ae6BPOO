public class Circulo implements FiguraGeometrica{

    double raio;
    double pi;
    double area;
    double perimetro;

    public Circulo() {
        this.raio = raio;
        this.pi = pi;
        this.area = area;
        this.perimetro = perimetro;
    }

    @Override
    public double calcularArea() {
        area = (this.raio * this.pi) * 2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = (this.raio * this.raio) * this.pi;
        return perimetro;
    }
}
