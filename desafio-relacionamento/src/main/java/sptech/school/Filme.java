package sptech.school;

public class Filme {

    private Integer id;
    private String nome;
    private String categoria;
    private  Double notalmdb;

    public Filme(Integer id, String nome, String categoria, Double notalmdb) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.notalmdb = notalmdb;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getNotalmdb() {
        return notalmdb;
    }

    public void setNotalmdb(Double notalmdb) {
        this.notalmdb = notalmdb;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", notalmdb=" + notalmdb +
                '}';
    }
}
