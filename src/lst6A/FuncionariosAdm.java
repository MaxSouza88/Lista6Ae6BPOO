import java.util.Scanner;

public class FuncionariosAdm extends Universidade {

    Scanner adm = new Scanner(System.in);
    String funcaoAdm;
    String senioridade;

    public FuncionariosAdm(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }

    public void aumentoSalario(){
        System.out.println("Informe o salário do Funcionario ADM");
        double sal1 = adm.nextDouble();
        double salarioBruto = (sal1 * 0.1) + sal1;
        System.out.println("O novo salário é: " +salarioBruto);
    }

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}