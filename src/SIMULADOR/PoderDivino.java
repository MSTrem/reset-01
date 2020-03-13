package SIMULADOR;

public class PoderDivino extends Ferramenta {
    private int custoFe;

    public PoderDivino(String nome, int poder, int custoFe) {
        super(nome, poder);

        this.custoFe = custoFe;
    }

    public int getCustoFe() {
        return custoFe;
    }

    public void setCustoFe(int custoFe) {
        this.custoFe = custoFe;
    }
}
