/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author TaisBalcazar
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        double suma = 0;
        double media;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }

        media = suma / arreglo.length;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > media) {
                elementosArribaMedia = elementosArribaMedia + 1;
            } else {
                elementosAbajoMedia = elementosAbajoMedia + 1;
            }

        }
        System.out.printf("Elementos arriba de la media: %s\n"
                + "Elementos abajo de la media: %s\n",
                elementosArribaMedia, 
                elementosAbajoMedia);

    }
}
