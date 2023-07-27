/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativ3;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class atv3 {
      
     
     public static int impar;
     public static int par;
     
     
    

      
      public static void main(String[] args) {
   
          
             for (int cont = 0; cont <=30; cont++){
                 
                 if(cont %2 != 0) {
                     
                 impar = impar+cont;
                 }
                
                 if(cont %2 == 0) {
                     par = par *cont;
                 
                 }
             }
             
             System.out.println(impar);
             System.out.println(par);
    }
}
