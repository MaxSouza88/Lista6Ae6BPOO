import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coordenadores extends Funcionarios{

    List<Professores> professores = new ArrayList<>();

    Scanner input = new Scanner(System .in);

    int adicionaProfessor;
    int totalProfessor;
    boolean addProf = true;

    String professoresSupervisionados;

    public Coordenadores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, int adicionaProfessor, int totalProfessor, String professoresSupervisionados) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.adicionaProfessor = adicionaProfessor;
        this.totalProfessor = totalProfessor;
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public String getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(String professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public void adicionaProfessor(){

        for (totalProfessor = 0; totalProfessor < 5; totalProfessor++) {
            System.out.println("Adiciona professor");
            professoresSupervisionados = input.next();

            addProf = true;
        }

        {
            System.out.println("Não pode mais adicionar professor");
            addProf = false;
        }

    }

    public void setAdicionaProfessor(){
        this.adicionaProfessor();
    }

    public List<Professores> mostrarProfessor(){
        return this.professores;
    }

    public double aumentoSalario(){
        double salarioBruto = (salario * 0.05) + salario;
        return salarioBruto;
    }




}
