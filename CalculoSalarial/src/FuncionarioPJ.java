public class FuncionarioPJ extends Funcionario {

    public FuncionarioPJ(String nome, double salarioBase){super(nome, salarioBase);
    }

    public void pj(){
        salarioFinal = salarioBase + (salarioBase *  0.15);
        System.out.println("O acrescime é: " + salarioFinal);

    }

}
