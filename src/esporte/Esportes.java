package esporte;

public abstract class Esportes {
    protected String nome;
    protected String time1;
    protected String time2;
    protected int numJogadores;
    protected String dataJogo;

    public Esportes(String nome, String time1, String time2, int numJogadores, String dataJogo) {
        this.nome = nome;
        this.time1 = time1;
        this.time2 = time2;
        this.numJogadores = numJogadores;
        this.dataJogo = dataJogo;
    }

    public abstract void exibirResultados();
}
