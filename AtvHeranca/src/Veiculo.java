import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Veiculo { // classe pai

    Scanner

    //atributos
    private String marca;
    private String nome;
    private int ano;
    private String cor;

    //construtor
    public Veiculo(String marca, String nome, int ano, String cor){
        this.marca = marca;
        this.nome = nome;
        this.ano = ano;
        this.cor = cor;

    }

    //metodos
    public void listarMarca(){
        System.out.println("Exibir a marca do veiculo " + marca);
    }
    public void listarNome(){
        System.out.println("Exibir o nome do veiculo " + nome);
    }
    public void listarAno(){
        System.out.println("Exibir o ano do veiculo " + ano);
    }
    public void listarCor(){
        System.out.println("Exibir  a cor do veiculo " + cor);
    }
}




