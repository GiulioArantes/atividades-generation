package java4pratica;
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Salário: ");
		float salario = Float.valueOf(scan.nextLine());
		System.out.println();
		
		System.out.print("Abono: ");
		float abono = Float.valueOf(scan.nextLine());
		System.out.println();
		
		float novoSalario = salario + abono;
		System.out.printf("Novo Salário: %.2f", novoSalario);
	}
}
