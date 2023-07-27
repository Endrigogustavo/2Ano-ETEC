/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viagem;

/**
 *
 * @author Admin
 */
public class Principal {
    
    public static void main(String[] args) {
        Percurso per = new Percurso();
        Custo c = new Custo();
        
        per.CadastrarPercurso();
        per.ListarPercurso();
        c.calcularViagem(per);
    }
    
}
