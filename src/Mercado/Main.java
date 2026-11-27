package Mercado;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class Main{
    public static void main(String[] args){
        ConexaoMysql conn = new ConexaoMysql();
        ProdutoController produtoController = new ProdutoController(conn);

        Produto produto = new Produto("SORVETE", 17.00);
        produtoController.cadastrarProduto(produto);

        Produto produto2 = new Produto("PICOLE", 9.00);
        produto2.ID = 4;

        produtoController.alterarProduto(produto2);


        produtoController.listarProdutos();

    }
}
