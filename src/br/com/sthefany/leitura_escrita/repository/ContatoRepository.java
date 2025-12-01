package br.com.sthefany.leitura_escrita.repository;

import br.com.sthefany.model.Contato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ContatoRepository {

        public Contato contato;
        private Path arquivo = Paths.get("/Users/25203734/arquivos/dados.csv");

        public void gravar(){
            //Path arquivo = Paths.get("/Users/25203734/arquivos/dados.csv"); //csv é um arquivo que eu quero usar. quando torno ele privado apago a linha
            try {
                Files.writeString(arquivo, contato.separarDadosContato(), StandardOpenOption.APPEND);
                System.out.println("Contato gravado com sucesso!");
            } catch (IOException erro) {
               erro.printStackTrace();
            }

        }

        public void exibirContato(){
            try {
                List<String> linhas = Files.readAllLines(arquivo);

                for (String linha : linhas) {
                    String[] linhaContato = linha.split(";");
                    System.out.println("NOME: " + linhaContato[0]);
                    System.out.println("EMAIL: " + linhaContato[1]);
                    System.out.println("TELEFONE: " + linhaContato[2]);
                    System.out.println("---------------------------------------");
                    System.out.println(linha);
                }
//                int contador = 0;
//                while (contador < linhas.size()){
//                    System.out.println(linhas.get(contador));
//                    contador++;
//                }
                System.out.println("FIM");
            }  catch (IOException e) {
                throw  new RuntimeException(e);
            }
        }
}
