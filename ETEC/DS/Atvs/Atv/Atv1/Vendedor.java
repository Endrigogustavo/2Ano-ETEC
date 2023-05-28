/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendedor;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Vendedor {
  private String nome;
  private double retorno;
  private double  sal;
 
  
  public Vendedor(){
   this("",0,0);
}

    public Vendedor(String nome, double retorno, double sal) {
        this.nome = nome;
        this.retorno = retorno;
        this.sal = sal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRetorno() {
        return retorno;
    }

    public void setRetorno(double retorno) {
        this.retorno = retorno;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    
    public double calculoCommisao (double vend){
 this.setSal(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario")));
 this.setNome(JOptionPane.showInputDialog("digite o nome"));
 
 this.setRetorno(this.getSal()+ (vend*0.1));
 
        return getRetorno();
     
        
    }
    
    
}
