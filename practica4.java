package practica_clases;

import java.util.GregorianCalendar;

public class practica4 {

    public static void main(String[] args){





abstract class Persona{

    public Persona(String nom){

        nombre=nom;
    }

    public String dameNombre(){
        return nombre;
    }

    public abstract String dameDescrip();

    private String nombre;
}   

  





class Empleado2 extends Perona{

    public Empleado(String nom, double sue, int año, int mes, int dia){
    
        super(nom);
        sueldo=sue;
        GregorianCalendar=new GregorianCalendar(año, mes, dia);
        altaContrato=calendario.getTime();
        ++idsiguiente;
        Id=idsiguiente;
    }


    public double dameSueld(){

        return sueldo;

    }

    public Date dameFechaContrato(){

        return altaContrato;

    }

    public void subeSueldo(double porcentaje){

        double aumento=sueldo*pocentaje/100;

        sueldo+=aumento;

    }
    public String dameDescrip(){
        return "Tiene un Id= " + Id + "con un sueldo= " + sueldo;
    }

    private double sueldo;
    private Date altaContrato;
    private static int idsiguiente;
    private int Id;

        

    }


}            
            
}   


    
    

