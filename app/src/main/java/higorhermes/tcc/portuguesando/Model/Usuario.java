package higorhermes.tcc.portuguesando.Model;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by higor on 29/05/18.
 */

public class Usuario extends RealmObject implements Serializable{
    @PrimaryKey
    private String cpf;
    private String nome, idade, email, telefone, user, senha, data_nascimento;

    public Usuario(){

    }

    public Usuario(String nome, String cpf, String email, String data_nascimento, String telefone, String user, String senha){
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.user = user;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String usuario) {
        this.user = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
