package sptech.school;

import java.util.List;

public class Sala {

    private Integer id;
    private String nome;
    private List<Aluno> aluno;

    public Sala(Integer id, String nome, List<Aluno> aluno) {
        this.id = id;
        this.nome = nome;
        this.aluno = aluno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", aluno=" + aluno +
                '}';
    }
}
