package java4pratica;
import java.util.Scanner;

public class SalarioLiquido {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Salário Bruto: ");
		float salario = Float.valueOf(scan.nextLine());
		System.out.println();
		
		System.out.print("Adicional Noturno: ");
		float adicional = Float.valueOf(scan.nextLine());
		System.out.println();
		
		System.out.print("Horas Extras: ");
		float extras = Float.valueOf(scan.nextLine());
		System.out.println();
		
		System.out.print("Descontos: ");
		float descontos = Float.valueOf(scan.nextLine());
		System.out.println();
		
		float salarioLiquido = salario + adicional + (extras * 5) - descontos;
		System.out.printf("Salário Líquido: %.2f", salarioLiquido);
	}
}
