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

    public static class PessoaBuild{
        private String nome;
        private String ultimonome;
        private String nomeDoMeio;
        private String apelido;
        private String nomeDoPai;

        public PessoaBuild nome(String nome){
            this.nome = nome;
            return this;
        }

        public PessoaBuild ultimonome(String ultimonome){
            this.ultimonome = ultimonome;
            return this;
        }

        public PessoaBuild nomeDoMeio(String nomeDoMeio){
            this.nomeDoMeio = nomeDoMeio;
            return this;
        }

        public PessoaBuild apelido(String apelido){
            this.apelido = apelido;
            return this;
        }

        public PessoaBuild nomeDoPai(String nomeDoPai){
            this.nomeDoPai = nomeDoPai;
            return this;
        }

        public Pessoa criarPessoa(){
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
