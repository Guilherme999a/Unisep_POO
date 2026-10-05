public class Aluno {

    //atributos
    String nome;
    String ra;
    float valorMensalidade;

    //construtores: é a primeira funcçao a ser executada
    //public Aluno() {
        //this.nome = "NOME NÃO PREENCHIDO";  // this é um atributo especifico da classe
        //this.ra = "RA NÃO PREENCHIDO";
        //this.valorMensalidade = "MENSALIDADE NÃO PREENCHIDO";

   // }

    public Aluno(String nome, String ra, float valorMensalidade) {
        this.nome = nome;
        this.ra = ra;
        this.valorMensalidade = valorMensalidade;
    }

    //metodos
    public void imprimiAluno() {
        System.out.println("Nome do Aluno: " + this.nome);
        System.out.println("Ra do Aluno: " + this.ra);
        System.out.println("Valor Mensalidade: " + this.valorMensalidade);

    }
    }


