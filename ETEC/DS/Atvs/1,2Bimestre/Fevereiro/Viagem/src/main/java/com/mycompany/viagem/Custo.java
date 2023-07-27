/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viagem;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Custo {
    private double  totalPercurso;
    
    public Custo() {
    this(0);
    }   

    public Custo(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }

    public double getTotalPercurso() {
        return totalPercurso;
    }

    public void setTotalPercurso(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }
    
    
    public void calcularViagem(Percurso p){
         
         setTotalPercurso((p.getKmPerCorrida()*p.getValorCombustivel())/p.getValorPedagio());
        
        
        JOptionPane.showMessageDialog(null, "Custo total de viagem é "+getTotalPercurso());
    
    }

    
    
}
