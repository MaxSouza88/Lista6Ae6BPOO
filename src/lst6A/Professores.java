import java.util.ArrayList;
import java.util.Scanner;

public class Professores extends Universidade {
    Scanner input = new Scanner(System.in);
    ArrayList<Turma> turmas = new ArrayList<>();
    ArrayList<Estagiario> estagiarios = new ArrayList<>();

    String nivelGraduacao;
    String disciplinaMinistrada;
    String qtdeAlunos;
    int qtdeTurmas;
    int numTurmas;
    int totalTurmas;


    public Professores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nome = nome;
        this.CPF = CPF;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;
    }

    public void aumentoSalario() {

        System.out.println("Informe o salário de Professor");
        double sal1 = input.nextDouble();
        double salarioBruto = (sal1 * 0.1) + sal1;
        System.out.println("O novo salário é: " + salarioBruto);

    }

    public void cadastrarTurma() {

        System.out.println("Digite o nome da Turma a ser cadastrada: ");
        nome = input.nextLine();

        this.turmas.add(new Turma(nome));
    }

    public void mostrarTurmas() {
        System.out.println("Lista de Turmas");
        for (int i = 0; i < this.turmas.size(); i++) {
            System.out.println("Turma cadastrada " + turmas.get(i).nome);

        }
    }

    public void excluiTurmas() {
        System.out.println("Digite o nome da Turma a ser excluída");
        String deletTurma = input.nextLine();

        boolean deletarTurma = false;

        for (int i = 0; i < turmas.size(); i++) {
            if (this.turmas.get(i).getNome().equals(deletTurma)) {
                this.turmas.remove(i);
                System.out.println("Turma excluída com Sucesso ....");
                deletarTurma = true;
            }
        }
        if (!deletarTurma) {
            System.out.println("Valor informado inválido, favor verificar...");
        }
    }

    public void cadastraEstagiario() {

        Scanner estagiario = new Scanner(System.in);
        System.out.println("Digite o nome do Estagiário: ");
        String nome = estagiario.nextLine();
        this.estagiarios.add(new Estagiario(nome));

        /*for (int i = 0; i < this.estagiarios.size(); i++) {
            if (estagiarios.size() > 2) {
                System.out.println("Estagiário adicionado");
            } else {
                System.out.println("Não é possível mais cadastrar ");
            }*/
        }

        /*public void mostraEstag(){
            for (int i = 0; i < this.estagiarios.size(); i++) {
                System.out.println(this.estagiarios.get(i).nome);

            }

        }*/

    }
