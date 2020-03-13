package SIMULADOR;

public abstract class Ferramenta {
    private String nome;
    private int poder;

    public Ferramenta(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
