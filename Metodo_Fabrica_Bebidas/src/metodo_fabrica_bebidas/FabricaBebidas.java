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
public class FabricaBebidas {
    public static Bebida retornaBebida(String drink) throws Exception {
        Bebida bebida = null;
        if (drink.equalsIgnoreCase("refrigerante")) {
            bebida = new Refrigerante("Refrigerante servido");
        } else if (drink.equalsIgnoreCase("suco")) {
            bebida = new Suco("Suco servido");
        } else if(drink.equalsIgnoreCase("cha")){
            bebida = new Cha("Cha servido");
        } else if(drink.equalsIgnoreCase("cafe")){
            bebida = new Cafe("Cafe servido");
        } else{
            throw new Exception("Bebida desconhecido");
        }
        
        
        
        return bebida;
    }
}
