/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativ4;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class atv4 {
     public static Scanner teclado = new Scanner(System.in);
     
      public static int num1;
      public static int num2;
      public static int res;
      
      
      
      public static void main(String[] args) {
          System.out.println("Digite o primeiro numero");
          num1 = teclado.nextInt();
          System.out.println("Digite o segundo numero");
          num2 = teclado.nextInt();
          
          
          res = num2;
          num2 = num1;
          num1 = res;
          System.out.println("---------------");
          System.out.println(num1);
           System.out.println(num2);
          
          
          
    }
}
