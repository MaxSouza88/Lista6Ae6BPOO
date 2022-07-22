import java.util.ArrayList;
import java.util.Scanner;

public class MainEscola {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        Professores professor = new Professores("Pedro", "005", "8122", "CPS", 5000);
        Coordenadores coordenadores = new Coordenadores("Carlos", "2218", "8222", "CPS", 5500);
        FuncionariosAdm funcionariosAdm = new FuncionariosAdm("Joao", "3399", "2255", "ADM", 1800, "Auxiliar", "Junior");
        Estagiario estagiario = new Estagiario("a");
        Turma turma = new Turma("Turma A");

        /*boolean opcao = true;

        while (opcao) {
            System.out.println("Digite a opção desejada");
            System.out.println(" 1 - Para cadastrar Professor(es) e adicioná-los à Supervisão ");
            System.out.println(" 2 - Verificar lista dos Professores cadastrados ");
            System.out.println(" 3 - Excluir Professor da lista de Supervisão ");
            System.out.println(" 4 - Calcular aumento de Salário ");
            System.out.println(" 5 - Professores: Cadastrar uma Turma ");
            System.out.println(" 6 - Professores: Consultar Turmas cadastradas ");
            System.out.println(" 7 - Professores: Excluir Turma cadastradas ");
            System.out.println(" 8 - Para cadastrar estagiário ");
            System.out.println(" 9 - Para sair do Programa ");

            int escolha = input.nextInt();

            switch (escolha) {

                case 1:
                    coordenadores.cadastraProfessor();
                    break;

                case 2:
                    coordenadores.exibeProfessorCadastrado();
                    break;

                case 3:
                    coordenadores.excluirProfessor();
                    break;

                case 4:
                    System.out.println("Digite a opção: ");
                    System.out.println("1 - Coordenador: ");
                    System.out.println("2 - Professor: ");
                    System.out.println("3 - Funcionário ADM: ");
                    System.out.println("4 - Estagiário: ");
                    int esc1 = input.nextInt();

                    switch (esc1) {
                        case 1:
                            coordenadores.aumentoSalario();
                            break;

                        case 2:
                            professor.aumentoSalario();
                            break;

                        case 3:
                            funcionariosAdm.aumentoSalario();
                            break;

                        case 4:
                            estagiario.salarioEstag();
                            break;
                        default:
                            System.out.println("Valor não encontrado, informe novamente");
                    }
                    break;

                case 5:
                    professor.cadastrarTurma();
                    break;

                case 6:
                    professor.mostrarTurmas();
                    break;

                case 7:
                    professor.excluiTurmas();
                    break;

                case 8:
                    professor.cadastraEstagiario();
                    break;

                case 9:
                    System.out.println("Finalizando Programa ....");
                    opcao = false;
                    break;

                default:
                    System.out.println("Valor inválido. Escolha novamente.");

            }
        }*/
        professor.cadastraEstagiario();
       // professor.mostraEstag();

    }
}