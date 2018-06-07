package higorhermes.tcc.portuguesando.Model;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by higor on 06/06/18.
 */

public class Assunto extends RealmObject implements Serializable{
    @PrimaryKey
    private int id;
    private String nome_assunto, sobre_assunto;
    public Assunto(){
    }

    public Assunto(int id, String nome_assunto, String sobre_assunto){
        this.id = id;
        this.nome_assunto = nome_assunto;
        this.sobre_assunto = sobre_assunto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_assunto() {
        return nome_assunto;
    }

    public void setNome_assunto(String nome_assunto) {
        this.nome_assunto = nome_assunto;
    }

    public String getSobre_assunto() {
        return sobre_assunto;
    }

    public void setSobre_assunto(String sobre_assunto) {
        this.sobre_assunto = sobre_assunto;
    }
}
