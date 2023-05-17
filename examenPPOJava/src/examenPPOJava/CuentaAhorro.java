package examenPPOJava;

public class CuentaAhorro extends CuentaBancaria{

	private final float saldoMin;
	
	// CONSTRUCTOR
	public CuentaAhorro(String iban, int saldo, float interesAB, float saldoMin) {
		super(iban, saldo, interesAB);
		this.saldoMin = saldoMin;
	}	
	
	public void calcularIntereses() {
		
		if (getSaldo() < saldoMin) {
			float newSaldo = (getSaldo() * (getInteresAB()/2));
			this.setSaldo(newSaldo);
		}
		else if (getSaldo() > saldoMin) {
			float newSaldo = (getSaldo() * (getInteresAB()*2));
			this.setSaldo(newSaldo);
		}
		else {
			float newSaldo = (getSaldo() * getInteresAB());
			this.setSaldo(newSaldo);
		}
	}

	public void mostrarCuenta() {
		System.out.println("Cuenta Ahorro IBAN: " + getIban() + " Saldo: " + getSaldo());
	}
	
}
