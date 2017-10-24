
/**
 * Write a description of class Carpeta here.
 *
 * Gonzalo Garcia Hernandez
 * Sebastián Henao Zapata
 */
import java.util.ArrayList;

public class Carpeta
{
    String nombre;
    ArrayList<Carpeta> carpetas = new ArrayList<>();
    ArrayList<String> ficheros = new ArrayList<>();
    Carpeta papa;
    String ruta = "";

    /**
     * Constructor de la clase carpeta, insertar null si esta no tiene carpeta padre.
     */
    public Carpeta(String nombre,Carpeta papa){
        this.nombre = nombre;
        this.papa = papa;
    }

    public void insertarC(Carpeta newCarpeta){
        carpetas.add(newCarpeta);
    }

    public void insertarF(String newFichero){
        ficheros.add(newFichero);
    }

    public Carpeta thisCarpeta(int n){ //seleccionar la carpeta en la posicion n
        return carpetas.get(n);
    }

    public Carpeta ultimaC(){ //devuelve la ultima carpeta agregada
        return carpetas.get(carpetas.size()-1); 
    }

    public String buscarCarpeta(Carpeta carpeta,String name){
        if(carpeta.nombre.equals(name)){
            buscarPadres(carpeta);
        }else if(carpeta.carpetas.size() == 0){

        }else{
            for(Carpeta sc: carpeta.carpetas){
                buscarCarpeta(sc,name);
            }                                 
        }
        return ruta;
    }

    public void buscarPadres(Carpeta carpeta){
        if(carpeta.papa == null){

        }else{
            buscarPadres(carpeta.papa);
            ruta += carpeta.papa.nombre+"/";
        }
    }

    public boolean buscarFichero(String name){
        boolean encontrada = false;
        for(String fi: ficheros){
            if(fi.equals(name)){
                //buscarPadres();
                return  true;
            }
        }
        int i = 0;
        while(encontrada == false && carpetas.size()>0){
            encontrada = carpetas.get(i).buscarFichero(name);
            i++;
            if(encontrada == true){
                break;
            }else if(i == carpetas.size()){
                return false;
            }
        }
        
        if(encontrada){
            return true;
        }
        return false;
    }

    public static boolean main(String[] args){
        Carpeta papa = new Carpeta("Padre",null);
        Carpeta c1 = new Carpeta("DataSets",papa);
        Carpeta c2 = new Carpeta("Plantillas",papa);

        papa.insertarC(c1);
        papa.insertarC(c2);
        
        c2.insertarF("Gonzalo");
        
        return papa.buscarFichero("Gonzalo");
    }
}