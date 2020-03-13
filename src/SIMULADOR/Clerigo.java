package SIMULADOR;

public class Clerigo extends Personagem {
    int fe;

    public Clerigo(String nome, int vida, int ataque, int defesa, int fe) {
        super(nome, vida, ataque, defesa);

        this.fe = fe;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public void atacar(Personagem personagem, PoderDivino poderDivino) {
        if (!this.estaVivo()) {
            System.out.println(this.getNome() + "não pode atacar pois já está morto");

            return;
        }

        if (this.fe < poderDivino.getCustoFe()) {
            System.out.println(this.getNome() + " não possui fé o suficiênte para fazer o ataque");

            return;
        }

        this.fe -= poderDivino.getCustoFe();
        int poderAtaque = poderDivino.getPoder() * this.getAtaque();
        int danoAtaque = poderAtaque - personagem.getDefesa();

        if (danoAtaque > 0) {
            System.out.println(this.getNome() + " atacou " + personagem.getNome() + " com " + poderDivino.getNome() + " causando " + danoAtaque + " de dano");

            personagem.diminuirVida(danoAtaque);
        } else {
            System.out.println(personagem.getNome() + " conseguiu se defender do ataque de " + this.getNome() + " com " + poderDivino.getNome());
        }
    }
}
