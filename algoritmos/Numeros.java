/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.algoritmos;

import java.util.Random;

/**
 *
 * @author TuF
 */
public class Numeros {
    
    public int[] numeros(int tamaño)
    {
        int[] arr = new int[tamaño];
        for(int i=0; i<arr.length;i++)
        {
            Random randomobj = new Random();
            long seed = 12354;
            randomobj.setSeed(seed);
            
            arr[i] = randomobj.nextInt();
        }
        
        return arr;
    }
}
