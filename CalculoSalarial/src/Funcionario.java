public class Funcionario {

    String nome;
    public double salarioFinal;
    public double salarioBase = 1500;


    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;


    }

    public void clt(){
        System.out.println("Salario com desconto é: " + salarioFinal);
    }

    public void pj(){
        System.out.println("Salario com acresciomo é: " + salarioFinal);
    }

    public void estagio(){
        System.out.println("Salario com desconto" + salarioFinal);
    }

    public void exibirSalario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario base: " + this.salarioBase);
    }


}
