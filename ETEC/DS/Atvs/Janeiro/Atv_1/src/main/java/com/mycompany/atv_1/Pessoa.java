/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv_1;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
   
    
     public Pessoa() {
        // todo auto generated constructor stub
        this("","","");
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
  

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = JOptionPane.showInputDialog("Digite seu nome");
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }    

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = JOptionPane.showInputDialog("Digite seu endereço");
    }

    /**
     * @return the telefone
     */
    public String getTelefone() 
    {
        return telefone;
        
    }   
    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = JOptionPane.showInputDialog("Digite seu telefone");
    }
    
   
    
    public void inserirdados(){
    JOptionPane.showMessageDialog(null, "Sistema de cadastro \n siga as informaçoes a seguir");
    setNome(nome);
    setEndereco(endereco);
    setTelefone(telefone);
    }

    
    public void apresentarPessoa(){
    JOptionPane.showMessageDialog(null, "ola "+getNome()+ " \nseu telefone é "+getTelefone()+" \n e seu endereco é "+getEndereco());
    }
    
    
     
}
