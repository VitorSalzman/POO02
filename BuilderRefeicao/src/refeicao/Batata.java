/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refeicao;

/**
 *
 * @author 20161BSI0403
 */
public class Batata {
    private String tamanho;
    private String preparo;

    public Batata(String preparo){  
        System.out.println("cria batata com preparo:" + preparo);
        this.setPreparo(preparo);
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public String getPreparo() {
        return preparo;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }
    
    
    
    
}
