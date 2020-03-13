package SIMULADOR;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    // O poder de ataque varia conforme o tipo de ataque; Magos atacam com Sabedoria, logo o poder de ataque será de 5/3 o valor original, Guerreiros lutam com estratégia, logo seu poder será 2 vezes maior que o original, Bárbaros lutam com Sorte, logo seu poder será de 2/3 do poder original, Clérigo e Druídas lutam com Fé, logo o poder será de 1/3, o Feiticeiro luta com Esperteza, seu poder será de 4/5 do original. //
    private int defesa;

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return this.nome;
    }

    void diminuirVida(int vidaPerdida) {
        if (this.vida != 0) {
            if (this.vida - vidaPerdida <= 0) {
                this.vida = 0;

                System.out.println(this.getNome() + " morreu");
            } else {
                this.vida -= vidaPerdida;
            }
        } else {
            System.out.println(this.getNome() + " já morreu");
        }
    }

    int getAtaque() {
        return this.ataque;
    }

    void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    int getDefesa() {
        return this.defesa;
    }

    int getVida() {
        return this.vida;
    }

    boolean estaVivo() {
        return this.vida != 0;
    }

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }
}