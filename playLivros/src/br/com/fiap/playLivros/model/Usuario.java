package br.com.fiap.playLivros.model;

public class Usuario {
    // - private => menor nível de acesso
    private String nome;
    private String foto;

    //Método getter => devolve o conteúdo do atributo
    public String getNome(){
        return nome;
    }
    //Método setter => Recebe  um valor e guarda
    // no atributo
    public void setNome(String nome){
        this.nome = nome;
    }


    public String exibirDados(){
        return foto + "Usuário: " + nome;
    }
}
