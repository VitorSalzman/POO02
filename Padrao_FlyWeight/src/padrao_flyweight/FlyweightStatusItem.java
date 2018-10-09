/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_flyweight;

import java.util.HashMap;

/**
 *
 * @author Salzman
 */
public class FlyweightStatusItem {
    private HashMap<String,StatusItem> cacheStatusItem = new HashMap<>();
    
    public void addStatusitem(StatusItem status){
        cacheStatusItem.put(status.getEstado(), status);
    }
}
