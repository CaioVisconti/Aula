package sptech.school;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Streaming {

    List<Filme> filmes;

    public Streaming() {
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        this.filmes.add(filme);
    }

    public void removerFilme(Integer id) {
        Integer indice = -1;
        for(int i = 0; i < this.filmes.size(); i++) {
            if(this.filmes.get(i).getId() == id) {
                indice = i;
            }
        }

        if(indice != -1) {
            this.filmes.remove(this.filmes.get(indice));
        } else {
            System.out.println("Não há esse filme no Streaming");
        }
    }

    public Integer getQuantidadeDeFilmes() {
        return this.filmes.size();
    }

    public Double getMediaFilmes() {
        Double total = 0.0;
        for(int i = 0; i < this.filmes.size(); i++) {
            Double notaAtual = this.filmes.get(i).getNotalmdb();
            total += notaAtual;
        }
        Double media = total / this.filmes.size();
        return media;
    }

    public Filme getFilmePeloNome(String nome) {
        String comparadoSemEspaco = nome.replaceAll(" ", "");
        String comparadoTudoMinusculo = comparadoSemEspaco.toLowerCase();
        Integer indice = -1;
        for(int i = 0; i < this.filmes.size(); i++) {
            String nomeAtual = this.filmes.get(i).getNome();
            String atualSemEspaco = nomeAtual.replaceAll(" ", "");
            String atualTudoMinusculo = atualSemEspaco.toLowerCase();

            if(atualTudoMinusculo.equals(comparadoTudoMinusculo)) {
                indice = i;
            }
        }

        if(indice != -1) {
            return this.filmes.get(indice);
        }
        return null;
    }

    public List<Filme> getFilmesPorCategoria(String categoria) {
        List<Filme> lista = new ArrayList<>();

        for(int i = 0; i < this.filmes.size(); i++) {
            String categoriAtual = this.filmes.get(i).getCategoria();

            if(categoriAtual.equals(categoria)) {
                lista.add(this.filmes.get(i));
            }
        }

        return lista;
    }

    public Filme getFilmeMaiorNota() {
        Integer maior = 0;
        for (int i = 0; i < this.filmes.size(); i++) {
            Double notaAtual = this.filmes.get(i).getNotalmdb();

            if(notaAtual >= this.filmes.get(maior).getNotalmdb()) {
                maior = i;
            }
        }

        return this.filmes.get(maior);
    }

    public Filme sortearFilme() {
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, this.filmes.size());
        return this.filmes.get(numeroAleatorio);
    }

    @Override
    public String toString() {
        return "Streaming{" +
                "filmes=" + filmes +
                '}';
    }
}
