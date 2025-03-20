package java6pratica;
import java.util.Scanner;

public class IdadePessoas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idadeMenor21 = 0, idadeMaior50 = 0;

		while (true) {
			System.out.print("Digite uma idade: ");
			int idade = scan.nextInt();

			if (idade < 0) {
				break;
			}
			if (idade < 21) {
				idadeMenor21++;
			} else if (idade > 50){
				idadeMaior50++;
			}
			System.out.println();
		}

		System.out.println("\nTotal de pessoas menores de 21 anos: " + idadeMenor21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + idadeMaior50);
		scan.close();
	}
}
