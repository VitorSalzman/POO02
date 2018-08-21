/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodofabrica_locadora;

/**
 *
 * @author vitorsalzman
 */

public class FabricaLocadora{
    

 
	public static Object gerarFormato(String formato) {
	      Object gerador = null;
	        if (formato.equalsIgnoreCase("Cliente")) {
	            gerador = new Cliente();
	        } else if (formato.equalsIgnoreCase("Avaliação")) {
	            gerador = new Avaliacao();
	        } else if (formato.equalsIgnoreCase("Locação")) {
	            gerador = new Locacao();
	        } else if (formato.equalsIgnoreCase("Filme")) {
	            gerador = new Filme();
	        } else if (formato.equalsIgnoreCase("Visualização")) {
	            gerador = new Visualizacao();
	        } else if (formato.equalsIgnoreCase("ItemLocado")) {
	            gerador = new ItemLocado();
	        }
	        return gerador;
	  }

}
