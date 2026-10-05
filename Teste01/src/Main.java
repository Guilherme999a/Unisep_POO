public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Guilherme", "850000", 795);

       // aluno.nome = "Guilherme";
        //aluno.ra = "850000";
       // aluno.valorMensalidade =("795.00");

        aluno.imprimiAluno(); //metodo

        System.out.println("------------------------------");

        Aluno aluno2 = new Aluno("João", "230000", 795);

    //  aluno2.nome = "Josué";
    //  aluno2.ra = "821000";
    //  aluno2.valorMensalidade =("795.00");

        aluno2.imprimiAluno(); //metodo

        System.out.println("------------------------------");

        Aluno aluno3 = new Aluno("Guilherme", "850000", 795);
        aluno3.imprimiAluno();




    }
}
