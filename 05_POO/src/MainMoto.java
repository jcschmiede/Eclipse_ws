
public class MainMoto {
	public static void main(String[] args) {

		Moto moto = new Moto("1234", "Yamaha", 0, 20);
		int posicion = moto.acelerar(true);
		System.out.println(posicion);
		moto.acelerar(true);
		moto.acelerar(true);
		moto.acelerar(true);
		System.out.println(moto);
		moto.acelerar(false);
		System.out.println(moto);

		Moto moto2=new Moto("7894","BMW", 0, 25);
		moto2.acelerar(true);
		System.out.println(moto2);
		moto2.velocidad = 10; 			
		moto2.acelerar(true);
		System.out.println(moto2);
	//  moto2.velocidadInicial = 2; 							no puedo acceder a ello porque es privada
		moto2.meterseEnBoxes();
		moto2.acelerar(true);
		System.out.println(moto2);
		
		System.out.println(moto2.getVelocidadInicial());
		
	}
}
