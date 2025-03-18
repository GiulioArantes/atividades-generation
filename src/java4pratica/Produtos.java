package java4pratica;
import java.util.Scanner;

public class Produtos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("numero1: ");
		float numero1 = Float.valueOf(scan.nextLine());
		System.out.println();
		
		System.out.print("numero2: ");
		float numero2 = Float.valueOf(scan.nextLine());
		System.out.println();
		
		System.out.print("numero3: ");
		float numero3 = Float.valueOf(scan.nextLine());
		System.out.println();
		
		System.out.print("numero4: ");
		float numero4 = Float.valueOf(scan.nextLine());
		System.out.println();
		
		float diferenca = (numero1 * numero2) - (numero3 * numero4);
		System.out.printf("Diferença: %.1f", diferenca);
	}
}
