/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;
import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Caixa {
    private double saldo;
    
    public Caixa(){
    this(0);
    }
    
    public Caixa(double saldo){
    this.saldo = saldo;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void entrar (){
    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digitr o valor de entrada"));
    this.setSaldo(this.saldo + valor);
    }
    
     public void retirada (){
    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digitr o valor de retirar"));
    this.setSaldo(this.saldo - valor);
    }
    
   
}
