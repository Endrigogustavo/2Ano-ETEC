/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativ2;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class atv2 {
    
      public static Scanner teclado = new Scanner(System.in);
     
      public static int num1;
      public static int cont;
      public static int res;
      public static int num2;
      
    public static void main(String[] args) {
        
        System.out.println("Digite o numero!!!");
        num1 = teclado.nextInt();
        
        num2 = num1;
        do{
           num1 = num1-1;
                System.out.println(num1);
                
              
                
                
                cont++;
            }
            while (cont != num2);
    }
  
    
}
