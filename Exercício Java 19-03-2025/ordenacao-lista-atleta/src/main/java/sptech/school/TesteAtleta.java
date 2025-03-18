package sptech.school;

import java.util.*;

public class TesteAtleta {
    public static void main(String[] args) {
        Atleta caio = new Atleta(1, "Caio", "Brasileiro", "Paulo", 20, 2000.0);
        Atleta gabriel = new Atleta(2, "Gabriel", "Alemão", "Paulo", 19, 1999.0);
        Atleta duda = new Atleta(3, "Maria Eduarda", "Brasileiro", "Fernanda", 20, 2001.9);
        Atleta barbara = new Atleta(7, "Bárbara", "Japonesa", "Fernanda", 20, 2002.0);
        Atleta felipe = new Atleta(9, "Felipe", "Francês", "Gabriel", 22, 1800.5);
        Atleta miguel = new Atleta(11, "Miguel", "Italiano", "Fernanda", 21, 2025.0);
        Atleta andre = new Atleta(14, "Andre", "Holandês", "Paulo", 42, 3200.0);
        Atleta juliano = new Atleta(16, "Juliano", "Filipino", "Ricardo", 28, 2100.0);

        List<Atleta> lista = new ArrayList<Atleta>();

        lista.add(caio);
        lista.add(gabriel);
        lista.add(duda);
        lista.add(barbara);
        lista.add(felipe);
        lista.add(miguel);
        lista.add(andre);
        lista.add(juliano);

        Atleta.ordenarNomeCrescente(lista);
        System.out.println(lista);
        System.out.println(Atleta.pesquisaBinariaNome(lista, "Miguel"));
        Atleta.ordenarNacionalidade(lista);
        System.out.println(lista);
        Atleta.ordenarNomeDecrescente(lista);
        System.out.println(lista);
    }
}
