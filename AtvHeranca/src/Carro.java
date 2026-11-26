public class Carro extends Veiculo{ // classe filho

    String mae; // classe mae

    public Carro(String marca, String nome, int ano, String cor, String mae){
        super(marca, nome, ano, cor);

        this.mae = mae;
    }
    // super é uma palavra reservada, serve para chamar o construtor pai

    void listarMae(){
        System.out.println("Exibir nome da mae" + this.mae);
    }
}
