/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

/**
 *
 * @author bitxanax
 */
public class Estudiante {

    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Estudiante(String n, double c1, double c2, double c3) {
        nombre = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establcerCalificacion1(double c1) {
        calificacion1 = c1;
    }

    public void establecerCalificacion2(double c2) {
        calificacion2 = c2;
    }

    public void establecerCalificacion3(double c3) {
        calificacion3 = c3;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("Nombre: %s \nCalificación 1: %.2f "
                + "\nCalificación 2: %.2f \nCalificación 3: %.2f \nPromedio: "
                + "%.2f", nombre, calificacion1, calificacion2, calificacion3,
                promedio);
        return cadena;
    }
}
