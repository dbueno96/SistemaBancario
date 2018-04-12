/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller4;

/**
 *
 * @author arkai
 */
public class Cuenta10 extends Cuenta{
    
    private TarjetaDebito10 td10; 
     
    public Cuenta10(){
        this.descuento  = (float) 0.01; 
        
    }
    
    
    
    public void abrir(){
        TarjetaDebito10 td10 = new TarjetaDebito10(); 
        Regalo10 r10 = new Regalo10(); 
    }
    
    public TarjetaDebito10 getTarjetaDebito(){
        return td10; 
    }
    
}
