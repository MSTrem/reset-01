package Exercicio3;

public class Aluno {
    String nome;
    int nota;

    public Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }
    boolean aprovado() {
return nota>=7;
    }
}
