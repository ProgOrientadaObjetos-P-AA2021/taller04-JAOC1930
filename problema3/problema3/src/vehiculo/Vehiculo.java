/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author jamil
 */
public class Vehiculo {

    /**
     * @param args the command line arguments
     */
    private int cedula;
    private String marcaVehiculo;
    private int aFabricante;
    private double valorVehiculo;
    private double valorMatricula;

    public Vehiculo(int c, String marcaV, int aF, double valorV) {
        cedula = c;
        marcaVehiculo = marcaV;
        aFabricante = aF;
        valorVehiculo = valorV;
    }

    public void establecerCedula(int c) {
        cedula = c;
    }

    public void establecerMarcaVehiculo(String mV) {
        marcaVehiculo = mV;
    }

    public void establecerAFabricante(int aF) {
        aFabricante = aF;
    }

    public void establecerValorVehiculo(double vH) {
        valorVehiculo = vH;
    }

    public void establecerValorMatricula() {
        valorMatricula = valorVehiculo * 0.002;
    }

    public int obtenerCedula() {
        return cedula;
    }

    public String obtenererMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAFabricante() {
        return aFabricante;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    public String toString() {
        String cadena = "";
        cadena = String.format("%sCedula: %d\nMarca de vehiculo: %s\n"
                + "Año de fabricacion: %d\nValor vehiculo: %.2f\n"
                + "Valor matricula: %.2f\n", cadena, cedula, marcaVehiculo,
                aFabricante, valorVehiculo, valorMatricula);
        return cadena;

    }
}
