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
public class CuentaOro extends Cuenta{
    
    private TarjetaDebitoOro tdo; 
    
    public CuentaOro(){
        this.descuento= (float) 0.015; 
    }
    
    public void abrir(){
        tdo = new TarjetaDebitoOro();
    }
    
    public TarjetaDebitoOro getTarjetaDebito(){
        return tdo; 
    }
}
