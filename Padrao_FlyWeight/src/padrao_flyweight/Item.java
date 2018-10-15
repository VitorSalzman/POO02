/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_flyweight;

/**
 *
 * @author 20161bsi0403
 */
public class Item {
    
    private String descricao;
    private String nome;
    private StatusItem status;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void setStatus(StatusItem status){
        this.status = status;
    }
    
    
    
}
