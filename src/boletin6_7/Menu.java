/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_7;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Menu {
    public void calculos(){
         System.out.println("***Menu***\n 1 -->Cuadrado\n 2 -->Triangulo \n 3 -->Circulo");
        Scanner sc= new Scanner(System.in);
        switch(sc.nextInt()){
            case 1: System.out.println("introduzca longitud de lado");
            int lado= sc.nextInt();
            System.out.println("La superficie del cuadrado es "+(Math.pow(lado, 2)));
            break;
            case 2: System.out.println("Introduzca base del triangulo");
            int base= sc.nextInt();
            System.out.println("introduzca altura");
            int altura= sc.nextInt();
                System.out.println("La superficie del triangulo es "+(base*altura/2));
              break;
            case 3: System.out.println("valor del radio");
            int radio= sc.nextInt();
                System.out.println("El area del circulo es "+(Math.PI*Math.pow(radio, 2)));
                break;
            default: System.out.println("Introduzca valores validos, por favor");
        }
    }
    
    
}
