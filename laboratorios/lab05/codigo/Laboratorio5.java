/** 
 * Gonzalo Garcia Hernandez
 * 
 * En conjunto con: Eduard Damiam & Esteban Osorio
 */
public class Laboratorio5 {

   public static void dibujarArbol(BinaryTree a)
   {
       System.out.println("/* arbolito para http://www.webgraphviz.com/ */"); 
       System.out.println("digraph arbolito {");
       System.out.println("size=\"6,6\";");
       System.out.println("node [color=aquamarine, style=filled];");
       dibujarArbolAux(a.root);
       System.out.println("}");
   }
   
   public static void dibujarArbolAux(Node nodo)
   {
      if (nodo != null)
         //"x_\n__" -> "xo\n__";
         for(Node n: new Node[] {nodo.left, nodo.right} ){
            if (n != null)
               System.out.println("\"" + nodo.data + "\" -> \"" + n.data + "\";");
            dibujarArbolAux(n);
        }
   }

    
    public static void main(String[] args) {
    
        //Crea el árbol familiar
        BinaryTree tree = new BinaryTree("Gonzalo");
        // ...
        Node gonza = new Node ("Gonzalo");
        Node teresa = new Node ("Teresa");
        Node alex = new Node ("Alex");
        Node Teodoro = new Node ("Teodoro");
        Node olga = new Node ("Olga");
        Node francisco = new Node ("Fracisco");
        Node heugenia = new Node ("Heugenia");
        
        tree.insertLeft(gonza,teresa);
        tree.insertRight(gonza,alex);
        tree.insertLeft(teresa,Teodoro);
        tree.insertRight(teresa,olga);
        tree.insertLeft(alex,francisco);
        tree.insertRight(alex,heugenia);
        //Imprime el árbol familiar
        tree.recursivePrint();

        //Dibuja el árbol familiar
        dibujarArbol(tree);
    }
}
