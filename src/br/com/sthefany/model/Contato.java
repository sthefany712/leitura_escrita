package br.com.sthefany.model;

public class Contato {
    public String id;
    public String nome;
    public String email;
    public String telefone;

    public String separarDadosContato(){
        String contatoSeparado = id + ";"  + nome + ";" + email + ";" + telefone + "\n";
        return contatoSeparado;

    }
}
//id precisa ser um numero aleatorio e q n vai se repetir em hipotese alguma
 //toda vez que precisar de algo vou pegar vou repositório, guardar tbm repositório