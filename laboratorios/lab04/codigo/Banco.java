
import java.util.*;

public class Banco {
    public static void filas(Queue<String> A,Queue<String> B,Queue<String> C, Queue<String> D){
        Queue<String> caj1 = new LinkedList<String>();
        Queue<String> caj2 = new LinkedList<String>();
        
        int cont = 0;
        
        ArrayList<Queue<String>> adminFil = new ArrayList<>();
        adminFil.add(A); //pos 0
        adminFil.add(B); //pos 1
        adminFil.add(C); //pos 2
        adminFil.add(D); //pos 3
        
        while(A.peek()!=null || B.peek()!=null || C.peek()!=null || D.peek()!=null){
            caj1.offer(adminFil.get(cont).poll());
            cont++;
            caj2.offer(adminFil.get(cont).poll());
            cont++;
            if(cont > 3){
                cont = 0;
            }
        }
        
        while(caj1.peek()!=null || caj2.peek()!=null){
            if(caj1.peek()!=null){
                System.out.println("Cajero1 :"+caj1.poll());
            }
            if(caj2.peek()!=null){
                System.out.println("Cajero2 :"+caj2.poll());
            }
            
            if(caj1.peek()==null){
                caj1.poll();
            }
            if(caj2.peek()==null){
                caj2.poll();
            }
        }
    }
    
    public static void main(String[] args)
    {
        Queue<String> f1 = new LinkedList<String>();
        Queue<String> f2 = new LinkedList<String>();
        Queue<String> f3 = new LinkedList<String>();
        Queue<String> f4 = new LinkedList<String>();
        
        f1.add("Juan");
        f1.add("Pedro");
        f1.add("Piter");
        
        f2.add("John");
        f2.add("Cenna");
        
        f3.add("Callejas");
        
        f4.add("Esteban");
        f4.add("Maicol");
        
        filas(f1,f2,f3,f4);
    }
}
