package java5pratica;

import java.util.Scanner;

public class DoarSangue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome, simNao;
		int idade;
		boolean primeiraDoacao;

		System.out.print("Digite o nome do doador: ");
		nome = scan.nextLine();

		System.out.print("\nDigite a idade do doador: ");
		idade = scan.nextInt();

		System.out.print("\nPrimeira doação de sangue? \nDigite: (s) para sim, (n) para não. ");
		scan.skip("\\R?");
		simNao = scan.nextLine().toLowerCase();

		if (simNao.equals("s")) {
			primeiraDoacao = true;
		} else if (simNao.equals("n")) {
			primeiraDoacao = false;
		} else {
			System.out.println("Digite uma opção válida! Por padrão iremos considerar que é a primeira vez\n");
			primeiraDoacao = true;
		}

		System.out.println();

		if ((idade >= 18 && idade <= 59) || (idade >= 60 && idade <= 69 && primeiraDoacao == false)) {
			System.out.println(nome + " está apto(a) para doar sangue!");
		} else {
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}

	}

}
