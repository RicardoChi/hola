/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08i;

import Beans.Profesor;

/**
 *
 * @author dizma
 */
public class Semana08I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Profesor objpro = new Profesor();
       objpro.setCod(1);
       objpro.setNom("Pedrito");
       objpro.setCa(20);
       objpro.setEa(20);
       objpro.setVce(20);
       
       System.out.println("El promedio es:" + objpro.getPromedio() + "\n");
       System.out.println("El promedio V:" + objpro.getPromedioV());
    }
    
}
