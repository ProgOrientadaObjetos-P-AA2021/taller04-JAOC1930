/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;

import profesor.Profesor;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Jhoel";
        String apellido = "Ordoñez";
        double sueldoBasico = 395;
        int cedula = 100691161;
        Profesor profesor = new Profesor(nombre, apellido, sueldoBasico, cedula);
        profesor.calcularSueldoT();
        System.out.printf("%s\n", profesor);
    }

}
