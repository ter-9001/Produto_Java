/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

/**
 *
 * @author Aluno
 */
public class Produto {

    private int id;
    private String nome;
    private String descricao;
    private int estoque;
    private int número_de_serie;
    
    
    public Produto() {
    }

    public Produto(int id, String nome, String descricao, int estoque, int número_de_serie) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.estoque = estoque;
        this.número_de_serie = número_de_serie;
    }

   

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public int getNúmero_de_serie() {
        return número_de_serie;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setNúmero_de_serie(int número_de_serie) {
        this.número_de_serie = número_de_serie;
    }

    
    
    
    
}
