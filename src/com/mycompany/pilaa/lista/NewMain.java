
package com.mycompany.pilaa.lista;


public class NewMain {

    
    public static void main(String[] args) {
        
        ListaEnlazada listaAlumnos = new ListaEnlazada();
        
        System.out.println("tamaño: "+listaAlumnos.cantidadNodos());
        
        String nodoJuanito = "Juanito";
        String nodoMaria = "Maria";
        String nodoLupita = "Lupita";
        String nodoCarlos  = "Carlos";
        
      
        
        System.out.println("tamaño: "+ listaAlumnos.cantidadNodos());
        listaAlumnos.mostrarlista();
    }
    
}
