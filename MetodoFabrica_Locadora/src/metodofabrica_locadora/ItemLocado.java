/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodofabrica_locadora;

/**
 *
 * @author Salzman
 */
public class ItemLocado {
    private float desconto;
    private int valor;
    private int instanteParada;

    public float getDesconto() {
        return desconto;
    }

    public int getValor() {
        return valor;
    }

    public int getInstanteParada() {
        return instanteParada;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setInstanteParada(int instanteParada) {
        this.instanteParada = instanteParada;
    }
    
    
}
