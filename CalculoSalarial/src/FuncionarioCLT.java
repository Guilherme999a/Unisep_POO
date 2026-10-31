public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salarioBase){super(nome, salarioBase);
    }

    public void clt(){
        salarioFinal = salarioBase - (salarioBase * 0.08);
        System.out.println("O desconto é: " + salarioFinal);
    }


}
