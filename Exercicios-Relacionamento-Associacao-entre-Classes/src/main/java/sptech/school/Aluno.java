package sptech.school;

public class Aluno {

    private Integer ra;
    private String nome;
    private Boolean ativo;
    private Boolean inadimplente;
    private Double nota1;
    private Double nota2;

    public Aluno(Integer ra, String nome, Boolean ativo, Boolean inadimplente, Double nota1, Double nota2) {
        this.ra = ra;
        this.nome = nome;
        this.ativo = ativo;
        this.inadimplente = inadimplente;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Double calcularMedia() {
        Double media;
        return media = this.nota1 * 0.4 + this.nota2 * 0.6;
    }

    public void inadimplente(Boolean inadimplente) {
        this.inadimplente = inadimplente;
    }

    public void adimplente(Boolean adimplente) {
        this.inadimplente = adimplente;
    }

    public Integer getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}

