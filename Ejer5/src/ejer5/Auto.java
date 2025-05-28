
package ejer5;

public class Auto {
    
   
    public class Motor{
        String tMotor;

        public String tipo(){
            tMotor = "V8";
            return tMotor;
        }
    }
    public void mostrarTipo(){
        Motor m1 = new Motor();
        System.out.println("Tipo de motor: "+m1.tipo());
    }
}
