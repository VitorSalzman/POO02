/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_fabrica_bebidas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20161bsi0403
 */
public class MetodoFabricaBebidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bebida bebida;
        try {
            bebida = FabricaBebidas.retornaBebida("vitamina");
            bebida.getNome();
        } catch (Exception ex) {
            Logger.getLogger(MetodoFabricaBebidas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        
        
        try {
            bebida = FabricaBebidas.retornaBebida("Cafe");
            bebida.getNome();
        } catch (Exception ex) {
            Logger.getLogger(MetodoFabricaBebidas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        
        
        
    }
    
}
