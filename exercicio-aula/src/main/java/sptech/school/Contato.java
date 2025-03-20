package sptech.school;

public class Contato {

    private String nome;
    private String telefone;
    private Boolean bloqueado;

    public Contato(String nome, String telefone, Boolean bloqueado) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = bloqueado;
    }

    public void bloquear() {
        this.bloqueado = true;
    }

    public void desbloquear() {
        this.bloqueado = false;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", bloqueado=" + bloqueado +
                '}';
    }
}
