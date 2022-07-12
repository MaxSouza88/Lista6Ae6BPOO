import java.util.Scanner;

public class Mainfiguras {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       System.out.println("Informe tamanho do lado do Quadrado");
        double entradaArea = input.nextDouble();

        Quadrado quadrado1 = new Quadrado(entradaArea);

        double calcArea = quadrado1.calcularArea();

        System.out.println("Área do quadrado é: " + calcArea);


        System.out.println("Informe tamanho da base Retangulo ");
        double base = input.nextDouble();

        System.out.println("Informe tamanho da altura Retangulo ");
        double altura = input.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);

        double areaRet = retangulo.calcularArea();
        double perimRet = retangulo.calcularPerimetro();

        System.out.println("Area retangulo " +areaRet);
        System.out.println("Perimetro retangulo " +perimRet);

        System.out.println("Informe tamanho do raio");
        double raio = input.nextDouble();

        Circulo circulo = new Circulo();

        double areaCirc = circulo.calcularArea();
        double calcPerimetro = circulo.calcularPerimetro();

        System.out.println(areaCirc);
        System.out.println(calcPerimetro);





    }

}
