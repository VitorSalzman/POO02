
package refeicao;

/**
 *
 * @author felipe
 */
public class Refeicao {
    
    private Hamburger hamburger;
    private Bebida bebida;
    private Batata complemento;

    public Hamburger getHamburger() {
        return hamburger;
    }
    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }
    public Bebida getBebida() {
        return bebida;
    }
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    } 

    public Batata getComplemento() {
        return complemento;
    }

    public void setComplemento(Batata complemento) {
        this.complemento = complemento;
    }
    
    
}
