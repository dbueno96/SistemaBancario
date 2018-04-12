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
public class CuentaEstandar extends Cuenta{
     TarjetaDebitoEstandar tde; 
    
    public CuentaEstandar (){
        this.descuento  = (float) 0.005;
    }
    
    public void abrir (){
       tde= new TarjetaDebitoEstandar(); 
    }
    
    public TarjetaDebitoEstandar getTarjetaDebito(){
        return tde; 
    }
    
}
