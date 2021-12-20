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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String acumulador = " ";
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        
        for (int i = 0; i < estudiantes.length; i++) {
            
            if (promedios[i] >= 0 && promedios[i] <= 5.9) {
                promediosCualitativos[i] = "Promedio Regular";
            } else {
                if (promedios[i] >= 6 && promedios[i] <= 8.9) {
                    promediosCualitativos[i] = "Promedio Bueno";
                } else {
                    promediosCualitativos[i] = "Promedio Sobresaliente";
                }
            }
            
            acumulador = String.format("%s%s promedio: %.2f %s\n", acumulador,
                     estudiantes[i], promedios[i],
                     promediosCualitativos[i]);
        }
        System.out.println(acumulador);

    }

}
