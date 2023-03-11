package cuentas;

/**
 * Clase que representa una cuenta bancaria y su operativa
 * @author Alberto Calvete Silva
 * @version 1.1
 */
public class CCuenta {

    /**
     * El nombre del titular de la cuenta
     */
    protected String nombre;
    /**
     * El identificador de la cuenta
     */
    protected String cuenta;
    /**
     * El saldo actual de la cuenta
     */
    protected double saldo;
    /**
     * El tipo de interés actual aplicado a la cuenta
     */
    protected double tipoInterés;

    /**
     * Crea una cuenta sin información
     */
    public CCuenta()
    {
    }

    /**
     * Crea una cuenta con el nombre, el identificador, el saldo y el tipo deinterés indicado
     * @param nom El nombre del titular de la cuenta
     * @param cue El identificador de la cuenta
     * @param sal El saldo actual de la cuanta
     * @param tipo El tipo de inetrés a aplicar a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Consulta el saldo actual de la cuenta
     * @return Un número que representa el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Permite ingresar la cantidad indicada en la cuenta. Se espera que <code>cantidad</code>
     * sea un número positivo
     * @param cantidad Un número positivo que indica la cantidad a ingresar
     * @throws Exception Si el parámetro <code>cantidad</code> es negativo
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Permite retirar la cantidad indicada de la cuenta. Se espera que <code>cantidad</code>
     * sea un número positivo e inferior o igual al saldo de la cuenta.
     * @param cantidad Un número positivo que indica la cantidad a retirar
     * @throws Exception Si el parámetro <code>cantidad</code> es negativo
     * @throws Exception Si el parámetro <code>cantidad</code> es superior al saldo de la cuenta
     * @see #estado()
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /** Devuelve el nombre del titular de la cuenta
     * @return Una cadena de texto que representa el nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /** Asocia el nombre del titular a la cuenta
     * @param nombre El nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Devuelve el identificador de la cuenta
     * @return Una cadena de texto que contiene el identificador de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /** Establece el identificador para la cuenta
     * @param cuenta Una cadena de texto que representa el identificador de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** Devuelve el saldo de la cuenta
     * @return Un número que representa el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /** Establece el saldo actual de la cuenta
     * @param saldo Un valor numérico que indica el saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** Devuelve el tipo de interés aplicado actualmente a la cuenta
     * @return Un valor numérico que indica el tipo de interés asociado a la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /** Establece el tipo de interés a aplicar a la cuenta
     * @param tipoInterés Un valor numérico que representa el tipo de interés a aplicar
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
