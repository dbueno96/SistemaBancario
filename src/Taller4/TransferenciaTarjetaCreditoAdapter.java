
public class TransferenciaTarjetaCreditoAdapter implements CajeroAutomatico{
	
	private TarjetaCredito adaptee2;;

	public TransferenciaTarjetaCreditoAdapter(TarjetaCredito tarjeta) {
		// TODO Auto-generated constructor stub
		this.adaptee2 = new TarjetaCredito(); 
	}
	
	@Override
	public void order( String target, float amount ){
		this.adaptee2.transferir(amount, target);
	}

}
