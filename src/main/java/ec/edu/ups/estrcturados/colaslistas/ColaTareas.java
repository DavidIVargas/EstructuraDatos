/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estrcturados.colaslistas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author David Vargas
 */
public class ColaTareas<T> {
    private Queue<Tarea<T>> colaTareas;
    
    public ColaTareas(){
        colaTareas = new LinkedList();
    }
    
    public void agregarTarea(Tarea<T> tarea){
        colaTareas.offer(tarea);
    }
    
    public Tarea<T> procesarTarea(){
        Tarea<T> tareaProsesada = colaTareas.poll();
        return tareaProsesada;
    }
    
    public boolean estaVacia(){
        return colaTareas.isEmpty();
    }
}

