public class Quadrado implements FiguraGeometrica {

    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = this.lado * this.lado;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Informe tamanho do lado");
        double perimetro = (lado * lado) * 2;
        System.out.println("Perímetro do quadrado é: " + perimetro);
        return perimetro;
    }
}
