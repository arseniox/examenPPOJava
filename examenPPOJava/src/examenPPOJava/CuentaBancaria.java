package examenPPOJava;

public abstract class CuentaBancaria {
	
	//ATRIBUTOS
	private String iban;
	private float saldo;
	private final float interesAB;
		
	// CONSTRUCTOR
	
	public CuentaBancaria(String iban, float saldo, float interesAB) {
		this.iban = iban;
		this.saldo = saldo;
		this.interesAB = interesAB;
	}
	
	// GETTERS Y SETTERS
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getInteresAB() {
		return interesAB;
	}
	
	// MÉTODOS
	public void ingresar(int qty) {
		this.saldo = this.saldo + qty;
	}
	
	public void retirar(int qty) {
		this.saldo = this.saldo - qty;
	}
	
	public void añadir(int qty) {
		this.saldo = this.saldo + qty;
	}
	
	public static void traspaso(CuentaBancaria cuentaEmisor, CuentaBancaria cuentaReceptor, int qty) {
		cuentaEmisor.añadir(-qty);
		cuentaReceptor.añadir(qty);
	}
		
	public abstract void calcularIntereses();
	
	public abstract void mostrarCuenta();
}
