
public class Bucles {

	public static void main(String[] args) {
		
	    for (int i=0;i<=10;i++){
	        System.out.println("el numero es: " + i);
	    }

	    int contador = 0;
	    while(contador <= 10){
	        System.out.println("el contador vale: " + contador);
	        contador++;
	    }
	    contador = 0;
	    do{
	        System.out.println("el contador vale: " + contador);
	        contador++; 
	    }while(contador <= 10);
	    System.out.println(contador);

	}
}
