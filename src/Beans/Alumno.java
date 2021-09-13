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
public class Alumno extends Persona implements UIPersonaV{
    private int n1;
    private int n2;
    private int n3;

    public Alumno(int n1, int n2, int n3,int cod,String nom) {
        super(cod,nom);
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
 public Alumno(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public Alumno() {
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public double getPromedio() {
        return (n1 + n2 + n3)/3;
    }  

    @Override
    public double getPromedioV() {
        return n1*0.30 + n2*0.30+n3*0.40;
    }
    
}
