package principal;
import java.util.Scanner;
public class principal {

public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Quantos n�meros voc� quer digitar: ");
		int quantidade = sc.nextInt();
		if(quantidade<3000) {
		int quantidadePar, quantidadeImpar;
		double soma, maiorNum, menorNum, mediaPares, somaPares, porcentagem, resto;
		double [] num = new double[quantidade];
		quantidadeImpar = 0;
		quantidadePar = 0;
		somaPares=0;
		soma = 0;
		maiorNum = Integer.MIN_VALUE;
		menorNum = Integer.MAX_VALUE;
		for(int i = 0;i < quantidade; i++) {
			System.out.println("Digite o " + (i+1) + "� n�mero: ");
			num[i] =sc.nextDouble();
			soma = soma + num[i];
			resto = num[i]%2;
			if(num[i]> maiorNum) {
				maiorNum = num[i];
			}
			if(num[i]<menorNum) {
				menorNum = num[i];
			}
			if(resto == 0) {
				++quantidadePar;
				somaPares= somaPares+ num[i];
				
			}
			else {
				++quantidadeImpar;
				
			}
		}
		porcentagem = quantidadeImpar* 100/quantidade;
		mediaPares = somaPares/quantidadePar;
		System.out.println("A soma dos n�meros digitados foi: " + soma);
		System.out.println("A quantidade de n�meros digitados foi: " + quantidade);
		System.out.println("A m�dia dos n�meros digitados foi: " + soma/quantidade);
		System.out.println("O maior n�mero digitado �: " + maiorNum);
		System.out.println("O menor n�mero digitado �: " + menorNum);
		System.out.println("A m�dia dos n�meros pares �: " + mediaPares);
		System.out.println("A porcentagem dos n�meros �mpares �: " + porcentagem);
		
		
		
		}
		else {
			System.out.println("ERRO!");
		}
	
	}
}