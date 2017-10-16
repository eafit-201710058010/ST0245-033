
/**
 * Write a description of class posOrden here.
 *
 * Gonzalo Garcia Hernandez
 * 
 * en conjunto con: Eduard Damiam & Esteban Osorio
 */
public class posOrden
{
    public posOrden(BinarySearchTree arb){
        posOrdenAux(arb.root);
    }
    
    private void posOrdenAux(Node nodo){
        if(nodo.left != null){
            posOrdenAux(nodo.left);
        }
        if(nodo.right != null){
            posOrdenAux(nodo.right);
        }
        System.out.println(nodo.data);
    }
}
