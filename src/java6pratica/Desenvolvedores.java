package java6pratica;

import java.util.Scanner;

public class Desenvolvedores {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalBack = 0, totalFront = 0, totalMobile = 0, totalFullStack = 0, totalIdade = 0, total = 0;

		while (true) {
			System.out.print("Idade: ");
			int idade = scan.nextInt();
			System.out.println();
			
			System.out.print("Identidade de Gênero: ");
			int genero = scan.nextInt();
			System.out.println();
			
			System.out.print("Pessoa Desenvolvedora: ");
			int setor = scan.nextInt();
			System.out.println();
			
			if (setor == 1) {
				totalBack++;
			} else if ((genero == 1 || genero == 4) && setor == 2) {
				totalFront++;
			} else if ((genero == 2 || genero == 5) && idade > 40) {
				totalMobile++;
			} else if (genero == 3 && setor == 4 && idade < 30) {
				totalFullStack++;
			}

			total++;
			totalIdade += idade;
			System.out.print("Deseja continuar? (S/N): ");
			boolean continuar = scan.next().equalsIgnoreCase("s");
			if (!(continuar)) {
				break;
			}
		}

		float media = (float) totalIdade / total;

		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + totalBack);
		System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalFront);
		System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalMobile);
		System.out.println(
				"\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + totalFullStack);
		System.out.println("\nO número total de pessoas que responderam à pesquisa: " + total);
		System.out.printf("\nA média das pessoas que responderam à pesquisa: %.2f", media);

		scan.close();
	}
}