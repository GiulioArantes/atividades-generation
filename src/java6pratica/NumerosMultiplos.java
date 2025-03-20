package java6pratica;
import java.util.Scanner;

public class NumerosMultiplos {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input, total = 0, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			input = scan.nextInt();
			if(input % 3 == 0 && input != 0) {
				soma+= input;
				total++;
			}
			System.out.println();
		}while(input != 0);
		
		float media = ((float) soma) / total;
		System.out.println("\nA média de todos os números múltiplos de 3 é: " + media);
		scan.close();
	}
}
