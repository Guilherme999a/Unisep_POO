public class Main {
    public static void main(String[] args) {
        Contador objeto1 = new Contador(); // aqui estou criando um objeto (contador)

    objeto1.incrementar();
    objeto1.incrementar();
    objeto1.incrementar();  // nesse objeto ira incrementar os numeros, no caso 1 + 1
    objeto1.incrementar();
    objeto1.zerar(); // nesse objeto ira zerar o contador

    System.out.println("Valor do contador: " + objeto1.retornar());
 }
}