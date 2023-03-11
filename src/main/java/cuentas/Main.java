package cuentas;

/**
 * Ejemplo de operativa sobre la clase CCuenta
 * @author Alberto Calvete Silva
 * @version 1.1
 * @see CCuenta
 */
public class Main {

    /**
     * Crea una cuenta, muestra su saldo por consola y llama al método necesario 
     * para probar la operativa sobre la cuenta creada.
     * @param args Array de parámetros de entrada
     * @see CCuenta#estado() 
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 0);
    }

    /**
     * Simula una retirada y un ingreso sobre la cuenta recibida en el atributo <code>cuenta1</code>.
     * Pendiente de añadir uso al parámetro <code>cantidad</code>.
     * @param cuenta1 Cuenta sobre la que se va a realizar la operativa
     * @param cantidad Número que indica una cantidad de dinero (pendiente de uso)
     * @see CCuenta#retirar(double) 
     * @see CCuenta#ingresar(double)
     * @since 1.1
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        System.out.println("Se va a realizar una retirada: \n");
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        System.out.println("Se va a realizar un ingreso: \n");
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
