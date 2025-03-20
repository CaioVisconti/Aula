package sptech.school;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Contato caio = new Contato("Caio", "123456789", false);
        Contato gabriel = new Contato("Gabriel", "223456782", false);
        Contato duda = new Contato("Maria", "123456780", true);

        Grupo whatsapp = new Grupo("Zapzap");
        whatsapp.adiciona(caio);
        whatsapp.adiciona(gabriel);
        whatsapp.adiciona(duda);
        System.out.println(whatsapp);

        gabriel.bloquear();
        duda.desbloquear();
        System.out.println(whatsapp);

        whatsapp.remove(duda);
        System.out.println(whatsapp);

        whatsapp.adiciona(duda);
        System.out.println(whatsapp);
    }
}