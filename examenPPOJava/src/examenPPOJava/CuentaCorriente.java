package examenPPOJava;

public class CuentaCorriente extends CuentaBancaria {
	
	// CONSTRUCTOR
	public CuentaCorriente(String iban, float saldo, float interesAB) {
		super(iban, saldo, interesAB);
	}	
	
	public void calcularIntereses() {
		float newSaldo = (getSaldo() * (getInteresAB()+1));
		this.setSaldo(newSaldo);
	}

	public void mostrarCuenta() {
		System.out.println("Cuenta Corriente IBAN: " + getIban() + " Saldo: " + getSaldo());
	}
}
