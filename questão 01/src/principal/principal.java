package principal;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int num = inp.nextInt();
		if (num % 2 == 0){
			System.out.println("O n�mero " + num + " � par");
		} 
		else {
			System.out.println("O n�mero " + num + " � �mpar");
		}
	}
}
