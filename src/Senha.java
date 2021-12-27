/*

Crie uma classe de Senha. O construtor deve receber uma regex (expressão regular)
que valida o formato exigido para a senha. Pesquise na Internet quais recursos Java
ornece para operar com expressões regulares.

Adicione o método public void setValue (String pwd) que permite atribuir uma senha
de acordo com a exigida pela regex do ponto anterior. Em caso de incompatibilidade,
o método deve lançar uma exceção.

a. Discussão: que tipo de exceção você considera mais adequada?
b. Implemente o método conforme decidido em (2).


*/

import java.util.regex.Pattern;

public class Senha{
    Pattern padrao;
    String senha;


    public Senha(Pattern padrao){
        this.padrao = padrao;
    }

    public void setValue(String senha){
        if (padrao.matcher(senha).find()){
            this.senha=senha;
            System.out.println("A senha segue o padrão: " + this.padrao);
        }else{
            System.out.println("Senha invalida");
        }
    }
}