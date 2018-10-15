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
public class StatusItem {
    private Estado estado;
    private boolean podeCancelar;
    private boolean compraConcluida;
    
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean isPodeCancelar() {
        return podeCancelar;
    }

    public void setPodeCancelar(boolean podeCancelar) {
        this.podeCancelar = podeCancelar;
    }

    public boolean isCompraConcluida() {
        return compraConcluida;
    }

    public void setCompraConcluida(boolean compraConcluida) {
        this.compraConcluida = compraConcluida;
    }
    
    public StatusItem(Estado estado, boolean podeCancelar, boolean compraConcluida){
        this.estado=estado;
        this.podeCancelar=podeCancelar;
        this.compraConcluida=compraConcluida;
    }
    
    
    
}
