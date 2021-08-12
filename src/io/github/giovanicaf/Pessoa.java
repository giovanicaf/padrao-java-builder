package io.github.giovanicaf;

public class Pessoa {
    private String nome;
    private String ultimonome;
    private String nomeDoMeio;
    private String apelido;
    private String nomeDoPai;

    private Pessoa(String nome, String ultimonome, String nomeDoMeio, String apelido, String nomeDoPai) {
        this.nome = nome;
        this.ultimonome = ultimonome;
        this.nomeDoMeio = nomeDoMeio;
        this.apelido = apelido;
        this.nomeDoPai = nomeDoPai;
    }

    public static class PessoaBuilder{
        private String nome;
        private String ultimonome;
        private String nomeDoMeio;
        private String apelido;
        private String nomeDoPai;

        public PessoaBuilder nome(String nome){
            this.nome = nome;
            return this;
        }

        public PessoaBuilder ultimonome(String ultimonome){
            this.ultimonome = ultimonome;
            return this;
        }

        public PessoaBuilder nomeDoMeio(String nomeDoMeio){
            this.nomeDoMeio = nomeDoMeio;
            return this;
        }

        public PessoaBuilder apelido(String apelido){
            this.apelido = apelido;
            return this;
        }

        public PessoaBuilder nomeDoPai(String nomeDoPai){
            this.nomeDoPai = nomeDoPai;
            return this;
        }

        public Pessoa build(){
            return new Pessoa(nome, ultimonome, nomeDoMeio, apelido, nomeDoPai);
        }

    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", ultimonome='" + ultimonome + '\'' +
                ", nomeDoMeio='" + nomeDoMeio + '\'' +
                ", apelido='" + apelido + '\'' +
                ", nomeDoPai='" + nomeDoPai + '\'' +
                '}';
    }
}
