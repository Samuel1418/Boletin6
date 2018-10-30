/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Vendas {
    private String  artigo1;
    private  int  Vartigo1;
    
    
    public void Vendas(){
   String artigo1 =   JOptionPane.showInputDialog("Introduzca nome do artigo");
    
   //para poner un int dentro del JOPtion hay que transformarlo con el Integer.parseInt()
  int  Vartigo1 =  Integer.parseInt(JOptionPane.showInputDialog("Introduzca ventas do artigo"));

    if(Vartigo1<=100){
        //Para que muestre el mensaje hay que ponerle que el primer parametro es null ya que pide 2
        JOptionPane.showMessageDialog(null,"O tipo de consumo é baixo");
    }
    else if(Vartigo1>100&&Vartigo1<=500){
        JOptionPane.showMessageDialog(null,"O tipo de consumo é medio");
    }
    else if(Vartigo1>500&&Vartigo1<=1000){
    JOptionPane.showMessageDialog(null,"O tipo de consumo é alto");
    }
    else{
    JOptionPane.showMessageDialog(null,"O consumo é de primeira necesidade");
    }
    }
}
        
    
    


