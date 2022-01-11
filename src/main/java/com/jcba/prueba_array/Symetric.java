/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcba.prueba_array;

public class Symetric {

    static String[] myArray = {"a", "b", "c", "d", "e", "e", "d", "c","b","a"};
    static int n = 10;

    public static void main(String args[]) {
        switch (n) {
            case 2:
                if (myArray[0] == myArray[1]) {
                    System.out.print("Symmetric");
                } else {
                    System.out.print("Asymmetric");
                }
                break;
            case 4:
                if (myArray[0] == myArray[3] && myArray[1] == myArray[2]) {

                    System.out.print("Symmetric");
                }else{
                    System.out.print("Asymmetric");
                }
                break;
                
            case 6:
                 if (myArray[0] == myArray[5] && myArray[1] == myArray[4]&&  myArray[2] == myArray[3]) {

                    System.out.print("Symmetric");
                }else{
                    System.out.print("Asymmetric");
                
        }
                 break;
            case 8:
                if (myArray[0] == myArray[7] && myArray[1] == myArray[6]&&  myArray[2] == myArray[5]&&  myArray[3] == myArray[4]) {

                    System.out.print("Symmetric");
                }else{
                    System.out.print("Asymmetric");
                
        }
                break;
            case 10:
                
             if (myArray[0] == myArray[9] && myArray[1] == myArray[8]&&  myArray[2] == myArray[7]&&  myArray[3] == myArray[6] &&  myArray[4] == myArray[5]) {

                    System.out.print("Symmetric");
                }else{
                    System.out.print("Asymmetric");
                break;
        }
    }
}
}