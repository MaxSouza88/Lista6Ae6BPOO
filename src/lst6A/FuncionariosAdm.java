import java.util.List;

public class FuncionariosAdm extends Funcionarios{




    String funcaoAdm;
    String senioridade;

    public FuncionariosAdm(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
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

    public void aumentoSalario(){
        double salarioBruto = (salario * 0.1) + salario;
    }
}
