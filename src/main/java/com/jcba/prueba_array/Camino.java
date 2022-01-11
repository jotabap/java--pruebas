/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcba.prueba_array;


public class Camino {
  static int[] myArray = {1,2,9,2,5,3,5,1,5};

public static void main (String args[]) {
    if(myArray[0]+myArray[1]+myArray[5]<=myArray[0]+myArray[1]+myArray[2]&&myArray[0]+myArray[1]+myArray[5]<=myArray[0]+myArray[4]+myArray[2]&&myArray[0]+myArray[1]+myArray[5]<=myArray[0]+myArray[4]+myArray[5]&& myArray[0]+myArray[1]+myArray[5]<=myArray[0]+myArray[4]+myArray[8]){
   System.out.print(myArray[0]);
           System.out.print(" ");
          System.out.print(myArray[1]);
            System.out.print(" ");
        System.out.print(myArray[5]);
    }
   
    else if(myArray[0]+myArray[1]+myArray[2]<=myArray[0]+myArray[4]+myArray[2]&&myArray[0]+myArray[1]+myArray[2]<=myArray[0]+myArray[4]+myArray[5]&&myArray[0]+myArray[1]+myArray[2]<=myArray[0]+myArray[4]+myArray[8]&& myArray[0]+myArray[1]+myArray[2]<=myArray[0]+myArray[1]+myArray[5]){
   
         System.out.print(myArray[0]);
           System.out.print(" ");
          System.out.print(myArray[1]);
            System.out.print(" ");
        System.out.print(myArray[2]);
    }
    else if(myArray[0]+myArray[4]+myArray[2]<=myArray[0]+myArray[1]+myArray[2]&&myArray[0]+myArray[4]+myArray[2]<=myArray[0]+myArray[4]+myArray[5]&&myArray[0]+myArray[4]+myArray[2]<=myArray[0]+myArray[4]+myArray[8]&&myArray[0]+myArray[4]+myArray[2]<=myArray[0]+myArray[1]+myArray[5]){
         
         System.out.print(myArray[0]);
           System.out.print(" ");
         System.out.print(myArray[4]);
           System.out.print(" ");
         System.out.print(myArray[2]);
    } 
  else if(myArray[0]+myArray[4]+myArray[5]>=myArray[0]+myArray[1]+myArray[2]&&myArray[0]+myArray[4]+myArray[5]>=myArray[0]+myArray[4]+myArray[2]&&myArray[0]+myArray[4]+myArray[5]>=myArray[0]+myArray[4]+myArray[8]&&myArray[0]+myArray[4]+myArray[5]>=myArray[0]+myArray[1]+myArray[5]){
         
         System.out.print(myArray[0]);
           System.out.print(" ");
         System.out.print(myArray[4]);
           System.out.print(" ");
         System.out.print(myArray[5]);
    }
  else{
   
      System.out.print(myArray[0]);
        System.out.print(" ");
      System.out.print(myArray[4]);
        System.out.print(" ");
      System.out.print(myArray[8]);
  }
}  
}
