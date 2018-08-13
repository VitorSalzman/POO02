/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_fabrica_bebidas;

/**
 *
 * @author 20161bsi0403
 */
public abstract class Bebida {
    public String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void getNome() {
        System.out.println(nome);
    }
    
    
}
