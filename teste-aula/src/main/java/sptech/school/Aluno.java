package sptech.school;

public class Aluno {

    private Integer id;
    private String nome;
    private Double nota;

    public Aluno(Integer id, String nome, Double nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
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

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
