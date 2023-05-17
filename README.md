# examenPPOJava

## CuentaBancaria

La clase abstracta CuentaBancaria dispone los atributos iban (String), saldo (float), e interesAB (final y float) con sus getters y setters. También dispone de un constructor y los siguientes métodos:

- ingresar(float qty);
- retirar (float qty);
- añadir (float qty);
- traspaso (CuentaBancaria cuentaEmisor, CuentaBancaria cuentaReceptor, float qty);

Y los siguentes métodos abstractos:

 - public abstract void calcularIntereses();
 - public abstract void mostrarCuenta();

También dispone de un main donde se crearán y mostraran las cuentas bancarias (corriente y ahorro).


## CuentaCorriente
 
 La clase CuentaCorriente es una subclase de CuentaBancaria con dos métodos:
 
 - calcularIntereses();
 - mostrarCuenta();

También está incluye un constructor haciendo uso del método super().


## CuentaAhorro
La clase CuentaCorriente es una subclase de CuentaBancaria con un atributo constante y los siguientes dos métodos:
 
 - private final float saldoMin;
 
 - calcularIntereses(); <--- Este método incluye una sentencia if que comparará el saldo actual con el saldo mínimo.
 - mostrarCuenta();

También está incluye un constructor haciendo uso del método super().


## Diferencias entre tipos de cuenta

Las dos diferencias entre los dos tipos de cuenta son:

- Para calcular los intereses de una cuenta corriente simplemente aplicaremos el interes anual. En cambio en una cuenta de ahorro deberemos comprobar primero si el saldo es inferior a el saldo mínimo, en cuyo caso el interés aplicado será igual a la mitad de dicho interés; en el caso que el saldo sea mayor al saldo mínimo se aplicará un interés el doble de grande y en cualquier otro caso (saldo == saldoMin) se aplicará el interés por defecto.
- Al querer usar el método mostrarCuenta() aparecerá por pantalla qué tipo de cuenta es su información.
