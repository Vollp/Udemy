import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		String prodct1 = "Computer";
		String prodct2 = "Office desck";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double pricel1 = 2100.0;
		double pricel2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n", prodct1, pricel1);
		System.out.printf("%s, price is $ %.2f %n%n", prodct2, pricel2);
		System.out.printf("Record: %d years old, code %d and gender: %s %n%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %f %n", measure);
		System.out.printf("Rouded (three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
