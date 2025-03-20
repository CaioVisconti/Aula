package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private String nome;
    private List<Contato> lista;

    public Grupo(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }

    public void adiciona(Contato ctt) {
        (this.lista).add(ctt);
    }

    public void remove(Contato ctt) {
        (this.lista).remove(ctt);
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nome='" + nome + '\'' +
                ", lista=" + lista +
                '}';
    }
}
