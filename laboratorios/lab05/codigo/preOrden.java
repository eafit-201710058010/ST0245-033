
/**
 * 
 * Gonzalo Garcia Hernandez
 * 
 * en conjunto con: Eduard Damiam & Esteban Osorio
 */
public class preOrden
{
    public preOrden(BinarySearchTree arb){
        preOrdenAux(arb.root);
    }
    
    private void preOrdenAux(Node nodo){
        System.out.println(nodo.data);
        if(nodo.left != null){
            preOrdenAux(nodo.left);
        }
        if(nodo.right != null){
            preOrdenAux(nodo.right);
        }
    }
}