package practica_clases;
import java.util.*;

public class practica2 {

	public static void main(String[] args) {
		

		// instancias
	/*amigos amigo1=new amigos("Alberto", 24, "Municipal", 1997, 4, 22);
	amigos amigo2=new amigos("Lautaro", 25, "Desempelado", 1995, 9, 12);
	
	System.out.println("Nombre: " + amigo1.dame_nombre() + " edad: " + amigo1.dame_edad() + 
	" trabajo: " + amigo1.dame_trabajo() + " Nacimiento: " + amigo1.dame_fecha());
	
	System.out.println("Nombre: " + amigo2.dame_nombre() + " edad: " + amigo2.dame_edad() + 
			" trabajo: " + amigo2.dame_trabajo() + " Nacimiento: " + amigo2.dame_fecha());*/
	
		//instancias con arrays o matriz
	
	
		jefatura jefe=new jefatura("Juan", 40, "Administraci�n", 1950, 12, 11); 
			
			jefe.suma_trabajo("Logistica");
			
			System.out.println("Nombre " + jefe.dame_nombre() + " edad " + jefe.dame_edad()
			+ " trabajo " + jefe.dame_trabajo_jefe() + " fecha " + jefe.dame_fecha());
		
		amigos[] misAmigos=new amigos[4];
	
	misAmigos[0]=new amigos("Alberto", 24, "municipal", 1997, 4, 22);
	misAmigos[1]=new amigos("Lautaro", 25, "Desempleado", 1995, 9, 25);
	misAmigos[2]=new amigos("Dante");
	misAmigos[3]=jefe; //polimorfismo _ principio de sustitucion
	
	System.out.println(jefe.tomarDecisiones("Despedir a todos")); //interfaz creada "jefes"
	System.out.println("el jefe " + jefe.dame_nombre() + " tiene un bonus de " + jefe.estableceBonus(500)); //interfaz creada "trabajadores"
	System.out.println("yo " + misAmigos[2].dame_nombre() +  " tiene un bonus de " + misAmigos[2].estableceBonus(500)); //interfaz creada "trabajadores"
	Arrays.sort(misAmigos);
	
	for (int i=0; i<4; i++) {
		System.out.println("Nombre: " + misAmigos[i].dame_nombre() + " Edad: " + 
	misAmigos[i].dame_edad() + " Trabajo " + misAmigos[i].dame_trabajo() + " Nacimiento: " +
	misAmigos[i].dame_fecha());
	}
	
	}
}

class amigos implements Comparable, trabajadores {
	
	public amigos(String nom, int ed, String job, int agno, int mes, int dia) {//constructor 1
		
		nombre=nom;
		
		edad=ed;
		
		trabajo=job;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);//parametros del constructor
		
		cumple=calendario.getTime();
		
	}
	
	public amigos(String nom) { //constructor 2
		
		this(nom, 20, "Desempleado", 2000, 1, 1);
	}
	
	public String dame_nombre() {
		
		return nombre;
	}
	
	public int dame_edad() {
		
		return edad;
		
	}
	
	public String dame_trabajo() {
		
		return trabajo;
		
	}
	
	public Date dame_fecha() {
		
		return cumple;
		
	}
	
	public int compareTo(Object miObjeto){

		amigos otroAmigo=(amigos) miObjeto;

		if(this.edad<otroAmigo.edad){
			
			return -1;

		}
		if(this.edad>otroAmigo.edad){

			return 1;

		}return 0;
	}
	public double estableceBonus(double bonus){
		return trabajadores.bonus_base+bonus;
	}
	
	private String nombre;
	
	private int edad;
	
	private String trabajo;
	
	private Date cumple;
	
}

class jefatura extends amigos implements jefes {
	
	public jefatura(String nom, int ed, String job, int agno, int mes, int dia) {
		
		super(nom, ed, job, agno, mes, dia);
		
	}
	
	public void suma_trabajo(String trabajo_secundario) {
		
		trabajo=trabajo_secundario;
		
	}
	
	public String dame_trabajo_jefe() {
	
		
		return trabajo;
	}
	
	public String tomarDecisiones(String desicion){
		return "un miembro de la direccion ha tomado la desicion de: " + desicion;
	}

	public double estableceBonus(double bonus){
		double prima=2000;
		return trabajadores.bonus_base+bonus+prima;
	}
	
	private String trabajo;
}