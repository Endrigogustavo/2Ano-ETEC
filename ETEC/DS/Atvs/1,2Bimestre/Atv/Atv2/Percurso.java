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
public class Percurso {
    private double KmPerCorrida;
    private double ValorCombustivel;
    private double ValorPedagio;
    
    public Percurso(){
    this(0,0,0);
    }

    public Percurso(double KmPerCorrida, double ValorCombustivel, double ValorPedagio) {
        this.KmPerCorrida = KmPerCorrida;
        this.ValorCombustivel = ValorCombustivel;
        this.ValorPedagio = ValorPedagio;
    }

    public double getKmPerCorrida() {
        return KmPerCorrida;
    }

    public void setKmPerCorrida(double KmPerCorrida) {
        this.KmPerCorrida = KmPerCorrida;
    }

    public double getValorCombustivel() {
        return ValorCombustivel;
    }

    public void setValorCombustivel(double ValorCombustivel) {
        this.ValorCombustivel = ValorCombustivel;
    }

    public double getValorPedagio() {
        return ValorPedagio;
    }

    public void setValorPedagio(double ValorPedagio) {
        this.ValorPedagio = ValorPedagio;
    }
    
    public void CadastrarPercurso(){
        setKmPerCorrida(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de KM")));
        setValorCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do combustivel")));
        setValorPedagio(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pedagio")));
    }
    
    public void ListarPercurso(){
    JOptionPane.showMessageDialog(null,"os KM por corrida sao "+getKmPerCorrida()+ "\ne o valor do combustivel é " +getValorCombustivel()+ "\ne o valor do pedagio é "+getValorPedagio() );
    }
}
