
public class MainPersona {
	public static void main(String[] args) {

		Persona p1 = new Persona();		//El valor inicial de las variables primitivas son 0, y el de las referencias "null"
		p1.nombre = "Bartolo";
		p1.edad = 29;
		p1.peso = 58.5; 
	
		System.out.println(p1.nombre);
		System.out.println(p1.edad);
		System.out.println(p1.peso);
	
		System.out.println(p1);			//Imprime la dirección de la referencia
		
		Persona p2 = new Persona();
		
		
		p2.nombre = "Bud Spencer";
		p2.edad = 78;
		p2.peso = 119;
		
		System.out.println(p2.nombre);
		System.out.println(p2.edad);
		System.out.println(p2.peso);
		
		System.out.println(p2);		
		
		Persona p3 = p2; 
		p3.edad = 55; 			
		
		System.out.println(p3.edad);			
		System.out.println(p2.edad);
		
		Persona p4=new Persona("Juan", 67, 18);
		System.out.println(p4.nombre);
		System.out.println(p1.nombre);
	}
}
