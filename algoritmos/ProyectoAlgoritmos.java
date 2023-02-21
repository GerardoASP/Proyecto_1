/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.algoritmos;

import java.io.Console;

/**
 *
 * @author TuF
 */
public class ProyectoAlgoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double time_start, time_end;
        InsertionSort insertion = new InsertionSort();
        MergeSort merge = new MergeSort();
        Numeros numeros = new Numeros();
        
        
        //Con 100 numeros
         int[ ] arr = numeros.numeros(100);
         time_start=System.currentTimeMillis();
         int[ ] arr2=insertion.InsertionSort(arr);
         time_end=System.currentTimeMillis();
         System.out.println((time_end-time_start)/1000);
         time_start=System.currentTimeMillis();
         int[ ] arr3=merge.sort(arr, 0, arr.length-1);
         time_end=System.currentTimeMillis();
         System.out.println((time_end-time_start)/1000);
       insertion.imprimirArreglo(arr2);
       insertion.imprimirArreglo(arr3);
       
        //Con 1000 numeros
        arr = numeros.numeros(1000);
         time_start=System.currentTimeMillis();
         arr2=insertion.InsertionSort(arr);
         time_end=System.currentTimeMillis();
         System.out.println((time_end-time_start)/1000);
        time_start=System.currentTimeMillis();
         arr3=merge.sort(arr, 0, arr.length-1);
         time_end=System.currentTimeMillis();
         System.out.println((time_end-time_start)/1000);
       insertion.imprimirArreglo(arr2);
       insertion.imprimirArreglo(arr3);
       
       //Con 10000 numeros
        arr = numeros.numeros(10000);
         time_start=System.currentTimeMillis();
         arr2=insertion.InsertionSort(arr);
         time_end=System.currentTimeMillis();
         System.out.println((time_end-time_start)/1000);
        time_start=System.currentTimeMillis();
         arr3=merge.sort(arr, 0, arr.length-1);
         time_end=System.currentTimeMillis();
         System.out.println((time_end-time_start)/1000);
       insertion.imprimirArreglo(arr2);
       insertion.imprimirArreglo(arr3);
       
       //Con 100000 numeros
       arr = numeros.numeros(100000);
         time_start=System.currentTimeMillis();
         arr2=insertion.InsertionSort(arr);
         time_end=System.currentTimeMillis();
         System.out.println((time_end-time_start)/1000);
       time_start=System.currentTimeMillis();
         arr3=merge.sort(arr, 0, arr.length-1);
         time_end=System.currentTimeMillis();
         System.out.println((time_end-time_start)/1000);
       insertion.imprimirArreglo(arr2);
       insertion.imprimirArreglo(arr3);
       
       
        //Con 1000000 numeros
       arr = numeros.numeros(1000000);
         time_start=System.currentTimeMillis();
         arr2=insertion.InsertionSort(arr);
         time_end=System.currentTimeMillis();
         System.out.println((time_end-time_start)/1000);
        time_start=System.currentTimeMillis();
         arr3=merge.sort(arr, 0, arr.length-1);
         time_end=System.currentTimeMillis();
         System.out.println((time_end-time_start)/1000);
       insertion.imprimirArreglo(arr2);
       insertion.imprimirArreglo(arr3);
       
       
          
         
        
    }
   
}
