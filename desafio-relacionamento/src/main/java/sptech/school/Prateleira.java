package sptech.school;

import java.util.List;

public class Prateleira {
    private List<Livro> livros;
    private Integer limite;
    private Double peso;

    public Prateleira(List<Livro> livros, Integer limite, Double peso) {
        this.livros = livros;
        this.limite = limite;
        this.peso = peso;
    }

    public void adicionarLivro(Livro livro) {
        if(this.livros.size() < this.limite) {
            this.livros.add(livro);
        }
    }

    public void removerLivro(String codigo) {
        Integer indice = -1;
        for(int i = 0; i < this.livros.size(); i++) {
            if(this.livros.get(i).getCodigo().equals(codigo)) {
                indice = i;
            }
        }

        if(indice != -1) {
            this.livros.remove(this.livros.get(indice));
        } else {
            System.out.println("Esse livro não está na prateleira");
        }
    }

    public Integer quantidadeLivros() {
        return this.livros.size();
    }

    public Double getPesoTotal() {
        for(int i = 0; i < this.livros.size(); i++) {
            this.peso += this.livros.get(i).calcularPeso();
        }
        return this.peso;
    }

    public Livro getLivroPorNome(String nome) {
        String nomeSemEspaco = nome.replaceAll(" ", "");
        String nomeMaisculo = nomeSemEspaco.toUpperCase();
        Integer indice = -1;
        for(int i = 0; i < this.livros.size(); i++) {
            Livro livroAtual = this.livros.get(i);
            String nomeAtual = livroAtual.getNome();
            String atualSemEspaco = nomeAtual.replaceAll(" ", "");
            String atualMaisculo = atualSemEspaco.toUpperCase();

            if(atualMaisculo.equals(nomeMaisculo)) {
                indice = i;
            }
        }

        if(indice != -1) {
            return this.livros.get(indice);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Prateleira{" +
                "livros=" + livros +
                ", limite=" + limite +
                ", peso=" + peso +
                '}';
    }
}
