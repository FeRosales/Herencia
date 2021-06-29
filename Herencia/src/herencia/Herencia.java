/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import herencia.ico.fes.Animal;
import herencia.ico.fes.Gato;
import herencia.ico.fes.Perro;

/**
 *
 * @author windos8.1
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal A1 = new Animal("Iguana", "Reptil", "Hembra");
        System.out.println(A1);
        
        Perro P1 = new Perro("Hembra", "Pastor Belga", (float) 20.0Kg);
        System.out.println(P1);
        
        Gato G1 = new Gato("Hembra", "Persa", (float) 5.0Kg);
        System.out.println(G1);
        // TODO code application logic here
    }
    
}
