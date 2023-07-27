/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv1;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class Primeiro {
    
    
    public static Scanner teclado = new Scanner(System.in);
     
      public static int num1;
      public static int num2;
      
    public static void main(String[] args) {
        System.out.println("Digite o primeiro numero!!!!"); 
        
        num1= teclado.nextInt();
       
        
        
        
          System.out.println("Digite o segundo numero!!!!"); 
        
        num2= teclado.nextInt();
        
        
        if (num1 < num2){
        
            System.out.println(num1+ " , " +num2);
        
        }
        else{
            if (num1 > num2){
        
             System.out.println(num2+ " , " +num1);
        }
        }
        
    }
    
}
