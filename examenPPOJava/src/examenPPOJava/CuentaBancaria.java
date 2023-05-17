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
	public void ingresar(float qty) {
		this.saldo = this.saldo + qty;
	}
	
	public void retirar(float qty) {
		this.saldo = this.saldo - qty;
	}
	
	public void añadir(float qty) {
		this.saldo = this.saldo + qty;
	}
	
	public static void traspaso(CuentaBancaria cuentaEmisor, CuentaBancaria cuentaReceptor, int qty) {
		cuentaEmisor.añadir(-qty);
		cuentaReceptor.añadir(qty);
	}
		
	public abstract void calcularIntereses();
	
	public abstract void mostrarCuenta();
	
	
	
	public static void main(String[] args) {
		
		CuentaCorriente cuenta1 = new CuentaCorriente ("ES6256465847", 1000.0f, 0.5f);
		CuentaAhorro cuenta2 = new CuentaAhorro ("ES9956415656", 3010.0f, 0.10f, 4000.0f);
		
		System.out.println("--- Mostramos datos de las cuentas ---");
		cuenta1.mostrarCuenta();
		cuenta2.mostrarCuenta();
		
		System.out.println("--- Ingresamos, retiramos y mostramos ---");

		cuenta1.ingresar(600);
		cuenta2.retirar(200);
		traspaso(cuenta1, cuenta2, 800);
		cuenta1.mostrarCuenta();
		cuenta2.mostrarCuenta();

		System.out.println("--- Aplicamos intereses ---");

		cuenta1.calcularIntereses();
		cuenta2.calcularIntereses();
		cuenta1.mostrarCuenta();
		cuenta2.mostrarCuenta();
	}
	
}
