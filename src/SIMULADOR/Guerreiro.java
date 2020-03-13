package SIMULADOR;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public void atacar(Personagem personagem, Arma arma) {
        if (!this.estaVivo()) {
            System.out.println(this.getNome() + "não pode atacar pois já está morto");

            return;
        }

        int poderAtaque = arma.getPoder() * this.getAtaque();
        int danoAtaque = poderAtaque - personagem.getDefesa();

        if (danoAtaque > 0) {
            System.out.println(this.getNome() + " atacou " + personagem.getNome() + " com " + arma.getNome() + " causando " + danoAtaque + " de dano");

            personagem.diminuirVida(danoAtaque);
        } else {
            System.out.println(personagem.getNome() + " conseguiu se defender do ataque de " + this.getNome() + " com " + arma.getNome());
        }
    }
}