import java.util.Scanner;

public class Mainfiguras {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       Circulo circulo = new Circulo();

        System.out.println("Informe tamanho do raio");
        double raio = input.nextDouble();

        double c1 = circulo.calcularArea();
        double c2 = circulo.calcularPerimetro();

     System.out.println(c1);
     System.out.println(c2);





    }

}
