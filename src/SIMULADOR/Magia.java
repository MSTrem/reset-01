package SIMULADOR;

public class Magia extends Ferramenta {
    private int custoMana;

    public Magia(String nome, int poder, int custoMana) {
        super(nome, poder);

        this.custoMana = custoMana;
    }

    public int getCustoMana() {
        return custoMana;
    }

    public void setCustoMana(int custoMana) {
        this.custoMana = custoMana;
    }
}
