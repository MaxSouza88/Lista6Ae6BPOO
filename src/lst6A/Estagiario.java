import java.util.ArrayList;
import java.util.Scanner;

public class Estagiario {

    Scanner estagiario = new Scanner(System.in);

    ArrayList<Estagiario> estagiarios = new ArrayList<>();

    String bolsa;
    String reembolsoDespesa;

    public void Estagiario() {
        this.bolsa = bolsa;
        this.reembolsoDespesa = reembolsoDespesa;
    }

    public void salarioEstag(){
        System.out.println("Estagiário não recebe salário.");
        System.out.println("Recebe bolsa");
        System.out.println("Informe o valor da Bolsa");
        double sal1 = estagiario.nextDouble();
        double salarioBruto = (sal1 * 0.1) + sal1;
        System.out.println("O novo valor da Bolsa é:" +salarioBruto);
    }

    public void cadastraEstagiario(){

        if( estagiarios.size() <=2){
            System.out.println("Digite o nome do Estagiário: ");
            String nome = estagiario.nextLine();

            this.estagiarios.add(new Estagiario());

            System.out.println("Estagiário adicionado");

        }else {
            System.out.println("Não é possível mais cadastrar ");
        }



    }
}
