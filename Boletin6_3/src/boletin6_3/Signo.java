/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Signo {
    public void num(){
     Scanner ler= new Scanner(System.in);
        System.out.println("Introduzca número por favor");
        int a = ler.nextInt();
        
        if(a>0){
            System.out.println("+");
        }
        else if (a==0){
            System.out.println("0");
    }
        else{
            System.out.println("-");
        }
    }
    
}
