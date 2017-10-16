
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        BinarySearchTree arb = new BinarySearchTree();
        arb.insertar(5);
        arb.insertar(9);
        arb.insertar(8);
        arb.insertar(10);
        arb.insertar(3);
        arb.insertar(4);
        arb.insertar(1);
        
        System.out.println("En pos-orden, sería: ");
        posOrden pos = new posOrden(arb);
        System.out.println("\ny en pre-orden sería: ");
        preOrden pre = new preOrden(arb);
    }
}
