import java.util.ArrayList;
import java.util.List;

public class Professores extends Funcionarios{

    List<Turma> turmas = new ArrayList<>();


    String nivelGraduacao;
    String disciplinaMinistrada;
    String qtdeAlunos;
    int qtdeTurmas;
    int numTurmas;
    int totalTurmas;




    public Professores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelGraduacao, String disciplinaMinistrada, String qtdeAlunos, int qtdeTurmas, int numTurmas) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdeAlunos = qtdeAlunos;
        this.qtdeTurmas = qtdeTurmas;
        this.numTurmas = numTurmas;
        this.totalTurmas = totalTurmas;
    }

    public void adicionaTurma(Turma turma){
        this.turmas.add(turma);
    }

    public List<Turma> mostrarTurmas(){
        return this.turmas;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public String getQtdeAlunos() {
        return qtdeAlunos;
    }

    public void setQtdeAlunos(String qtdeAlunos) {
        this.qtdeAlunos = qtdeAlunos;
    }

    public int getQtdeTurmas() {
        return qtdeTurmas;
    }

    public void setQtdeTurmas(int qtdeTurmas) {
        this.qtdeTurmas = qtdeTurmas;
    }

    public int getNumTurmas() {
        return numTurmas;
    }

    public void setNumTurmas(int numTurmas) {
        this.numTurmas = numTurmas;
    }

    public int getTotalTurmas() {
        return totalTurmas;
    }

    public void setTotalTurmas(int totalTurmas) {
        this.totalTurmas = totalTurmas;
    }

    public void adicionaTurma(){
        totalTurmas = qtdeTurmas + numTurmas;
    }

    public double aumentoSalario(){
        double salarioBruto = (salario * 0.1) + salario;
        return salarioBruto;
    }


}
