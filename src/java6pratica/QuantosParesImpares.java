package java6pratica;
import java.util.Scanner;

public class QuantosParesImpares {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int impar = 0, par = 0;
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.print("Digite o " + contador + "º número: ");
			int imparOuPar = scan.nextInt();
			System.out.println();
			
			if(imparOuPar % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Total de números pares: " + par);
		System.out.println("\nTotal de números ímpares: " + impar);
		scan.close();
	}
}
