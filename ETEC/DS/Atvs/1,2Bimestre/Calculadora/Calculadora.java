/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Calculadora {
    private double n1;
    private double n2;
    private double r;
    
    public Calculadora(){
    this(0,0,0);
    }

    public Calculadora(double n1, double n2, double r) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    /**
     * @return the n1
     */
    public double getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(double n1) {
        this.n1 = n1;
    }

    /**
     * @return the n2
     */
    public double getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(double n2) {
                  
        this.n2 = n2;
    }

    /**
     * @return the r
     */
    public double getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(double r) {
        this.r = r;
    }
    
      public void Somar (){
          this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digitr o valor de N1")));
          this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digitr o valor de N2")));
          this.setR(this.getN1()+this.getN2());
          
          JOptionPane.showMessageDialog(null, " a soma é " +getR());
      
      
     }
      
      public void Subtrair (double a , double b){
          
          this.setR(a-b);
          
          JOptionPane.showMessageDialog(null, " a soma é " +getR());
      
      
     }
    
        public double Multi (){
          this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digitr o valor de N1")));
          this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digitr o valor de N2")));
          this.setR(this.getN1()*this.getN2());
          
          return this.getR();
      
      
     }
        
          public double div (double a, double b){
          this.setR(a/b);
          
          return this.getR();
      
      
     }
}
