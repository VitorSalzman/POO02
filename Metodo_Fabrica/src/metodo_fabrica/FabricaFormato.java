/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_fabrica;

/**
 *
 * @author 20161bsi0403
 */
public class FabricaFormato {

    public static Formato gerarFormato(String formato) throws Exception {
        Formato gerador = null;
        if (formato.equalsIgnoreCase("jpeg")) {
            gerador = new FormatoJpeg();
        } else if (formato.equalsIgnoreCase("png")) {
            gerador = new FormatoPng();
        } else if(formato.equalsIgnoreCase("gif")){
            gerador = new FormatoGif();
        } else if(formato.equalsIgnoreCase("bmp")){
            gerador = new FormatoBmp();
        } else{
            throw new Exception("Formato desconhecido");
        }
        
        
        
        return gerador;
    }
}