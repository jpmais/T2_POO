package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		   int n, num, i,j, fat=1;
		    Scanner sc = new Scanner(System.in); 		    
		    System.out.print("Digite a quantidade de numeros que serao lidos:");		 
		    n = sc.nextInt();		    
		    for( i=1; i<=n ; i++ ){
		       System.out.println("\n Digite o "+ i +"º número");
		          num = sc.nextInt();	
		          fat=1;
		    for( j=2; j<=num ; j++ ){
		        fat = fat * j;
		   }
		    if(fat!=0) {
		    	System.out.println("o fatorial de " + num + " é = " + fat);
		    }
		    }
		    System.out.println("\nBom proveito e volte sempre!!");
	}
}

