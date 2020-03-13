package SIMULADOR;

public class Mago extends Personagem {
    int mana;

    public Mago(String nome, int vida, int ataque, int defesa, int mana) {
        super(nome, vida, ataque, defesa);

        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void atacar(Personagem personagem, Magia magia) {
        if (!this.estaVivo()) {
            System.out.println(this.getNome() + "não pode atacar pois já está morto");

            return;
        }

        if (this.mana < magia.getCustoMana()) {
            System.out.println(this.getNome() + " não possui mana o suficiênte para fazer o ataque");

            return;
        }

        this.mana -= magia.getCustoMana();
        int poderAtaque = magia.getPoder() * this.getAtaque();
        int danoAtaque = poderAtaque - personagem.getDefesa();

        if (danoAtaque > 0) {
            System.out.println(this.getNome() + " atacou " + personagem.getNome() + " com " + magia.getNome() + " causando " + danoAtaque + " de dano");

            personagem.diminuirVida(danoAtaque);
        } else {
            System.out.println(personagem.getNome() + " conseguiu se defender do ataque de " + this.getNome() + " com " + magia.getNome());
        }
    }
}