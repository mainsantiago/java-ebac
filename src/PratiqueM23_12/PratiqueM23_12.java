package PratiqueM23_12;

import java.util.Scanner;

public class PratiqueM23_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Produto[] catalogo = criarCatalogo();
		Produto[] carrinho = new Produto[10];

		System.out.println("Bem-vindo(a) à Loja EBAC!\n");

		while (true) {
			exibirMenu(catalogo);
			int opcao = lerInteiro(scanner, "Escolha um produto pelo número (0 para finalizar): ");

			if (opcao == 0) {
				break;
			}

			if (opcao < 1 || opcao > catalogo.length) {
				System.out.println("Opção inválida! Escolha um número do menu.");
				continue;
			}

			int quantidade = lerInteiro(scanner, "Digite a quantidade desejada: ");
			if (quantidade <= 0) {
				System.out.println("Quantidade inválida! Digite um valor maior que zero.");
				continue;
			}

			Produto produtoEscolhido = catalogo[opcao - 1];
			for (int i = 0; i < quantidade; i++) {
				carrinho = adicionarAoCarrinho(carrinho, produtoEscolhido);
			}

			System.out.println(quantidade + " unidade(s) de " + produtoEscolhido.getNome() + " adicionada(s) ao carrinho.\n");
		}

		exibirResumoCompra(carrinho, catalogo);
	}

	private static Produto[] criarCatalogo() {
		Produto[] catalogo = new Produto[5];
		catalogo[0] = new Televisao();
		catalogo[1] = new Radio();
		catalogo[2] = new Videogame();
		catalogo[3] = new Tablet();
		catalogo[4] = new Celular();
		return catalogo;
	}

	private static void exibirMenu(Produto[] catalogo) {
		System.out.println("Produtos disponíveis:");
		for (int i = 0; i < catalogo.length; i++) {
			System.out.println((i + 1) + " - " + catalogo[i].getDescricao());
		}
		System.out.println("0 - Finalizar compra");
	}

	private static int lerInteiro(Scanner scanner, String mensagem) {
		while (true) {
			System.out.print(mensagem);
			String entrada = scanner.nextLine();
			try {
				return Integer.parseInt(entrada);
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida! Digite apenas números inteiros.");
			}
		}
	}

	private static Produto[] adicionarAoCarrinho(Produto[] carrinho, Produto produto) {
		for (int i = 0; i < carrinho.length; i++) {
			if (carrinho[i] == null) {
				carrinho[i] = produto;
				return carrinho;
			}
		}

		Produto[] novoCarrinho = new Produto[carrinho.length * 2];
		for (int i = 0; i < carrinho.length; i++) {
			novoCarrinho[i] = carrinho[i];
		}
		novoCarrinho[carrinho.length] = produto;
		return novoCarrinho;
	}

	private static void exibirResumoCompra(Produto[] carrinho, Produto[] catalogo) {
		int[] quantidades = new int[catalogo.length];
		double total = 0;

		for (Produto item : carrinho) {
			if (item == null) {
				continue;
			}

			for (int i = 0; i < catalogo.length; i++) {
				if (item.getClass() == catalogo[i].getClass()) {
					quantidades[i]++;
					total += item.getPreco();
					break;
				}
			}
		}

		System.out.println("\n===== RESUMO DA COMPRA =====");
		boolean teveCompra = false;
		for (int i = 0; i < catalogo.length; i++) {
			if (quantidades[i] > 0) {
				teveCompra = true;
				System.out.println(catalogo[i].getNome() + " - Quantidade: " + quantidades[i]);
			}
		}

		if (!teveCompra) {
			System.out.println("Nenhum produto foi comprado.");
		}

		System.out.printf("Preço final da compra: R$ %.2f%n", total);
		System.out.println("Obrigado por comprar na Loja EBAC!");
	}

}
