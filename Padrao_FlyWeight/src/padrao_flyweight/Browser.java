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
public class Browser {
    
    public FlyweightStatusItem putAllStatus(FlyweightStatusItem flyStatus){
        flyStatus.addStatusitem(new StatusItem(Estado.CARRINHO, true, false));
        flyStatus.addStatusitem(new StatusItem(Estado.FECHADO, true, false));
        flyStatus.addStatusitem(new StatusItem(Estado.PAGO, true, true));
        flyStatus.addStatusitem(new StatusItem(Estado.ENVIADO, false, true));
        flyStatus.addStatusitem(new StatusItem(Estado.ENTREGUE, false, true));
        return flyStatus;
    }

}
