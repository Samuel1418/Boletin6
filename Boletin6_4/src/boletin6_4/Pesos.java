/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Pesos {
    public void obtener(){
      Scanner ler= new Scanner(System.in);
     String nome1,nome2;
     nome1="Samuel";
     nome2="Pepito";
     double peso1,peso2;
        System.out.println("Introduzca peso de Samuel");
        peso1= ler.nextDouble();
        System.out.println("Introduzca peso de Pepe");
        peso2= ler.nextDouble();
               
     if(peso1>peso2){
         System.out.println("O mais pesado é "+nome1+" cun peso de "+peso1+" Kg");
         System.out.println("A difereccia de peso entre Samuel e Pepito é de "+(peso1-peso2)+" Kg");
     }
     else if(peso2>peso1){
     System.out.println("O mais pesado é "+nome2+" cun peso de "+peso2+" Kg");
     System.out.println("A difereccia de peso entre Pepito e Samuel é de "+(peso2-peso1)+" Kg");
    }
}
}