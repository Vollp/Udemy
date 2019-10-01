public class funcoes {

	public static void main(String[] args) {

		double x = 3;
		double y = 4;
		double z = -5;
		double A, B, C;

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);
		System.out.printf("Raizz quadrada de: %.2f = %.2f\n", x, A);
		System.out.printf("Raizz quadrada de: %.2f = %.2f\n", y, B);
		System.out.printf("Raizz quadrada de: 25 = %.2f\n\n", C);

		A = Math.pow(x, y);
		B = Math.pow(y, 2);
		C = Math.pow(5, 2);
		System.out.printf("%.2f elevado a %.2f = %.2f\n", x, y, A);
		System.out.printf("%.2f elevado ao quadrado = %.2f\n", y, B);
		System.out.printf("5 elevado ao quadrado = %.2f\n\n", C);
		
		A =  Math.abs(y);
		B = Math.abs(z);
		System.out.printf("O valor absoluto de %.0f é: %.0f\n", y, A);
		System.out.printf("O valor absoluto de %.0f é: %.0f\n\n", z, B);
		
		formulaDeBascaras();
	}
	
	public static void formulaDeBascaras() {
		
		double a = 3;
		double b = 4;
		double c = -5;
		double delta;
		double x1;
		double x2;
		
		delta = Math.pow(b, 2) - 4*a*c;
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("x1 = %.2f\n", x1);
		System.out.printf("x2 = %.2f", x2);
	}

}
