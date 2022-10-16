package principal;
import java.util.Scanner;
public class principal1 {

	public static void main(String[] args) {
		    int op, con; float imp, aum, sal, novsal;
		    Scanner sc = new Scanner(System.in);

		    do{
		      System.out.println("--------------------------------------------");
		      System.out.println("Digite o que desejas:");
		      System.out.println("\t1-Imposto");
		      System.out.println("\t2-Novo Salário");
		      System.out.println("\t3-Classificaçao");
		      System.out.println("\t4-Sair do Progama");
		      System.out.println("---------------------------------------------");
		      System.out.println("\nDigite a Operaçao que Deseja:");
		      op = sc.nextInt();

		      if (op > 4 || op < 1){
		        System.out.println("\nOpção Invalida");
		      }
		      switch(op){
		        case 1:
		          System.out.println("\nDigite seu Salario:");
		          sal = sc.nextFloat();
		          if (sal < 500){
		            imp = sal * 5/100;
		            System.out.println("O Imposto será de " + imp);
		          }
		          if (sal >= 500 && sal <= 850){
		            imp = sal * 10/100;
		            System.out.println("O Imposto será de " + imp);
		          }
		          if (sal > 850){
		            imp = sal * 15/100;
		            System.out.println("O Imposto será de " + imp);
		          }
		          break;
		        case 2:
		          System.out.println("\nDigite seu Salario:");
		          sal = sc.nextFloat();
		          if (sal > 1500){
		            aum = 25; novsal = sal + 25;
		            System.out.println("O seu novo Salário é de: "+ novsal + " Reais");
		          }
		          if (sal >= 750 && sal <= 1500){
		            aum = 50; novsal = sal + aum;
		            System.out.println("O seu novo Salário é de: "+ novsal + " Reais");
		          }
		          if (sal <= 750 && sal >= 450){
		            aum = 75; novsal = sal + aum;
		            System.out.println("O seu novo Salário é de: "+ novsal + " Reais");
		          }
		          if (sal < 450){
		            aum = 100; novsal = sal + aum;
		            System.out.println("O seu novo Salário é de: "+ novsal + " Reais");
		          }
		          break;
		        case 3:
		          System.out.println("\nDigite seu Salario:");
		          sal = sc.nextFloat();
		          if (sal <= 700){
		            System.out.println("\nMal Remunerado");
		          }
		          else{
		            System.out.println("\nBem Remunerado");
		          }
		          break;
		        case 4:
		          System.out.println("\nFim do Progama");
		          break;
		      }
		      System.out.println("\nVocê quer Refazer o Progama?: [1] para Sim e [2] para Não.");
		      con = sc.nextInt();
		      if(con==2) {
		    	  System.out.println("\nVolte sempre!!");
		      }
		    }while(con == 1);
	}
}
