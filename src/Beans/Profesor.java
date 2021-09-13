/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author dizma
 */
public class Profesor extends Persona implements UIPersonaV{
 private int ea;
 private int ca;
 private int vce;

   public Profesor(int ea,int ca,int vce,int codigo,String nombre){
     super(codigo,nombre);
     this.ea=ea;
     this.ca=ca;
     this.vce=vce;
   }

    public Profesor(int ea, int ca, int vce) {
        this.ea = ea;
        this.ca = ca;
        this.vce = vce;
    }

    public Profesor() {
    }

    public int getEa() {
        return ea;
    }

    public void setEa(int ea) {
        this.ea = ea;
    }

    public int getCa() {
        return ca;
    }

    public void setCa(int ca) {
        this.ca = ca;
    }

    public int getVce() {
        return vce;
    }

    public void setVce(int vce) {
        this.vce = vce;
    }
 
    @Override
    public double getPromedio() {
        return ea*0.50 + ca*0.20 + vce*0.30;
    }

    @Override
    public double getPromedioV() {
        return ea*0.60 + vce*0.40;
     }
    
}
