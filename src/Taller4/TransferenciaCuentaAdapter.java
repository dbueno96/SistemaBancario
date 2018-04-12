
import Taller4.Cuenta;

public class TransferenciaCuentaAdapter implements CajeroAutomatico{
    private Cuenta adaptee1; 
    
    public TransferenciaCuentaAdapter (Cuenta cuenta){
        this.adaptee1 =  new Cuenta();
    }

    @Override
    public void order( String target, float amount ){
		this.adaptee1.transferir(amount, target);
	}
    
    	

}

