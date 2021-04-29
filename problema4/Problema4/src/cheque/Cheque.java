/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheque;

/**
 *
 * @author Usuario
 */
public class Cheque {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;

    public Cheque(String nC, String nB, double vC) {
        nombreCliente = nC;
        nombreBanco = nB;
        valorCheque = vC;
    }

    public void establecerNombreC(String nC) {
        nombreCliente = nC;
    }

    public void establecerNombreB(String nB) {
        nombreBanco = nB;
    }

    public void establecerValorC(double vC) {
        valorCheque = vC;
    }

    public void calcularComision() {
        comision = valorCheque * 0.003;
    }

    public String obtenerNombreC() {
        return nombreCliente;
    }

    public String obtenerNombreB() {
        return nombreBanco;
    }

    public double obtenerValorC() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }

    public String toString() {
        String cadena = "";
        cadena = String.format("%sNombre de cliente: %s\nNombre del banco: %s\n"
                + "Valor de cheque: %.2f\nComision: %.2f", cadena, nombreCliente,
                nombreBanco, valorCheque, comision);
        return cadena;
    }
}
