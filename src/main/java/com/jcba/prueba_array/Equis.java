/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcba.prueba_array;

/**
 *
 * @author john
 */
public class Equis {
    static int n=6;
    
    public static void main (String arg[]){
        String[][] matriz=new String [n][n];
        
        for (int j = 0; j < n; j++){
            for (int i = 0; i < n; i++) {
                  matriz[j][i] = "_";
            }
        }
    for(int i=0;i<n;i++){
         matriz[i][i] = "X";
     }
     int h=n-1;
     do{
         for(int i=0;i<n;i++){
             matriz[h][i]="X";
             h--;
         }
         
     }while(h>0);
   
        
        
       for (int j = 0; j < n; j++){
            for (int i = 0; i < n; i++) {
                   System.out.print(matriz[j][i]);
                  
            }
             System.out.println("");
        } 
        
    }
}
