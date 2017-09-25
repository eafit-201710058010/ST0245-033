import java.util.*;

/**
 * Gonzalo Garcia Hernadez  
 * Sebastián Hneao Zapata
 */
public class Taller8
{
    public static void punto1 (Stack<Integer> pila) {
        System.out.println(pila);
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        //se vasea todo en stack
        stack.push(pila.pop());
        stack.push(pila.pop());
        stack.push(pila.pop());
        
        stack2.push(stack.pop());
        stack2.push(stack.pop());
        
        pila.push(stack.pop());
        
        pila.push(stack2.pop());
        pila.push(stack2.pop());
        
        System.out.println(pila+"\n");
    }
    
    public static void punto2(Queue<String> cola){
        while(cola.size() > 0){
            System.out.println("Atendiendo a "+cola.poll());
        }
    }
    
    public static void punto3(String s){
        Stack<Integer> pila = new Stack<Integer>();
        
        for(int i = 0;i< s.length();i++){
            if((s.charAt(i) != '+')&&(s.charAt(i) != '-')&&(s.charAt(i) != '*')){
                int num = (int)s.charAt(i);
                pila.push(num);
            }else if(s.charAt(i) == '+'){
                int ultima = pila.pop();
                int penultima = pila.pop();
                pila.push(ultima+penultima);
            }else if(s.charAt(i) == '-'){
                int ultima = pila.pop();
                int penultima = pila.pop();
                pila.push(penultima-ultima);
            }
            else if(s.charAt(i) == '*'){
                int ultima = pila.pop();
                int penultima = pila.pop();
                pila.push(ultima*penultima);
            }
        }
        int asc = pila.pop();
        char res = (char)asc;
        System.out.println("El resultado de \""+s+"\" es: "+res);
    }
    
    public static void main(String args[]){
        System.out.println("Punto 1: \n");
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        punto1(stack);
        
        System.out.println("Punto 2: \n");
        Queue<String> queue = new LinkedList<String>();
        queue.add("Juan");
        queue.add("María");
        queue.add("Pedro");
        punto2(queue);
        
        System.out.println("\nPunto 3: \n");
        punto3("65-4+");
    }
}
