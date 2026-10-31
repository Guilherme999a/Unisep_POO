public class FuncionarioEstagiario extends Funcionario{

    public FuncionarioEstagiario(String nome, double salarioBase){super(nome, salarioBase);
    }

    public void estagio(){
        salarioFinal = salarioBase - (salarioBase *  0.05);
        System.out.println("O desconto é: " + salarioFinal);
    }

}
