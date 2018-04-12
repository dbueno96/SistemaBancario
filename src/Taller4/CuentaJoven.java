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
public class CuentaJoven extends Cuenta {
    
    private TarjetaDebitoJoven tdj; 
    
    public CuentaJoven(){
        this.descuento = (float) 0.02 ; 
        
    }
    
    public void abrir(){
        tdj = new TarjetaDebitoJoven(); 
    }
    
    public TarjetaDebitoJoven getTarjetaDebito(){
        return tdj; 
    }
}
