/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosingleton_numbergenerator;

/**
 *
 * @author 20161BSI0403
 */
public class NumberGeneratorTraditional {
    private static NumberGeneratorTraditional instance;
    
    public synchronized static NumberGeneratorTraditional getInstance(){
        if(instance == null){
            instance = new NumberGeneratorTraditional();    
        }
        return instance; 
    }
    
    //instance variables
    private int number=999900101;
    //instance constructor
    private NumberGeneratorTraditional(){};
    
    //instance methods
    public synchronized int getNextNumber(){
        return ++number;
    }
    
    
        
}
