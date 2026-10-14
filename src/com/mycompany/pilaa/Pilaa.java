/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilaa;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author alumnog
 */
public class Pilaa {

    public static void main(String[] args) {
        
        
      Deque pila0 = new ArrayDeque(); //pila de objetos object
      Deque<String> pila = new ArrayDeque<>(); // pila de string
      
      //push: apilar elementos 
      pila.push("fresa");
      pila.push("mango");
      pila.push("manzana");
      pila.push("mango");
      pila.push("ciruela");
      pila.push("tamarindo");
      //peek : ver la cima sin retirarlo
        System.out.println("cima:"+ pila.peek());
        //pop: despilar
        System.out.println("retirado:"+ pila.pop());
        System.out.println("nueva cima"+ pila.peek());
        
        System.out.println("----hay " + pila.size()+" frutas en la pila----");
        while(!pila.isEmpty()){// pila. isEmpty()! = true
            System.out.println("procesando " + pila.pop());
        }

        System.out.println("ya no hay nada en la pila!!!");
      
      
      
      
      
    }
}
