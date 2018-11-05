/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Suma {
    public void summ(){
     Scanner ler= new Scanner(System.in);
        System.out.println("Intricuzca valor de a");
        short a= ler.nextShort();
        System.out.println("Introduzca valor de b");
        short b= ler.nextShort();
        if(a>=b){
            System.out.println("A resta dos dous dá "+(a-b));
        }
        System.out.println("La suma de ambos valores es "+(a+b));
    }
    
}
