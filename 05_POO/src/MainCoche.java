
public class MainCoche {
	public static void main(String[] args) {

		Coche coche1 = new Coche();


		coche1.marca = "Seat";
		coche1.modelo = "Ibiza";
		coche1.matricula = "1128CCS";
		coche1.esNuevo = true;

		Coche coche2 = new Coche("2915FCK", "Audi");
		

		Coche coche3 = new Coche("M 2643 FP","Citröen","C5", false);

		datosCoche(coche1);
		datosCoche(coche2);
		datosCoche(coche3);
	

	}

	public static void datosCoche(Coche coche){
		

		System.out.println("Marca: " + coche.marca);
		System.out.println("Modelo: " + coche.modelo);
		System.out.println("Matrícula: " + coche.matricula);
		if (coche.esNuevo) {
			System.out.println("Estado: Nuevo");
		} else {
			System.out.println("Estado: Segunda mano");
		}
		System.out.println("\n----------------\n");
	}
}
