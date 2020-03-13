package SIMULADOR;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------------------------Simulador de RPG---------------------------");

        Barbaro barbaro1 = new Barbaro("Barbaro1", 120, 20, 30);
        Guerreiro guerreiro1 = new Guerreiro("Guerreiro1 ", 120, 30, 50);
        Clerigo clerigo1 = new Clerigo("Clerigo1", 80, 30, 5, 10);
        Druida druida1 = new Druida("Druida1 ", 86, 25, 5, 1);
        Feiticeiro feiticeiro1 = new Feiticeiro("Feiticeiro1", 60, 30, 5, 40);
        Mago mago1 = new Mago("Mago1", 70, 40, 5, 50);

        System.out.println("\nEstado inicial dos personagens:\n");

        System.out.println(barbaro1.getNome() + " possui: " + barbaro1.getVida() + " vida");
        System.out.println(guerreiro1.getNome() + " possui: " + guerreiro1.getVida() + " vida");

        System.out.println(clerigo1.getNome() + " possui: " + clerigo1.getVida() + " vida, " + clerigo1.getFe() + " fé");
        System.out.println(druida1.getNome() + " possui: " + druida1.getVida() + " vida, " + druida1.getFe() + " fé");

        System.out.println(feiticeiro1.getNome() + " possui: " + feiticeiro1.getVida() + " vida, " + feiticeiro1.getMana() + " mana");
        System.out.println(mago1.getNome() + " possui: " + mago1.getVida() + " vida, " + mago1.getMana() + " mana");

        System.out.println("\nInício da batalha:\n");


        mago1.atacar(barbaro1, new Magia("abracadabra", 1, 5));
        mago1.atacar(feiticeiro1, new Magia("magia negra", 1, 5));

        barbaro1.atacar(feiticeiro1, new Arma("machado", 1));
        barbaro1.atacar(mago1, new Arma("faca", 3));

        guerreiro1.atacar(barbaro1, new Arma("machado", 1));
        guerreiro1.atacar(druida1, new Arma("espada", 10));

        feiticeiro1.atacar(barbaro1, new Magia("feitiço do capi", 1, 5));
        feiticeiro1.atacar(feiticeiro1, new Magia("abracadabra", 1, 5));

        druida1.atacar(guerreiro1, new PoderDivino("exorcismo", 50, 100));
        druida1.atacar(mago1, new PoderDivino("água benta", 5, 1));

        clerigo1.atacar(guerreiro1, new PoderDivino("fé em deus", 10, 1));
        clerigo1.atacar(mago1, new PoderDivino("água benta", 5, 1));


        System.out.println("\nEstado final dos personagens:\n");

        System.out.println(barbaro1.getNome() + " possui: " + barbaro1.getVida() + " vida");
        System.out.println(guerreiro1.getNome() + " possui: " + guerreiro1.getVida() + " vida");

        System.out.println(clerigo1.getNome() + " possui: " + clerigo1.getVida() + " vida, " + clerigo1.getFe() + " fé");
        System.out.println(druida1.getNome() + " possui: " + druida1.getVida() + " vida, " + druida1.getFe() + " fé");

        System.out.println(feiticeiro1.getNome() + " possui: " + feiticeiro1.getVida() + " vida, " + feiticeiro1.getMana() + " mana");
        System.out.println(mago1.getNome() + " possui: " + mago1.getVida() + " vida, " + mago1.getMana() + " mana");
    }
}
