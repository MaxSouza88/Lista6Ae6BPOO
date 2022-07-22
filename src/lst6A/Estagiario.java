import java.util.ArrayList;
import java.util.Scanner;

public class Estagiario {

    Scanner estagiario = new Scanner(System.in);

    String nome;
    String bolsa;

    public Estagiario(String nome) {
        this.nome = nome;
        this.bolsa = bolsa;
    }

    public void salarioEstag(){
        System.out.println("Estagiário não recebe salário.");
        System.out.println("Recebe bolsa");
        System.out.println("Informe o valor da Bolsa");
        double sal1 = estagiario.nextDouble();
        double salarioBruto = (sal1 * 0.1) + sal1;
        System.out.println("O novo valor da Bolsa é:" +salarioBruto);
    }


    }
