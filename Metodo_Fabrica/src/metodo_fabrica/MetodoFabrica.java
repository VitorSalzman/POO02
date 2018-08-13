/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_fabrica;

 /*
 * @author 20161bsi0403
 */

import java.util.logging.Level;
import java.util.logging.Logger;

public class MetodoFabrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Formato formato;
        try {
            formato = FabricaFormato.gerarFormato("jpeg");
            formato.gera();
        } catch (Exception ex) {
            Logger.getLogger(MetodoFabrica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            formato = FabricaFormato.gerarFormato("bmp");
            formato.gera();
        } catch (Exception ex) {
            Logger.getLogger(MetodoFabrica.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        
        
        
    }
    
}
