package PratiqueM23_12;

public abstract class Produto {

    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return nome + " - R$ " + String.format("%.2f", preco);
    }
}