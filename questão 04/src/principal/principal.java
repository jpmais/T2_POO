package principal;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class principal {
	 public static void main(String[] args) {
		       int dia,mes,ano,hora,min;
		       Calendar cal = Calendar.getInstance();
		       LocalDateTime dateTime = LocalDateTime.now();
		       String timeStamp = DateTimeFormatter.ofPattern("HH:mm").format(dateTime);
		       dia = cal.get(Calendar.DAY_OF_MONTH);
		       mes = cal.get(Calendar.MONTH) + 1 ;
		       ano = cal.get(Calendar.YEAR);
		       System.out.println("---------------------");
		       System.out.println("Hor�rio: "+timeStamp);
		       System.out.printf("Data atual: " + dia + "/"+ mes + "/"+ ano + "\n");
		       if(mes == 1) {
		    	   System.out.println("O m�s atual � janeiro");
		       }  
		       if(mes == 2) {
		    	   System.out.println("O m�s atual � fevereiro");
		       }
		       if(mes == 3) {
		    	   System.out.println("O m�s atual � mar�o");
		       }
		       if(mes == 4) {
		    	   System.out.println("O m�s atual � abril");
		       }
		       if(mes ==5) {
		    	   System.out.println("O m�s atual � maio");
		       }
		       if(mes == 6) {
		    	   System.out.println("O m�s atual � junho");
		       }
		       if(mes == 7) {
		    	   System.out.println("O m�s atual � julho");
		       }
		       if(mes == 8) {
		    	   System.out.println("O m�s atual � agosto");
		       }
		       if(mes == 9) {
		    	   System.out.println("O m�s atual � setembro");
		       }
		       if(mes == 10) {
		    	   System.out.println("O m�s atual � outubro");
		       }
		       if(mes == 11) {
		    	   System.out.println("O m�s atual � novembro");
		       }
		       if(mes == 12) {
		    	   System.out.println("O m�s atual � dezembro");
		       }
		       System.out.println("---------------------");
		    }
}
