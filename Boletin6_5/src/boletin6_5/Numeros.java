/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Numeros {
    public void calc(){
    Scanner ler= new Scanner(System.in);
        int a,b,c;
        System.out.println("INtroduzca valor de a");
        a= ler.nextInt();
        System.out.println("INtroduzca valor de b");
        b= ler.nextInt();
        System.out.println("INtroduzca valor de c");
        c= ler.nextInt();
        
       if(a>b&&a>c){ // Si es true lo lleva a cabo
        System.out.println("O número maior é "+a);
    }
       else if(b>a&&b>c){ //Si se comple el boolean se dá
       System.out.println("O número maior é "+b);
       }
       else
           System.out.println("O número maior é "+c);
        
    }
    }

