
package ejer3;

public class Contador {
    static int totalObjetos;
    public Contador(){
        totalObjetos++;
    }
    
    public void mostrarTotal(){
        System.out.println("numero de contador: "+totalObjetos);
    }
}
