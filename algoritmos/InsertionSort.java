/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.algoritmos;

/**
 *
 * @author TuF
 */
public class InsertionSort {
      

   
    
    public int[] InsertionSort(int[] arr)
    {
       
        int n = arr.length;
	for (int i = 1; i < n; ++i) {
            int key = arr[i];
	    int j = i - 1;
            while (j >= 0 && arr[j] > key) {
		arr[j + 1] = arr[j];
		j = j - 1;
            }
            arr[j + 1] = key;
		}
        
        return arr;
    }
    public void imprimirArreglo(int[] arr)
         {
             int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
         }
  
      
}
