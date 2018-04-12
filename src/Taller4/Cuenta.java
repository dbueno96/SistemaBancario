package Taller4;

/**
 *
 * @author arkai
 */
public class Cuenta {

    String tipoCuenta;
    String entidad, sucursal, numeroCuenta;
    float descuento;
    TarjetaDebito td;
    TarjetaCredito tc;
    Regalo regalo;

    public Cuenta() {
        // TODO Auto-generated constructor stub
    }

    public float getDescuento() {
        return descuento;
    }

    public void abrir() {

        switch (tipoCuenta) {
            case "10":
                td = new TarjetaDebito10();
                tc = new TarjetaCredito10();
                regalo = new Regalo10();
                break;
            case "oro":
                td = new TarjetaDebitoOro();
                tc = new TarjetaCreditoOro();
                regalo = new RegaloOro();
                break;

            case "joven":
                td = new TarjetaDebitoJoven();
                tc = null;
                regalo = new RegaloJoven();
                break; 
                
            case "estandar": 
                td = new TarjetaDebitoEstandar(); 
                tc = null; 
                regalo = null;
                break; 
            default: break; 
            
        }

    }

    public void llegaRecibo() {

    }

    public void ingresar() {

    }

    public void retirar() {

    }

    public void transferir(float importe, String cuentaDestino) {

    }

}
