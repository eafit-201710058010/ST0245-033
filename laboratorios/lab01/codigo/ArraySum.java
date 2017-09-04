import java.util.*;
/**
 * 
 * @Sebastian Henao Zapata
 * @Gonzalo Garcia Hernandez
 */
public class ArraySum
{
    /**
     * Main de la clase que imprime el tiempo
     * recibe la cantidad de elementos que tendra el array
     */
    public static void main(String[] args, int n){
            System.out.println("suma de arrays de tamaño " + n +" tarda : "+ tomarElTiempoParaN(n)+ "nanosegundos");
    }

    /**
     * metodo que suma los elementos de un array de forma recursiva
     * codigo basado en un codigo de C encontrado en http://www.jgutierrezgil.es/2009/12/10/suma-de-los-elementos-de-un-vector-de-forma-recursiva-en-c/
     * recibe un array y la cantidad de elementos ue tiene el array
     * retorna el resultado de la suma de todos los elementos
     */
    public static int arraySum(int[] A,int n) {
        int r=0;
        if (n==0){
            r+= A[0];
        }
        else {
          r= A[n]+arraySum (A,n-1);
        }
        return r;
    } 

    /**
     * metodo que toma el tiempo que se tarda la ejecución de la suma de los elementos del array
     * recibe la cantidad de elementos que tendra el array
     * retorna el tiempo de ejecución
     */
    public static long tomarElTiempoParaN(int n){
        int[] arreglo = crearUnArregloAleatorio(n);
        long startTime = System.nanoTime();
        arraySum(arreglo,arreglo.length-1);
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    /**
     * mtodo que crea un array aleatorio
     * recibe la longitud del array
     * retorna el array creado
     */
    public static int[] crearUnArregloAleatorio(int n){
        int max = 5000;
        int[] array = new int[n];
        Random generator = new Random();
        for (int i =0; i<n; i++){
            array[i] = generator.nextInt(max);
        }
        return array;
    }
}
