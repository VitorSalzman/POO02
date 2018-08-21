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
public class MetodoFabricaLocadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		Object formato;
        formato = FabricaLocadora.gerarFormato("Cliente");
        formato.toString();
        
        formato = FabricaLocadora.gerarFormato("Avaliação");
        formato.toString();

        formato = FabricaLocadora.gerarFormato("Locação");
        formato.toString();
        
        formato = FabricaLocadora.gerarFormato("Filme");
        formato.toString();
        
        formato = FabricaLocadora.gerarFormato("Visualização");
        formato.toString();
        
        formato = FabricaLocadora.gerarFormato("ItemLocado");
        formato.toString();
	}
        
        
    }
    

