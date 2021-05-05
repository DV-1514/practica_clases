package practica_clases;
import java.util.*;
public class practica5 {

    //enum Talla{mini, mediano, grande, muy_grande};

    enum Talla{

        mini("s"), mediano("m"), grande("l"), muy_grande("xl");

        private Talla(String abreviatura){

            this.abreviatura=abreviatura;
        }

        public String dameAbreviatura(){
            return abreviatura;
        }
        private String abreviatura;
            
    }
    public static void main(String[] args){

      
        Scanner entrada=new Scanner(System.in);
        System.out.println("Coloca la talla: mini, mediano, grande. muy_grande");
        String entrada_datos=entrada.next().toLowerCase();

        Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);

        System.out.println("talla: " + la_talla);
        System.out.println("abreviatura: " + la_talla.dameAbreviatura());
//Tipo enumerado
        
    }
    
}
