package sptech.school;

import java.util.List;

public class Atleta {

    private  Integer id;
    private  String nome;
    private  String nacionalidade;
    private  String treinador;
    private  Integer idade;
    private  Double salario = 0.0;

    public Atleta(Integer id, String nome, String nacionalidade, String treinador, Integer idade, Double salario) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.treinador = treinador;
        this.idade = idade;
        this.salario = salario;
    }

    public Atleta(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getTreinador() {
        return treinador;
    }

    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public static void ordenarNomeCrescente (List<Atleta> lista) {
        String nomeComparado;
        Atleta atletaComparado;
        Atleta aux = new Atleta("aux", "naotem");
        for(int i = 0; i < lista.size() - 1; i++) {
            Integer indice = i;
            Atleta atletaAtual = lista.get(i);
            String nomeAtual = (atletaAtual).getNome();
            for(int j = 1; j < lista.size(); j++) {
                atletaComparado = lista.get(j);
                nomeComparado = (atletaComparado).getNome();

                if(nomeComparado.compareTo(nomeAtual) >= 0) {
                    indice = j;
                }
            }
            atletaComparado = lista.get(indice);

            aux.setNome(nomeAtual);
            (atletaAtual).setNome(atletaComparado.getNome());
            atletaComparado.setNome(aux.getNome());

        }
    }

    public static void ordenarNacionalidade(List<Atleta> lista) {
        String nacionalidadeComparada;
        Atleta atletaComparado;
        Atleta aux = new Atleta("aux", "naotem");
        for (int i = 0; i < lista.size(); i++) {
            Integer indice = i;
            Atleta atletaAtual = lista.get(i);
            String nacionalidadeAtual = (atletaAtual).getNacionalidade();
            for (int j = 1; j < lista.size() - i; j++) {
                atletaComparado = lista.get(j);
                nacionalidadeComparada = (atletaComparado).getNacionalidade();

                if (nacionalidadeComparada.compareTo(nacionalidadeAtual) >= 0) {
                    indice = j;
                    atletaComparado = lista.get(indice);
                    aux.setNacionalidade(nacionalidadeAtual);
                    (atletaAtual).setNacionalidade(atletaComparado.getNacionalidade());
                    atletaComparado.setNacionalidade(aux.getNacionalidade());
                }
            }

        }
    }

    public  static Integer pesquisaBinariaNome (List<Atleta> lista, String nome) {
        Integer inicio = 0;
        Integer fim = lista.size();
        while(inicio <= fim) {
            Integer meio = (inicio + fim) / 2;
            Atleta atletaAtual = lista.get(meio);

            if(nome == atletaAtual.getNome()) {
                return meio;
            } else {
                if(nome.compareTo(atletaAtual.getNome()) > 0) {
                    inicio = meio + 1;
                } else if(nome.compareTo(atletaAtual.getNome()) < 0) {
                    fim = meio - 1;
                }
            }
        }
        return -1;
    }

    public static void ordenarNomeDecrescente (List<Atleta> lista) {
        String nomeComparado;
        Atleta atletaComparado;
        Atleta aux = new Atleta("AUX","nãotem");
        for(int i = lista.size() - 1; i >= 0; i--) {
            Atleta atletaAtual = (lista.get(i));
            String nomeAtual = atletaAtual.getNome();
            Integer indice = i;
            for(int j = lista.size() - i - 1; j >= 0; j--) {
                atletaComparado = lista.get(j);
                nomeComparado = atletaComparado.getNome();
                if(nomeComparado.compareTo(nomeAtual) >= 0) {
                    indice = j;
                }
            }
            atletaComparado = lista.get(indice);
            nomeComparado = atletaComparado.getNome();

            aux.setNome(nomeAtual);
            atletaAtual.setNome(nomeComparado);
            atletaComparado.setNome(aux.getNome());
        }
    }

}
