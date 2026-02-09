package PratiqueM13_11;

public class Aluno {

    private String nome;
    private double[] notas = new double[4];
    private double media;

    public Aluno(String nome){
        this.setNome(nome);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double[] getNotas(){
        return this.notas;
    }

    public void setNotas(int nota, int index){
        this.notas[index] = nota;
    }

    public double getMedia(){
        return this.media;
    }

    public void setMedia(double media){
        this.media = media;
    }

}
