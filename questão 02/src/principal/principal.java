package principal;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
		float num1, num2, soma;
		System.out.println("          MENU ");
		System.out.println("============================");
		System.out.println("[1] Somar dois n�meros");
		System.out.println("[2] Raiz quadrada do n�mero");
		System.out.println("============================");
		Scanner inp = new Scanner(System.in);
		System.out.println("Digite a op��o desejada: ");
		int opnum = inp.nextInt();
		if (opnum == 1) {
			System.out.println("Digite o primeiro n�mero: ");
			num1 = inp.nextFloat();
			System.out.println("Digite o segundo n�mero: ");
			num2 = inp.nextFloat();
			soma = num1 + num2;
			System.out.println("A soma de " + num1 + " e " + num2 + " � " + soma);
		}
		else if(opnum == 2) {
			System.out.println("Digite o n�mero desejado: ");
			num1 = inp.nextInt();
			int raiz = (int)Math.sqrt(num1);
			System.out.println("A raiz quadrada de " + num1 + " � " + raiz);
		}
		else if (opnum != 1 && opnum != 2) {
			System.out.println("ERROR 404");
		}
		
		
	}
}
