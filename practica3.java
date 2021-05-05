package practica_clases;

public class practica3 {

	public static void main(String[] args) {
	

		
		Empleados empleado1=new Empleados("Dante");
		Empleados empleado2=new Empleados("Tino");
		Empleados empleado3=new Empleados("Lautaro");
		Empleados empleado4=new Empleados("Mati");
		

		empleado1.cambiaSeccion("Servicios");

		empleado2.cambiaSeccion("logistica");
		
		System.out.println(empleado1.dame_seccion());
	
		System.out.println(empleado2.dame_seccion());
		
		System.out.println(empleado3.dame_seccion());
		
		System.out.println(empleado4.dame_seccion());
	}

}


class Empleados{
	
	public Empleados(String nom) {
		
		nombre=nom;
		
		seccion="administración";
		
		id=idsiguiente;
		
		idsiguiente++;
		
		
	}
	
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
		
	}
	
	public String dame_seccion() {
		
		return "El nombre es " + nombre + " y la seccion es " + seccion + " y el id es " + id;
	}
	
	private String nombre;
	
	private String seccion;
	
	private int id;
	
	private static int idsiguiente=1;
	
	//public static int id; //variable compartida
	
	
}