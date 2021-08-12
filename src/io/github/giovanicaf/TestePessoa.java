package io.github.giovanicaf;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder()
                .nome("Willian")
                .ultimonome("Queiroz")
                .nomeDoMeio("Suares")
                .apelido("JirayaBolado")
                .nomeDoPai("Willian")
                .build();

        System.out.println(p);
    }
}
