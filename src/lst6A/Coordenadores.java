import java.util.ArrayList;
import java.util.Scanner;

public class Coordenadores extends Universidade {
    Scanner entrada = new Scanner(System.in);
    ArrayList<Professores> professores = new ArrayList<>();

    String professoresSupervisionados;


    public Coordenadores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nome = nome;
        this.CPF = CPF;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;
    }
    public void aumentoSalario(){
        System.out.println("Informe o salário do Coordenador");
        double sal1 = entrada.nextDouble();
        double salarioBruto = (sal1 * 0.05) + sal1;
        System.out.println("O novo salário é: " + salarioBruto);
    }
    public void cadastraProfessor(){

        System.out.println("Informe o nome do professor a ser cadastrado ");
        nome = entrada.nextLine();
        System.out.println("Informe o CPF ");
        CPF = entrada.nextLine();
        System.out.println("Informe o Numero de Registro ");
        numeroDeRegistro = entrada.nextLine();
        System.out.println("Informe o Orgao de Lotação ");
        orgaoDeLotacao = entrada.nextLine();
        System.out.println("Informe o salário ");
        salario = entrada.nextDouble();

        this.professores.add(new Professores(nome,CPF,numeroDeRegistro,orgaoDeLotacao,salario));
    }

    public void exibeProfessorCadastrado(){
        System.out.println("Lista de Professores Cadastrados: ");
        for (int i = 0; i < professores.size(); i++) {
            System.out.println("Nome: " +this.professores.get(i).getNome() + " CPF " +this.professores.get(i).CPF + " Numero de Registro " +this.professores.get(i).numeroDeRegistro + " Orgão de Lotação " +this.professores.get(i).orgaoDeLotacao + " Salário " +this.professores.get(i).salario);
        }
    }
    public void excluirProfessor(){

        Scanner deletaProfessor = new Scanner(System.in);

        System.out.println("Digite o nome do Professor a ser excluido: ");
        String deletar = deletaProfessor.nextLine();

        boolean excluiProf = false;

        for (int i = 0; i < professores.size(); i++) {
            if(this.professores.get(i).getNome().equals(deletar)){
                this.professores.remove(i);
                System.out.println("Professor excluído com Sucesso ....");
                excluiProf = true;
            }
        }
        if (!excluiProf){
            System.out.println("Valor informado inválido, favor verificar...");
        }
    }
    public String getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }
    public void setProfessoresSupervisionados(String professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
