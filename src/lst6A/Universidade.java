public abstract class Universidade {

    String nome;
    String CPF;
    String numeroDeRegistro;
    String orgaoDeLotacao;
    double salario;

    public Universidade(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }
    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }
    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
