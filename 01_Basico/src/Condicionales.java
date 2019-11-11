
public class Condicionales {

	public static void main(String[] args) {
		//ifs
		boolean cierto = true; //en js es "var cierto = true;"
		if(cierto == true) { //en js es "if(cierto == true){"
			System.out.println("El valor es cierto"); //en js es "console.log("El valor es cierto");"
		}		
		
		int numero1 = 1;
	    int numero2 = 10;

	    if(numero1 > 0 && numero2 < 20){
	        System.out.println("El numero es mayor que 0 AND menor que 20");
	    }

	    if(numero1 < 0 || numero2 < 20){
        System.out.println("El numero es mayor que 0 OR menor que 20");
	    }
	    
	    int numero = 1;
	    if(numero == 0){
	    	System.out.println("el numero vale 0");
	    }else if(numero == 1){
	    	System.out.println("el numero vale 1");
	    }else if(numero == 2){
	    	System.out.println("el numero vale 2");
	    }else{
	    	System.out.println("el numero no vale ni 0, ni 1, ni 2");
	    }
	 }
}