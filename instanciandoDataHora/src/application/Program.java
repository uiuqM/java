package application;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		//Instanciando obj Data(LocalDate)
		LocalDate d1 = LocalDate.now();
		//Instanciando obj DataHora(LocalDateTime)
		LocalDateTime d2 = LocalDateTime.now();
		//Instanciando obj DataHoraGlobal(Instant) TimeZone GMT
		Instant d3 = Instant.now();
		//Instanciando obj Data(LocalDateParse)
		LocalDate d4 = LocalDate.parse("2001-09-07");
		//Instanciando obj Data(LocalDateParse)
		LocalDateTime d5 = LocalDateTime.parse("2001-09-07T00:00:01");
		//Criando uma formatacão p LocalDate aceitar o formato de data
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d6 = LocalDate.parse("07/09/2001", fmt1);
		
		
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		//Agora usando o mesmo formater p pegar uma data e passar p texto.
		System.out.println(d4.format(fmt1));
		
	}

}
