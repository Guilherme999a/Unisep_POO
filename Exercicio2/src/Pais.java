public class Pais {

    //Atributos
    // primeiramente criar as classes(codigo, nome... ). Em seguida criar a nova classe main
    private String codigo = "BRA";
    private String nome = "Brasil";
    private int populacao = 1240222340;
    private double dimensao = 877488.8904;

    //Construtores
    public Pais(String codigo, String nome, int populacao, double dimensao){ //parametros

        this.codigo = codigo;
        this.nome = nome;
        this.populacao = populacao; // aqui transforma os atributos obrigatorios
        this.dimensao = dimensao;
    }
    // Metodos, é a parte de incrementação, no caso as açoes do obj

    //Metodos
    public void listarPaises(){
        System.out.println("Nome: " + nome);
        System.out.println("Populacao: " + populacao);
        System.out.println("Dimensao: " + dimensao);
        System.out.println("Codigo Pais: " + codigo);

    }
    // get e set serve para alterar o "Ex: nome" quando o atributo esta privado
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getPopulacao() {
        return this.populacao;

    }
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }


    public double getDimensao() {
        return this.dimensao;

    }
    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }


    public String getCodigo() {
        return this.codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

