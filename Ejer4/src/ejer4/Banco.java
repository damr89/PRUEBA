
package ejer4;

public class Banco {
    static double tasaInteres=1.12;
    
    public static void actualizar(double nuevaTasa){
        tasaInteres = nuevaTasa;
        //return tasaInteres;
    }
    public static void mostrar(){
        System.out.println("tasa de interes actual: "+tasaInteres+"%");
    }
}
