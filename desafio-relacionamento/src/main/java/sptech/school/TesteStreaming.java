package sptech.school;

public class TesteStreaming {

    public static void main(String[] args) {

        Filme um = new Filme(1, "SA", "Ação", 10.0);
        Filme dois = new Filme(2, "HP", "Fantasia", 8.9);
        Filme tres = new Filme(3, "Vingadores", "Ação", 7.1);
        Filme removido = new Filme(4, "Tchau", "VaiBem", 0.1);

        Streaming cineflix = new Streaming();

        cineflix.adicionarFilme(um);
        cineflix.adicionarFilme(dois);
        cineflix.adicionarFilme(tres);
        cineflix.adicionarFilme(removido);

        System.out.println(cineflix);

        cineflix.removerFilme(4);

        System.out.println(cineflix);

        System.out.println(cineflix.getQuantidadeDeFilmes());
        System.out.println(cineflix.getMediaFilmes());
        System.out.println(cineflix.getFilmePeloNome("HP"));
        System.out.println(cineflix.getFilmesPorCategoria("Ação"));
        System.out.println(cineflix.getFilmeMaiorNota());
        System.out.println(cineflix.sortearFilme());

    }
}
