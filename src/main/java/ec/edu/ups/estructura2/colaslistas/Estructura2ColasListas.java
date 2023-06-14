/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.estructura2.colaslistas;

/**
 *
 * @author jeanp
 */
public class Estructura2ColasListas {

    public static void main(String[] args) {
        System.out.println("Colas y Pilas implementacion generica");
        //Instancias de las clases
        
        // Clases colaTarea
        ColaTareas<String> colaTareas = new ColaTareas<>();
        ColaTareas<Integer> colaTareasInt = new ColaTareas<>(); //Ingresar 3 elementos
        ColaTareas<int[]> colaTareasArregloEnteros = new ColaTareas<>(); // Ingresar 3 elementos
        ColaTareas<String[]> colaTareasArregloString = new ColaTareas<>(); //ingresar 3 elementos
        
        
        //Clases PilaTarea
        PilaTareas<Integer> pilaTareas = new PilaTareas<>();
        PilaTareas<ColaTareas> pilaTareasDeColas = new PilaTareas<>();
        
        
        /// Insercion de tareas a la cola
        colaTareas.agregarTarea(new Tarea(1, "Tarea 1"));
        colaTareas.agregarTarea(new Tarea(2, "Tarea 2"));
        colaTareas.agregarTarea(new Tarea(3, "Tarea 3"));
        colaTareas.agregarTarea(new Tarea(4, "Tarea 4"));
        colaTareas.agregarTarea(new Tarea(5, "Tarea 5"));
        colaTareas.agregarTarea(new Tarea(6, "Tarea 6"));
        
        colaTareasInt.agregarTarea(new Tarea(6, 6));
        
        
        /// Insercion de tareas a la pila
        pilaTareas.agregarTarea(new Tarea(6,6));
        pilaTareas.agregarTarea(new Tarea(7,7));
        pilaTareas.agregarTarea(new Tarea(8,8));
        
//      a =[]{212,21};
        Tarea<int[]> t2=new Tarea(8,new int[]{212,21,});
        colaTareasArregloEnteros.agregarTarea(t2);
        colaTareasArregloEnteros.agregarTarea(new Tarea(9, new int[] {212,21,}));
        
        //procesar las tareas de la Cola<String>
        while(!colaTareas.estaVacia()){
            Tarea<String> tareaProsesada = colaTareas.procesarTarea();
            
            System.out.println("Prosesando tarea de la cola: \n\t Sale-->"+ tareaProsesada.getId()+" - "+tareaProsesada.getAtributo());
        }
        
        System.out.println("\n ----- \n");
        
        //Procesar las tareas de la Pila<Integer>
        while(!pilaTareas.estaVacia()){
            Tarea<Integer> tareaProsesada = pilaTareas.procesarTarea();
            
            System.out.println("Prosesando pila de la tarea: \n\t Sale-->"+ tareaProsesada.getId()+" - "+tareaProsesada.getAtributo());
        }
    }
}
