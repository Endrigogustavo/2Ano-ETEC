/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv6;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class atv6 {
     public static Scanner teclado = new Scanner(System.in);
     
     public static Float res;
     public static float vetornum[] = new float[4];
     public static String nome;
     
     
     public static void main(String[] args) {
         System.out.println("Digite seu nome");
         nome = teclado.nextLine();
         
         System.out.println("Digite a primeira nota");
         vetornum[0] = teclado.nextFloat();
         
           System.out.println("Digite a segunda nota");
         vetornum[1] = teclado.nextFloat();
         
           System.out.println("Digite a terceira nota");
         vetornum[2] = teclado.nextFloat();
         
           System.out.println("Digite a quarta nota");
         vetornum[3] = teclado.nextFloat();
         
         res = (vetornum[0] + vetornum[1] + vetornum[3] + vetornum[3])/4;
         
         System.out.println(" ");
         System.out.println(nome);
         System.out.println(res);
}
}