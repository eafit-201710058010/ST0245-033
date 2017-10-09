/**
 * Gonzalo Garcia Hernandez
 * En colaboración de:
 * Eduard Damiam Londoño & Esteban Osorio Flores
 * 
 * Codigo basado de: 
 * https://github.com/AhmedHani/Online-Judges-Problems-SourceCode/blob/master/UVa/101%20-%20The%20Blocks%20Problem.java
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class bloques {
    public static int NumberBlocks;
    public static Stack<Integer> Blocks[];
    public static int posicion[];
    public static String Line; 
    public static int A, B;

    public static void main(String[] args) throws IOException{
        BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
        NumberBlocks = Integer.parseInt(Input.readLine());
        Blocks = new Stack[NumberBlocks];
        posicion = new int[NumberBlocks];
        for(int i = 0; i < NumberBlocks; i++) {
            Blocks[i] = new Stack<Integer>();
            Blocks[i].push(i);
            posicion[i] = i;
        }

        Line = "";
        while(!(Line = Input.readLine()).equals("quit")) {
            StringTokenizer token = new StringTokenizer(Line);
            String First = token.nextToken();
            A = Integer.parseInt(token.nextToken());
            String Second = token.nextToken();
            B = Integer.parseInt(token.nextToken());

            if(A == B || posicion[A] == posicion[B]) continue;
            if(First.equals("move")) {
                if(Second.equals("onto")) {
                    MoveOnto(A, B);
                } else if(Second.equals("over")) {
                    MoveOver(A, B);
                }
            } else if(First.equals("pile")) {
                if(Second.equals("onto")) {
                    PileOnto(A, B);
                } else if(Second.equals("over")) {
                    PileOver(A, B);
                }
            }
        }
        
        for(int i = 0; i < Blocks.length; i++){
            System.out.println(solucion(i));
        }
    }

    public static void MoveOnto(int First, int Second) {
        limpiar(Second);
        MoveOver(First, Second);
    }

    public static void MoveOver(int First, int Second) {   
        limpiar(First);
        Blocks[posicion[Second]].push(Blocks[posicion[First]].pop());
        posicion[First] = posicion[Second];
    }
    
    public static void PileOnto(int First, int Second) {
        limpiar(Second);
        PileOver(First, Second);
    }

    public static void PileOver(int First, int Second) {
        Stack<Integer> Pile = new Stack<Integer>();
        while(Blocks[posicion[First]].peek() != First) {
            Pile.push(Blocks[posicion[First]].pop());
        }
        Pile.push(Blocks[posicion[First]].pop());
        while(!Pile.isEmpty()) {
            int Tmp = Pile.pop();
            Blocks[posicion[Second]].push(Tmp);
            posicion[Tmp] = posicion[Second];
        }
    }

    public static void limpiar(int Block) {
        while(Blocks[posicion[Block]].peek() != Block) {
            inicial(Blocks[posicion[Block]].pop());
        }
    }

    public static void inicial(int Block) {   
        while(!Blocks[Block].isEmpty()) {
            inicial(Blocks[Block].pop());
        }
        Blocks[Block].push(Block);
        posicion[Block] = Block;
    }

    public static String solucion(int Index) {
        String Result = "";
        while(!Blocks[Index].isEmpty()) Result = " " + Blocks[Index].pop() + Result;
        Result = Index + ":" + Result;
        return Result;
    }
}