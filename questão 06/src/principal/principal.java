package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		int numero,divisores=0;
		Scanner sc= new Scanner(System.in);
	System.out.println("Digite um numero:");
	numero=sc.nextInt();
		for (int i = 1; i <= numero; i++) {
	        if (numero % i == 0) {
	    
	        	divisores++;
	        }
	   
	    }
		if(divisores==2) {
			System.out.println("O n�mero " + numero + " � primo");
		} else {
			System.out.println("O n�mero " + numero + " n�o � primo");
		}
	}
}


