//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //criando instancia
        //criando um novo obj pais(pais recebe new Pais)
    Pais brasil = new Pais("BRA", "Brasil",1240222340, 877488.8904);
    Pais mexico = new Pais("MEX", "Mexico", 13412323, 23423.124252);
    Pais paraguai = new Pais("PAR", "Paraguai", 13412323, 23423.124252);

    brasil.getNome();
    brasil.setNome("Brasil brasileiro");

    brasil.getPopulacao();
    brasil.setPopulacao(15425555);

    brasil.getDimensao();
    brasil.setDimensao(23423.124252);

    brasil.getCodigo();
    brasil.setCodigo("BR");

    // Aqui ira serve para retornar todos os paises em listaPaises na classe Pais
    brasil.listarPaises();
    mexico.listarPaises();
    paraguai.listarPaises();

    }
}