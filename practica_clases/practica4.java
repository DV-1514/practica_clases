package practica_clases;

import java.util.*;


public class practica4 {

    public static void main(String[] args){

        Persona[] lasPersonas=new Persona[2];
        lasPersonas[0]=new Empleado2("Luis", 5200, 2009, 03, 25);
        lasPersonas[1]=new Alumno("Dante", "Programacion");

        for(Persona p: lasPersonas){
            System.out.println("Nombre: " + p.dameNombre() + " ; " + p.dameDescrip());
        }
    }

}
            
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

  





class Empleado2 extends Persona{

    public Empleado2(String nom, double sue, int año, int mes, int dia){
    
        super(nom);
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(año, mes, dia);

        altaContrato=calendario.getTime();
        ++idsiguiente;
        Id=idsiguiente;
    }


    public double dameSueldo(){

        return sueldo;

    }

    public Date dameFechaContrato(){

        return altaContrato;

    }

    public void subeSueldo(double porcentaje){

        double aumento=sueldo*porcentaje/100;

        sueldo+=aumento;

    }
    public String dameDescrip(){
        return "Tiene un Id= " + Id + " con un sueldo= " + sueldo;
    }

    private double sueldo;
    private Date altaContrato;
    private static int idsiguiente;
    private int Id;

        

    }




class Alumno extends Persona{

    public Alumno(String nom, String carr){

        super(nom);
        carrera=carr;

    }


    public String dameDescrip(){
        return "Este alumno esta estudiando: " + carrera;

    }

    private String carrera;

}


    
    

