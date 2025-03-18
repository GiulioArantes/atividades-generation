package java4pratica;
import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		float primeira = Float.valueOf(scan.nextLine());
		System.out.println();
		
		System.out.print("Nota 2: ");
		float segunda = Float.valueOf(scan.nextLine());
		System.out.println();
		
		System.out.print("Nota 3: ");
		float terceira = Float.valueOf(scan.nextLine());
		System.out.println();
		
		System.out.print("Nota 4: ");
		float quarta = Float.valueOf(scan.nextLine());
		System.out.println();
		
		float calcularMedia = (primeira + segunda + terceira + quarta) / 4;
		System.out.printf("Média final: %.1f", calcularMedia);
	}
}
