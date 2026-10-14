
package com.mycompany.pilaa;
import java.util.ArrayList;

public class ListaFrutas {

    public static void main(String[] args) {
   
        
    //ArrayList: se utiliza para listas     
    ArrayList<String> lista = new ArrayList<>();
    
    //add(valor): agregar un elemento 
    lista.add("manzana");
        lista.add("mango");
        lista.add("Durazno");
        
    //add(index, valor): agregar un elemento en cualquier posicion
    lista.add(2, "pera");
    
        //get(): obtener un elemento segun su indice 
        System.out.println("fruta: "+lista.get(2));
        
        
       //set():cambiar valor de un elemento 
       lista.set(1, "mango malina");
       
       //remove(): quita elementos por indice o por objeto
       lista.remove(3);
       lista.remove("pera");
       
       if(lista.contains("manzana")){
           System.out.println("si hay manzana");
       }else{
           System.out.println("No hay manzana");
       }
       
       //size() tamaño del arraylist
        System.out.println("hay "+lista.size()+" frutas");
        //empty(): verifica si el rray esta vacio 
        System.out.println(lista.isEmpty());
        
        for(String fruta : lista){
            System.out.println(fruta);
        }
        
        lista.forEach(  (f)->{System.out.println(f);});
        
        for(int i=0; i< lista.size(); i++){
            System.out.println(lista.get(i));
    }
       
       //clear(): limpia el aaraylist
       
        System.out.println(lista);
    }
    
}
