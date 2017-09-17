
/**
 * Write a description of class codigo here.
 * 
 * @Gonzalo Garcia Hernandez
 * @Sebastián Henao Zapata
 * @version (a version number or a date)
 */
import java.util.Random;
public class Todo {
    /**
     * metodo que suma los elementos de un array de forma recursiva
     * codigo basado en un codigo de C encontrado en http://www.jgutierrezgil.es/2009/12/10/suma-de-los-elementos-de-un-vector-de-forma-recursiva-en-c/
     * recibe un array y la cantidad de elementos que tiene el array
     * retorna el resultado de la suma de todos los elementos
     */
    public int arraySum(int[] A) {
        try        
        {
            Thread.sleep(100);     //Esto congela el programa por 100 milisegundos
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        
        int sum = 0;
        for (int i = 0; i < A.length; i++)
        sum = sum + A[i];
        return sum;
    }
    
    /**
     * Este metodo recive un arreglo de enteros y un numero n de elementos de este arreglo, retorna el elemento mayor del arreglo
     */
    public static int ArrayMax(int[] A)
    {
        try        
        {
            Thread.sleep(100);     //Esto congela el programa por 100 milisegundos
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        
        int max = A[0];
        for (int i = 0; i < A.length; i++)
        if (A[i] > max)
        max = A[i];
        return max;
    }
    
    /**
     * Este metodo ordena los elementos de un arreglo de forma decreciente
     */
    public static void InsertionSort(int[] A)
    {
        try        
        {
            Thread.sleep(100);     //Esto congela el programa por 100 milisegundos
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        
        int temp,j;
        for (int i = 0; i < A.length; i++)
        {
            j = i;
            while (j > 0 && A[j-1] > A[j])
            {
                temp = A[j];
                A[j] = A[j-1];
                A[j-1] = temp;
                j = j-1;
            }           
        }
    }
    
    /**
     * Este metodo ordena los elementos de un arreglo de forma creciente
     */
    public static void mergeSort(int [ ] a)
    {
        try        
        {
            Thread.sleep(100);     //Esto congela el programa por 100 milisegundos
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        
        int[] tmp = new int[a.length];
        mergeSort(a, tmp,  0,  a.length - 1);
    }

    private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
    {
        if( left < right )
	{
	    int center = (left + right) / 2;
	    mergeSort(a, tmp, left, center);
	    mergeSort(a, tmp, center + 1, right);
	    merge(a, tmp, left, center + 1, right);
	}
    }
	
	private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
    
    /**
     * Aqui se realizan las ejecuciones y toma de tiempo para cada uno de los metodos.
     */
    public static void main(String[] args){
        Todo max = new Todo();
        
        //Cada uno de estos segmentos crea varios arreglos y los ensaya en un metodo, los arreglos
        //irán aumentando de tanto en tanto hasta el objetivo especificado dentro del arreglo
        //el objetivo va condicionado por la regla i <= X, donde X es el objetivo a alcanzar.
        for(int i = 10000; i <= 10000000; i = i * 10){ //Crea un arreglo de i elementos
            int n = i;
            int[] rand = new int[n];
            for(int j = n - 1; j >= 0; j--){    //rellena cada posición del arreglo
                rand[j] = (int)(Math.random() * 100 + 1);
            }
            
            long startTime = System.currentTimeMillis();
            max.ArrayMax(rand);        //Aqui va el metodo al cual se le tomará el tiempo
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("ArrayMax de "+i+" :"+estimatedTime);
        }
        
        //Cada uno de estos segmentos crea varios arreglos y los ensaya en un metodo, los arreglos
        //irán aumentando de tanto en tanto hasta el objetivo especificado dentro del arreglo
        //el objetivo va condicionado por la regla i <= X, donde X es el objetivo a alcanzar.
        System.out.println();
        for(int i = 10000; i <= 10000000; i = i * 10){  //crea un arreglo de i elementos
            int n = i;
            int[] rand = new int[n];
            for(int j = n - 1; j >= 0; j--){    //rellena cada posición del arreglo
                rand[j] = (int)(Math.random() * 100 + 1);
            }
            
            long startTime = System.currentTimeMillis();
            max.arraySum(rand);       //Aqui va el metodo al cual se le tomará el tiempo
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("ArraySum de "+i+" :"+estimatedTime);
        }
        
        //Cada uno de estos segmentos crea varios arreglos y los ensaya en un metodo, los arreglos
        //irán aumentando de tanto en tanto hasta el objetivo especificado dentro del arreglo
        //el objetivo va condicionado por la regla i <= X, donde X es el objetivo a alcanzar.
        System.out.println();
        for(int i = 100; i <= 100000; i = i * 10){    //crea un arreglo de i elementos
            int n = i;
            int[] rand = new int[n];
            for(int j = n - 1; j >= 0; j--){    //rellena cada posición sdel arreglo
                rand[j] = (int)(Math.random() * 100 + 1);
            }
            
            long startTime = System.currentTimeMillis();
            max.InsertionSort(rand);   //Aqui va el metodo al cual se le tomará el tiempo
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("InsertionSort de "+i+" : "+estimatedTime);
        }
        
        //Cada uno de estos segmentos crea varios arreglos y los ensaya en un metodo, los arreglos
        //irán aumentando de tanto en tanto hasta el objetivo especificado dentro del arreglo;
        //el objetivo va condicionado por la regla i <= X, donde X es el objetivo a alcanza.
        System.out.println();
        for(int i = 100; i <= 100000; i = i * 10){//crea un arreglo de i elementos
            int n = i;
            int[] rand = new int[n];
            for(int j = n - 1; j >= 0; j--){    //rellena cada posición del arreglo
                rand[j] = (int)(Math.random() * 100 + 1);
            }
            
            long startTime = System.currentTimeMillis();
            max.mergeSort(rand);   //Aqui va el metodo al cual se le tomará el tiempo
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("MergeSort de "+i+" : "+estimatedTime);
        }
    }
}