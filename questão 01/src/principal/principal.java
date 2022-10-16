package principal;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int num = inp.nextInt();
		if (num % 2 == 0){
			System.out.println("O número " + num + " é par");
		} 
		else {
			System.out.println("O número " + num + " é ímpar");
		}
	}
}
