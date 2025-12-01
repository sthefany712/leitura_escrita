package br.com.sthefany.leitura_escrita;

import br.com.sthefany.leitura_escrita.repository.ContatoRepository;
import br.com.sthefany.model.Contato;

import java.util.Scanner;
import java.util.UUID;

public class LeituraEscritaApp {

    public static void main (String[] args){

        System.out.println("Leitura escrita App");

        Scanner leitor = new Scanner(System.in);

        Contato contato = new Contato();
        System.out.println("Digite o nome do contato: ");
        contato.nome = leitor.nextLine();

        System.out.println("Digite o email do contato: ");
        contato.email = leitor.nextLine();

        System.out.println("Digite o telefone do contato: ");
        contato.telefone = leitor.nextLine();

        ContatoRepository contatoRepository = new ContatoRepository();
        contatoRepository.contato = contato;

        contatoRepository.gravar();

        contatoRepository.exibirContato();
    }

}
