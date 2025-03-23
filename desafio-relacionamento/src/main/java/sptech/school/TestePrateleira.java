package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class TestePrateleira {
    public static void main(String[] args) {

        Livro um = new Livro("um", "HP", "J.K.Rowling", 200);
        Livro dois = new Livro("dois", "HP2", "J.K.Rowling", 210);
        Livro tres = new Livro("tres", "SA", "J.R.R.Tolkien", 500);

        List<Livro> lista = new ArrayList<Livro>();

        lista.add(um);
        lista.add(dois);
        lista.add(tres);

        Prateleira primeira = new Prateleira(lista, 3, 12.1);

        Livro quatro = new Livro("quatro", "SA2", "J.R.R.Tolkien", 450);

        primeira.adicionarLivro(quatro);
        primeira.removerLivro("dois");
        primeira.adicionarLivro(quatro);
        System.out.println(primeira.quantidadeLivros());
        System.out.println(primeira.getPesoTotal());
        System.out.println(primeira.getLivroPorNome("HP"));
    }
}