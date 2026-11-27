// A função do controller é buscar as informações dentro do banco de dados
package Mercado;

import com.sun.security.jgss.GSSUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoController {

    ConexaoMysql conexaoMysql;

    public ProdutoController(ConexaoMysql conexaoMysql){
        this.conexaoMysql = conexaoMysql;
        this.conexaoMysql.conectar();
    }
    // CRUD
    //C - create  insert
    //R - read  select
    //U  update - update
    //D - delete - delete

    public void listarProdutos(){
        String sql = "SELECT * FROM Produto";

        try {
            Connection conn =  this.conexaoMysql.conectar();
            PreparedStatement qry = conn.prepareStatement(sql);
            ResultSet dados = qry.executeQuery();

            while (dados.next()){
                System.out.println(dados.getInt("ID"));
                System.out.println(dados.getString("NOME"));
                System.out.println(dados.getDouble("PRECO"));
            }

        } catch (SQLException e){
            //todo handle execepetion
            System.out.println("Erro ao consultar bando de dados");
        }
    }

    public void cadastrarProduto(Produto produto) {
        String sql = "INSERT INTO produto (NOME, PRECO) VALUES(?,?)";

        try {

            Connection conn = this.conexaoMysql.conectar();
            PreparedStatement qry = conn.prepareStatement(sql);

            //esses dois qry abaixo vai ser aplicado nos dois pontos de interogação que esta acima
            qry.setString(1, produto.NOME);
            qry.setDouble(2, produto.PRECO);
            qry.executeUpdate();

            System.out.println("Produto cadastrado com sucesso! ");


        }catch (SQLException e){
            System.out.println("Erro ao cadastrar um novo produto");

        }
    }

    public void alterarProduto(Produto produto){
        String sql = "UPDATE produto SET NOME = ? PRECO = ? WHERE = ID = ?";

        try {
            Connection conn = this.conexaoMysql.conectar();
            PreparedStatement qry = conn.prepareStatement(sql);

            qry.setString(1, produto.NOME);
            qry.setDouble(2, produto.PRECO);
            qry.setInt(3, produto.ID);

            qry.executeUpdate();

            System.out.println("Nome do produto alterado com suceso! ");

        }catch (SQLException e){
            System.out.println("Erro ao alerar o produto");

        }



        }

        public void deletarProdutos(int id){
        String sql = "DELETE FROM produto WHRE id = ?";

        try {
            Connection conn = this.conexaoMysql.conectar();
            PreparedStatement qry = conn.prepareStatement(sql);

            qry.setInt(1, id);
            qry.executeUpdate();

            System.out.printf("Produto excluido com sucesso");
        } catch (SQLException e){
            System.out.println("Erro ao deletar produto");
        }
        }




    }

