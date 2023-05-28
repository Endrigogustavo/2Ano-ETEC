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
  private double salbase;

    public Vendedor(String nome, double salbase) {
        this.nome = nome;
        this.salbase = salbase;
    }
  


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalbase() {
        return salbase;
    }

    public void setSalbase(double salbase) {
        this.salbase = salbase;
    }
    
        public double calculoCommisao (double vend){
 this.setSalbase(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario")));
 this.setNome(JOptionPane.showInputDialog("digite o nome"));
 
 vend = (vend*0.1);
 double novosal = getSalbase()+vend;
 
        return novosal;
     
        
    }
}


