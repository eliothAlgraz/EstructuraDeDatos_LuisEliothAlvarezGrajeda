
package com.mycompany.pilaa;

import java.util.LinkedList;
import java.util.Queue;


public class MiFila {
    
    public static void main(String[] args){
    // cola oxxo instancia e inicializada
    Queue<String> colaOXXO = new LinkedList<>();
    
    colaOXXO.offer("Maria");
    colaOXXO.offer("Pepe");
    colaOXXO.offer("Juan");
    colaOXXO.offer("Ana");
    colaOXXO.offer("Carlos");
    
    //peek: muesta ek siguuiente en la cola 
    System.out.println("siguiente:");
    System.out.println(colaOXXO.peek());
    
    //poll: saca a el siguien en la cola 
    System.out.println("Atendido;");
    System.out.println(colaOXXO.poll());
    
    //size: cantidad de elementos en la cola 
    System.out.println("\nQuedan; "+colaOXXO.size());
    
    //isEmpty: verifica si la cola esta vacia 
        System.out.println("\nEsta vacia?: "+colaOXXO.isEmpty());
        System.out.println(colaOXXO);
   
    
        }
   
    }
    
