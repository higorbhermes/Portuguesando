package higorhermes.tcc.portuguesando.Model;

import io.realm.RealmObject;

/**
 * Created by higor on 06/06/18.
 */

public class Assunto extends RealmObject {
    String id, nome_assunto, sobre_assunto;
    public Assunto(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
