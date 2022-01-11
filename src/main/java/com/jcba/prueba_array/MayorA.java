/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcba.prueba_array;

public class MayorA {

    static int[] myArray = {44, 2, 144, 100, 98};

    public static void main(String args[]) {

        int var1 = myArray[0];
        int var2 = myArray[1];
        int var3 = myArray[2];
        int var4 = myArray[3];
        int var5 = myArray[4];
        int mayor;

        if (var1 >= var2 && var1 >= var3 && var1 >= var4 && var1 >= var5) {
            mayor = var1;

        } else if (var2 >= var1 && var2 >= var3 && var2 >= var4 && var2 >= var5) {
            mayor = var2;

        } else if (var3 >= var1 && var3 >= var2 && var3 >= var4 && var3 >= var5) {
            mayor = var3;

        } else if (var4 >= var1 && var4 >= var2 && var4 >= var3 && var4 >= var5) {
            mayor = var4;

        } else {
            mayor = var5;

        }

        System.out.println("El valor mayor es " + mayor);

    }
}
