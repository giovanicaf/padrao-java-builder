package io.github.giovanicaf;

public class TestePessoa {

    public static void main(String[] args) {
	// write your code here
        //Pessoa p = new Pessoa("Willian", "Queiroz", "Suane", "JirayaBolado", "Willian");
        Pessoa p = new Pessoa.PessoaBuild()
                .nome("Willian")
                .ultimonome("Queiroz")
                .nomeDoMeio("Suares")
                .apelido("JirayaBolado")
                .nomeDoPai("Willian")
                .criarPessoa();

        System.out.println(p);
    }
}
