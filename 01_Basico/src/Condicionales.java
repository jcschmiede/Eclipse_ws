
public class Condicionales {
	public static void main(String[] args) {
		
		 boolean cierto = true;
	        //IF
	        if (cierto==true){
	            System.out.println("El valor es cierto");
	        }

	        if(cierto!=true){           //Es igual que poner if(cierto==false)
	            System.out.println("El valor es falso");   //no lo va a mostrar porque es true;
	        }
	        if (cierto){				//Es igual que poner (cierto==true), porque entra por el valor true
	                System.out.println("El valor es verdadero");
	        }
	        if(!cierto){
	                System.out.println("El valor es falso");
	        }
	        if(cierto){
	            System.out.println("Es cierto");
	            System.out.println("y lo sabes");
	        }
	        if(!cierto){
	            System.out.println("es falso");
	        }
	            System.out.println("y lo sabes"); //como est� fuera del if, s� lo va a imprimir
	        //Todas las estructuras de control pueden lleint llaves o no; si no la llevan, afecta solamente a la siguiente l�nea

	        if(!cierto)
	            System.out.println("Es falso");
	            System.out.println("y muy falso tambi�n"); //esta linea s� la va a imprimir porque el if solo coge la primera l�nea 
	        
	            //para que coja m�s de una l�nea, tendr�a que rodear todo con llaves
	        
	        
	            
	            int numero1=0;
	            int numero2=10;

	            if(numero1>=0 && numero2<20){       //&& es AND
	                System.out.println("El n�mero es mayor o igual que 0 y menor que 20");
	            }
	            if (numero1<0 || numero2<20){       // || es OR
	                System.out.println("El n�mero es menor que 0 o menor que 20"); 
	            }   
	            
	            if(cierto){
	                System.out.println("La intiable es cierta");
	            }else{
	                System.out.println("La intiable no es cierta");
	            }
	             int numero=2;
	             if (numero==0) {
	            	 System.out.println("El n�mero vale 0");
	             }else if (numero==1) {
	            	 System.out.println("El numero vale 1");
	             }else if (numero==2) {
	            	 System.out.println("El n�mero vale 2");
	             }else {
	            	 System.out.println("El n�mero no vale ni 0, ni 1, ni 2");
	             }        	      
	             
//-----------------ATAJO----------------------
	             
	             //Si solo tenemos un if y un else, podemos ponerlo en una l�nea de la siguiente forma: 
	             //variable = (condition) ? expressionTrue :  expressionFalse;
	             
	             int time = 20;
	             String result = (time < 18) ? "Good day." : "Good evening.";
	             System.out.println(result);
	             
	             
	             
	}
}
