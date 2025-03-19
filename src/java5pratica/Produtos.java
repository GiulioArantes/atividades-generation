package java5pratica;

import java.util.Scanner;

public class Produtos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int codigo, quantidade;
		double valor, resultadoFinal;
		String produto;

		System.out.println("## #### #### #### #### #### ##");
		System.out.println("Código 1 - Cachorro quente - R$ 10.00");
		System.out.println("Código 2 - X-Salada - R$ 15.00");
		System.out.println("Código 3 - X-Bacon - R$ 18.00");
		System.out.println("Código 4 - Bauru - R$ 12.00");
		System.out.println("Código 5 - Refrigerante - R$ 8.00");
		System.out.println("Código 6 - Suco de laranja - R$ 13.00");
		System.out.println("## #### #### #### #### #### ##");
		System.out.print("\nQual o código do produto? ");
		codigo = scan.nextInt();

		switch (codigo) {
		case 1:
			produto = "Cachorro Quente";
			valor = 10.00;
			break;

		case 2:
			produto = "X-Salada";
			valor = 15.00;
			break;

		case 3:
			produto = "X-Bacon";
			valor = 18.00;
			break;

		case 4:
			produto = "Bauru";
			valor = 12.00;
			break;

		case 5:
			produto = "Refrigerante";
			valor = 8.00;
			break;

		case 6:
			produto = "Suco de laranja";
			valor = 13.00;
			break;
		default:
			produto = "";
			valor = 0;
		}

		System.out.print("\nQual a quantidade desejada? ");
		quantidade = scan.nextInt();

		resultadoFinal = valor * quantidade;
		System.out.println(
				"\nVocê comprou " + quantidade + " " + produto + " que ficou no valor total de: " + resultadoFinal);
	}
}
