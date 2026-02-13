package PratiqueM21_10;

import java.util.HashSet;
import java.util.Set;

public class PratiqueM21_10 {

	public static void main(String[] args) {
		Set<Pessoa> pessoas = new HashSet<>();

		pessoas.add(new Pessoa("Ana", 25));
		pessoas.add(new Pessoa("Bruno", 30));
		pessoas.add(new Pessoa("Ana", 25));
		pessoas.add(new Pessoa("Carla", 28));
		pessoas.add(new Pessoa("Bruno", 30));

		System.out.println("Quantidade final no HashSet: " + pessoas.size());
		System.out.println("Pessoas no conjunto:");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}

		System.out.println();
		System.out.println("Explicacao: HashSet usa equals() e hashCode() para evitar duplicados.");
		System.out.println("Como Pessoa compara nome e idade, objetos com os mesmos valores sao considerados iguais e nao entram duas vezes.");
	}
}
