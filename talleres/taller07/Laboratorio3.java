/*
 * -Sebastian Henao Zapata
 *- Gonzalo Garcia Hernandez
 */

public class Laboratorio3 {
    static int maximoAux(Nodo nodo, int max){
        if(nodo.next == null){
            return max;
        }
        if(max < nodo.data){
            max = nodo.data;
        }
        
    }
    
    public static int maximo(LinkedListMauricio lista) {
        return maximoAux(lista.first,0);
    }


    public static void main(String[] args)
    {
        LinkedListMauricio list = new LinkedListMauricio();
        list.insert(5, 0);
        list.insert(4, 0);
        list.insert(3, 0);
        list.insert(2, 0);
        list.insert(1, 0);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        
        System.out.println(list.contains(3));
        list.remove(2);
        System.out.println(list.contains(3));
        for (int i = 0; i <
        list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}