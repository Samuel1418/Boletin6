/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Consola {
    public void res(){
     Scanner ler= new Scanner(System.in);
       System.out.println("Introduzca número");
          int a= ler.nextInt();
        if(a>0)
            System.out.println(a+" é positivo");
           else
           System.out.println("O numero non é valido");
           
    }
    
}
