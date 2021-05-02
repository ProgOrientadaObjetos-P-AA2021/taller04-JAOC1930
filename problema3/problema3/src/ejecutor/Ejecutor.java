/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;

import vehiculo.Vehiculo;


/**
 *
 * @author jamil
 */
    public class Ejecutor {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo(1900691161, "Chevrolet.", 2012, 35000);
        vehiculo.establecerValorMatricula();
        System.out.printf("%s\n", vehiculo);
    }
}


