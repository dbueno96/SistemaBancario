package Taller4;
import Taller4.*;
import javax.swing.JFrame;


public class Servicios extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -785272834485071095L;
	Transferencia transferencia;
	Retiro retiro;
	ConsultarSaldo consultar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		
	}

	public Servicios() {
		// TODO Auto-generated constructor stub
		transferencia = new Transferencia();
		retiro = new Retiro();
		consultar = new ConsultarSaldo();
	}

}
